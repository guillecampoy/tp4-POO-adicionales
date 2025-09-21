# Trabajo Práctico 4 – Programación Orientada a Objetos - ejercicios adicionales

> **Cátedra:** Programación II  
> **Alumno:** Guillermo Campoy  
> **Docente:** Giuliano Espejo  
> **Año/Cuat.**: 2025 / 2C  
> **Lenguaje:** Java (>= 21)
>
## 📌 Objetivo
Implementar **ejercicios adicionales unidad 4** aplicando conceptos avanzados de **Programación Orientada a Objetos (POO)** en Java:

- Uso de `this` en constructores y métodos.
- Constructores sobrecargados.
- Métodos sobrecargados.
- Método `toString()`.
- Encapsulamiento (getters y setters).
- Atributos y métodos estáticos.

---

## 📂 Estructura del Proyecto

```bash
TP4-POO-adicionales/
├── src/
│   ├── core/
│   │   ├── Libro.java                      # Clase para modelar libros con atributos, constructores y lógica
│   │   ├── Alumno.java                     # Clase para modelar alumnos con atributos, constructores y lógica
│   │   ├── Producto.java                   # Clase para modelar productos con atributos, constructores y lógica
│   │   ├── Cuenta.java                     # Clase para modelar cuentas con atributos, constructores y lógica
│   │   └── Ejecutable.java                 # Interfaz con método ejecutar()
│   │
│   ├── app/
│   │   └── Main.java                       # Clase con método main, crea y prueba empleados
│   │
│   ├── features/
│   │   ├── libro/
│   │   │    ├── CrearLibros.java            # Crear libros con y sin editorial explícita.
│   │   │    ├── ActualizarLibros.java       # Usar las dos variantes de actualizarTitulo.
│   │   │    └── CambioEditorial.java        # Cambiar la editorial global y volver a mostrar.
│   │   ├── alumno/
│   │   │    ├── CrearAlumnos.java           # Crear alumnos utilizando las variantes de constructores.
│   │   │    ├── ActualizarPromedios.java    # Usar las dos variantes de actualizarTitulo.
│   │   │    ├── ImprimirResultados.java     # Imprime resultados y verifica quien aprueba.
│   │   │    └── CambioNotaAprobacion.java   # Cambiar la nota aprobación y re probar.                      
│   │   ├── producto/
│   │   │    ├── CrearProductos.java         # Crear productos utilizando las variantes de constructores.
│   │   │    ├── AplicarDescuento.java       # Aplicar descuetos utilizando todas las variantes.
│   │   │    └── CambioIVA.java              # Cambiar el IVA y re calcular precios.
│   │   └── cuenta/
│   │        ├── CrearCuentass.java          # Crear cuentas utilizando las variantes de constructores.
│   │        ├── ConsultarSaldo.java         # Consultar saldo en sus variantes posibles de consulta.
│   │        └── TotalCuentasCreadas.java    # Muestra el total de cuentas creadas utilizando el atributo de tipo estático de la clase Cuenta.                                                  
│   └── utils/
│      ├── ContextColor.java                # Enumerado para establecer contextos para mensajes
│      └── UtilsColor.java                  # Utilitarios para impresión con colores
├── README.md
└── .gitignore
```

---

## 📖 Desarrollo

### Clase **Libro**
- Atributos privados:
    - `tbd`

- Constructores:
    - tbd

- Métodos:
    - `tbd(test)`


- Encapsulamiento con getters y setters.

### Clase **Alumno**
- Atributos privados:
    - `tbd`

- Constructores:
    - tbd

- Métodos:
    - `tbd(test)`


- Encapsulamiento con getters y setters.

### Clase **Producto**
- Atributos privados:
    - `tbd`

- Constructores:
    - tbd

- Métodos:
    - `tbd(test)`


- Encapsulamiento con getters y setters.

### Clase **Cuenta**
- Atributos privados:
    - `tbd`

- Constructores:
    - tbd

- Métodos:
    - `tbd(test)`


- Encapsulamiento con getters y setters.

---

### Clase **Main**, con menú que permite:
- TBD - WIP


En todas las opciones se hace uso del método toString() del objeto para mostrar los resultados.

---

### Interfaz **Ejecutable**
```java
public interface Ejecutable {
    void ejecutar();
}
```

Todas las clases features, casos de uso, implementan esta interfaz para mantener consistencia en la ejecución.

---
✍️ **Autor:** Guillermo Campoy  
📅 **Año:** 2025