# PC — Ejercicios Java (NetBeans / Swing)
 
Colección de 10 ejercicios de programación orientada a objetos en Java con interfaz gráfica Swing, desarrollados en NetBeans.
 
---
 
## Estructura del repositorio
 
```
PC/
├── Ejercicio1/
├── Ejercicio2/
├── Ejercicio3/
├── Ejercicio4/
├── Ejercicio5/
├── Ejercicio6/
├── Ejercicio7/
├── Ejercicio8/
├── Ejercicio9/
└── Ejercicio10/
```
 
Cada carpeta es un proyecto NetBeans independiente con su propio `build.xml`, `nbproject/` y código fuente en `src/`.
 
---
 
## Ejercicios
 
### Ejercicio 1 — Calculadora con Sobrecarga de Métodos
**Concepto:** Sobrecarga de métodos (method overloading).
 
La clase `Calculadora` define tres versiones del método `sum()`: suma de dos enteros, suma de tres enteros, y suma de dos doubles. La interfaz gráfica (`Vista1`) permite ingresar hasta tres números y detecta automáticamente cuál sobrecarga invocar según los campos completados y si contienen decimales.
 
**Clases:** `Calculadora`, `Vista1`, `Ejercicio1`
 
---
 
### Ejercicio 2 — Conversor de Unidades
**Concepto:** Encapsulamiento y separación de lógica/vista.
 
La clase `ClaseCalculadora` convierte un número ingresado a tres unidades distintas: Celsius → Fahrenheit, kilómetros → millas, y segundos → minutos con segundos. La vista (`Form`) tiene un botón para cada conversión y muestra el resultado en un label.
 
**Clases:** `ClaseCalculadora`, `Form`, `T1Ejercicio02`
 
---
 
### Ejercicio 3 — Contador de Objetos con Variable Estática
**Concepto:** Atributos y métodos estáticos (`static`).
 
La clase `Contador` lleva un registro global de cuántas instancias han sido creadas usando una variable estática `totalObjetos`. Cada clic en el botón "CREAR OBJETO" instancia un nuevo `Contador` e imprime el total acumulado en pantalla.
 
**Clases:** `Contador`, `Vista3`, `Ejercicio3`
 
---
 
### Ejercicio 4 — Tasa de Interés Compartida (Banco)
**Concepto:** Atributos y métodos estáticos como estado compartido.
 
La clase `ClaseInteres` almacena una tasa de interés estática (valor por defecto: 5.0%) accesible y modificable por cualquier instancia. La interfaz `VistaBanco` permite consultar la tasa actual y actualizarla mediante un campo de texto y dos botones.
 
**Clases:** `ClaseInteres`, `VistaBanco`, `Ejercicio4`
 
---
 
### Ejercicio 5 — Auto con Clase Interna
**Concepto:** Clases internas (inner classes).
 
La clase `Auto` contiene una clase interna `Motor` que retorna el tipo de motor (`"V8"`). El método `mostrarMotor()` instancia la clase interna y devuelve su valor. La vista expone este comportamiento al usuario.
 
**Clases:** `Auto` (con inner class `Motor`), `VistaAuto`, `Ejercicio5`
 
---
 
### Ejercicio 6 — Libro con Páginas (Clase Interna + Tabla)
**Concepto:** Clases internas no estáticas y uso de `JTable`.
 
La clase `Clase_libro` representa un libro con un número de páginas. Contiene la clase interna `Pagina`, que registra número de página, contenido, y fecha/hora/día de la semana al momento de su creación. Los datos se acumulan en una matriz y se muestran en un `JTable` mediante un `DefaultTableModel`.
 
**Clases:** `Clase_libro` (con inner class `Pagina`), `Vista`, `Ejercicio6`
 
---
 
### Ejercicio 7 — División con Manejo de Excepción
**Concepto:** Manejo de excepciones con `try-catch` (`ArithmeticException`).
 
La clase `Division` realiza una división entera y captura la excepción `ArithmeticException` cuando el divisor es cero, retornando un mensaje de error en lugar de lanzar la excepción al usuario. La vista recibe los dos números e imprime el resultado o el error.
 
**Clases:** `Division`, `Vista`, `Ejercicio7`
 
---
 
### Ejercicio 8 — División con Validaciones Múltiples
**Concepto:** Manejo de múltiples excepciones (`ArithmeticException`, `InputMismatchException`).
 
La clase `ClaseDivision` extiende el ejercicio anterior: valida que las entradas sean números (captura `NumberFormatException` al parsear) y que el divisor no sea cero. Retorna el resultado como `String` o el mensaje de error correspondiente.
 
**Clases:** `ClaseDivision`, `Form`, `T1Ejercicio08`
 
---
 
### Ejercicio 9 — Verificación de Edad con Excepción Personalizada
**Concepto:** Lanzamiento de excepciones personalizadas (`throw` / `IllegalArgumentException`).
 
La clase `VerificarEdad` recibe una edad como texto, la convierte a entero y expone el método `verificarEdad()` que lanza una `IllegalArgumentException` con mensaje personalizado si la edad es menor de 18. La vista captura esa excepción y muestra el mensaje de acceso denegado o un mensaje de éxito.
 
**Clases:** `VerificarEdad`, `Vista9`, `Ejercicio9`
 
---
 
### Ejercicio 10 — Lectura de Archivos con Excepciones Checked
**Concepto:** Manejo de excepciones checked con `IOException` y lectura de archivos.
 
La clase `ClaseArchivo` abre un archivo por nombre usando `FileReader` y `BufferedReader`, leyendo e imprimiendo la primera línea. El método `leerArchivo()` declara `throws IOException`, delegando el manejo al llamador. La vista permite al usuario especificar el nombre del archivo.
 
**Clases:** `ClaseArchivo`, `Vista10`, `Ejercicio10`
 
---
 
## Requisitos
 
- Java JDK 8 o superior
- NetBeans IDE (recomendado para abrir los proyectos directamente)
- Cada ejercicio es un proyecto independiente; abrir la carpeta correspondiente como proyecto en NetBeans
## Temas cubiertos
 
| Tema | Ejercicios |
|---|---|
| Sobrecarga de métodos | 1 |
| Encapsulamiento | 2, 4 |
| Atributos/métodos estáticos | 3, 4 |
| Clases internas | 5, 6 |
| Manejo de excepciones (`try-catch`) | 7, 8, 9, 10 |
| Lectura de archivos (`I/O`) | 10 |
| Interfaz gráfica Swing (`JFrame`, `JTable`) | Todos |
