package utils;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public final class UtilsMoneda {
    private UtilsMoneda() {}

    public static final Locale LOCALE_AR = Locale.of("es", "AR");
    public static final Currency ARS = Currency.getInstance("ARS");
    private static final int SCALE = ARS.getDefaultFractionDigits(); // 2
    private static final double POW10 = Math.pow(10, SCALE);         // 100.0

    // NumberFormat NO es thread-safe → usar ThreadLocal
    // Esta recomendación la obtuve discutiendo la solución con IA
    private static final ThreadLocal<NumberFormat> ARS_FORMAT =
            ThreadLocal.withInitial(() -> {
                NumberFormat numeroFormateado = NumberFormat.getCurrencyInstance(LOCALE_AR);
                numeroFormateado.setCurrency(ARS);
                numeroFormateado.setGroupingUsed(true);
                numeroFormateado.setMinimumFractionDigits(SCALE);
                numeroFormateado.setMaximumFractionDigits(SCALE);
                return numeroFormateado;
            });

    /** Redondeo HALF_UP a 'SCALE' decimales trabajando solo con double. */
    public static double roundArs(double amount) {
        return Math.rint(amount * POW10 + (amount >= 0 ? 0.5 : -0.5)) / POW10;
    }

    /** Formatea en ARS con símbolo y separadores locales. */
    public static String formatCurrency(double amount) {
        // Aseguramos 2 decimales antes de formatear
        double rounded = roundArs(amount);
        return ARS_FORMAT.get().format(rounded);
    }

    // --- IVA ---
    private static final ThreadLocal<NumberFormat> PCT_FORMAT =
            ThreadLocal.withInitial(() -> {
                NumberFormat pf = NumberFormat.getPercentInstance(LOCALE_AR);
                pf.setGroupingUsed(false); // "21%" sin separadores
                // Por defecto sin decimales; se ajusta por llamada si hace falta
                pf.setMinimumFractionDigits(0);
                pf.setMaximumFractionDigits(0);
                return pf;
            });

    /**
     * "21%" a partir de 0.21. Ajusta decimales de forma inteligente:
     * - si es entero (p.ej. 0.21 -> 21%), usa 0 decimales;
     * - si no, muestra hasta 2 (p.ej. 0.105 -> 10,50%).
     */
    public static String getDecoradoIVA(double tasa) {
        NumberFormat pf = PCT_FORMAT.get();
        double pct = tasa * 100.0;
        boolean esEntero = Math.abs(pct - Math.rint(pct)) < 1e-9;

        if (esEntero) {
            pf.setMinimumFractionDigits(0);
            pf.setMaximumFractionDigits(0);
        } else {
            pf.setMinimumFractionDigits(2);
            pf.setMaximumFractionDigits(2);
        }
        return pf.format(tasa);
    }
}
