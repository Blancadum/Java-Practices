# Scanner en Java: Guía Completa

Documento de referencia sobre la clase `Scanner` de Java para leer entrada del usuario desde la consola.

---

## 📖 Índice
1. [¿Qué es Scanner?](#qué-es-scanner)
2. [Inicialización](#inicialización)
3. [Métodos principales](#métodos-principales)
4. [Ejemplos prácticos](#ejemplos-prácticos)
5. [Buenas prácticas](#buenas-prácticas)

---

## ¿Qué es Scanner?

`Scanner` es una clase de Java que **lee entrada del usuario desde la consola** (teclado).

- Pertenece al paquete `java.util`
- Permite leer diferentes tipos de datos: String, int, float, double, boolean
- Es la forma más común de interactuar con el usuario en programas Java básicos

---

## Inicialización

### Crear un Scanner

```java
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        // Crear Scanner que lee del teclado
        Scanner scanner = new Scanner(System.in);

        // Usar scanner...

        // SIEMPRE cerrar al final (buena práctica)
        scanner.close();
    }
}
```

**¿Qué significa cada parte?**

| Parte | Significado |
|-------|------------|
| `Scanner` | La clase que permite leer |
| `scanner` | El nombre que LE DAS a tu objeto (puedes cambiar) |
| `System.in` | El teclado (entrada estándar) |
| `new` | Crear una instancia nueva |
| `scanner.close()` | Cerrar el Scanner (liberar recursos) |

---

## Métodos Principales

### 1. `nextLine()` - Leer una línea de texto

**¿Qué hace?**
Lee una línea completa de texto (incluyendo espacios) hasta que presiones ENTER.

```java
Scanner scanner = new Scanner(System.in);

System.out.println("¿Cuál es tu nombre?");
String nombre = scanner.nextLine();  // Espera hasta ENTER

System.out.println("Hola, " + nombre);
```

**Ejemplo de ejecución:**
```
¿Cuál es tu nombre?
Juan Pérez
Hola, Juan Pérez
```

**Características:**
- ✅ Lee TODO hasta ENTER (incluyendo espacios)
- ✅ Retorna un `String`
- ⚠️ Si usas `nextInt()` antes, debes llamar a `nextLine()` para limpiar el buffer

---

### 2. `nextInt()` - Leer un número entero

**¿Qué hace?**
Lee un número entero (int) del teclado.

```java
Scanner scanner = new Scanner(System.in);

System.out.println("¿Cuántos años tienes?");
int edad = scanner.nextInt();  // Lee solo el número

System.out.println("Tu edad es: " + edad);
```

**Ejemplo de ejecución:**
```
¿Cuántos años tienes?
25
Tu edad es: 25
```

**Características:**
- ✅ Lee solo el número (ignora espacios iniciales)
- ✅ Retorna un `int`
- ⚠️ Si escribes algo que NO es número → `InputMismatchException`
- ⚠️ **PROBLEMA:** deja el salto de línea (`\n`) en el buffer
  - **SOLUCIÓN:** después de `nextInt()`, llama a `nextLine()`

---

### 3. `nextFloat()` - Leer un número decimal

**¿Qué hace?**
Lee un número decimal (float) del teclado.

```java
Scanner scanner = new Scanner(System.in);

System.out.println("¿Cuál es tu altura en metros?");
float altura = scanner.nextFloat();  // Lee 1.75

System.out.println("Tu altura es: " + altura);
```

**Ejemplo de ejecución:**
```
¿Cuál es tu altura en metros?
1.75
Tu altura es: 1.75
```

**Características:**
- ✅ Lee números decimales (punto decimal)
- ✅ También acepta enteros (los convierte a float)
- ✅ Retorna un `float`
- ⚠️ Mismos problemas que `nextInt()`

---

### 4. `nextDouble()` - Leer un número decimal (precisión)

**¿Qué hace?**
Como `nextFloat()` pero con mayor precisión (más decimales).

```java
Scanner scanner = new Scanner(System.in);

System.out.println("¿Cuál es el precio?");
double precio = scanner.nextDouble();  // 19.99

System.out.println("Precio: " + precio);
```

**Características:**
- ✅ Mayor precisión que `float`
- ✅ Usa punto decimal (.)
- ⚠️ Mismo problema del buffer que `nextInt()` y `nextFloat()`

---

### 5. `nextBoolean()` - Leer true/false

**¿Qué hace?**
Lee un valor booleano (true o false).

```java
Scanner scanner = new Scanner(System.in);

System.out.println("¿Eres mayor de edad? (true/false):");
boolean esAdulto = scanner.nextBoolean();

if (esAdulto) {
    System.out.println("Acceso permitido");
} else {
    System.out.println("Acceso denegado");
}
```

**Ejemplo de ejecución:**
```
¿Eres mayor de edad? (true/false):
true
Acceso permitido
```

**Características:**
- ✅ Lee `true` o `false`
- ⚠️ Muy pocas veces se usa en entrada del usuario
- ⚠️ El usuario tiene que escribir exactamente "true" o "false"

---

### 6. `hasNextInt()` - Comprobar si es un número

**¿Qué hace?**
**Antes de leer**, comprueba si lo siguiente es un número entero.

Retorna `true` o `false` sin consumir la entrada.

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Introduce un número:");

if (scanner.hasNextInt()) {
    int numero = scanner.nextInt();
    System.out.println("Número válido: " + numero);
} else {
    System.out.println("Error: No es un número");
}
```

**Ejemplo de ejecución:**
```
Introduce un número:
25
Número válido: 25

---

Introduce un número:
abc
Error: No es un número
```

**Características:**
- ✅ NO consume la entrada (no avanza el scanner)
- ✅ Retorna `boolean` (true/false)
- ✅ Perfecto para VALIDAR antes de leer

---

### 7. `hasNextFloat()` - Comprobar si es decimal

**¿Qué hace?**
Comprueba si lo siguiente es un número decimal (float).

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Introduce un número decimal:");

if (scanner.hasNextFloat()) {
    float numero = scanner.nextFloat();
    System.out.println("Número válido: " + numero);
} else {
    System.out.println("Error: No es un decimal");
}
```

**Características:**
- ✅ NO consume la entrada
- ✅ Acepta números con punto (1.5, 3.14, etc.)
- ✅ También acepta enteros (5 → 5.0)

---

### 8. `hasNextLine()` - Comprobar si hay línea

**¿Qué hace?**
Comprueba si hay una línea disponible para leer.

**Raramente se usa**, pero útil en lectura de ficheros.

```java
Scanner scanner = new Scanner(System.in);

if (scanner.hasNextLine()) {
    String linea = scanner.nextLine();
    System.out.println("Leí: " + linea);
}
```

---

### 9. `next()` - Leer una palabra

**¿Qué hace?**
Lee UNA PALABRA (hasta encontrar espacio o salto de línea).

```java
Scanner scanner = new Scanner(System.in);

System.out.println("Introduce tu nombre:");
String nombre = scanner.next();  // Solo PRIMERA palabra

System.out.println("Nombre: " + nombre);
```

**Ejemplo de ejecución:**
```
Introduce tu nombre:
Juan Pérez
Nombre: Juan        (← solo "Juan", ignora "Pérez")
```

**Características:**
- ✅ Lee solo una palabra (hasta espacio)
- ✅ Ignora espacios iniciales
- ⚠️ Si usas `next()` y luego `nextLine()`, tendrás problemas
- ❌ **NO RECOMENDADO** (usa `nextLine()` siempre)

---

### 10. `close()` - Cerrar Scanner

**¿Qué hace?**
Cierra el Scanner y libera los recursos.

```java
Scanner scanner = new Scanner(System.in);

// ... usar scanner ...

scanner.close();  // ← IMPORTANTE al final
```

**Características:**
- ✅ Buena práctica: siempre cerrar recursos
- ✅ Libera memoria
- ⚠️ Después de `close()`, NO puedes usar el scanner

---

## Ejemplos Prácticos

### Ejemplo 1: Leer nombre y edad (BÁSICO)

```java
import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = scanner.nextLine();

        System.out.println("¿Cuántos años tienes?");
        int edad = scanner.nextInt();
        scanner.nextLine();  // ← IMPORTANTE: limpiar buffer

        System.out.println("Hola " + nombre + ", tienes " + edad + " años");

        scanner.close();
    }
}
```

**Ejecución:**
```
¿Cuál es tu nombre?
Juan
¿Cuántos años tienes?
25
Hola Juan, tienes 25 años
```

---

### Ejemplo 2: Validar entrada (INTERMEDIO)

```java
import java.util.Scanner;

public class ValidarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = -1;

        while (true) {
            System.out.println("Introduce un número entre 1 y 10:");

            // VALIDAR que es número
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();

                // VALIDAR que está en rango
                if (numero >= 1 && numero <= 10) {
                    System.out.println("✓ Número válido: " + numero);
                    break;
                } else {
                    System.out.println("✗ Error: Debe estar entre 1 y 10");
                }
            } else {
                System.out.println("✗ Error: No es un número");
                scanner.nextLine();  // ← Limpiar entrada inválida
            }
        }

        scanner.close();
    }
}
```

**Ejecución:**
```
Introduce un número entre 1 y 10:
abc
✗ Error: No es un número
Introduce un número entre 1 y 10:
15
✗ Error: Debe estar entre 1 y 10
Introduce un número entre 1 y 10:
5
✓ Número válido: 5
```

---

### Ejemplo 3: Leer múltiples líneas (AVANZADO)

```java
import java.util.Scanner;
import java.util.ArrayList;

public class LeerMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (true) {
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            nombres.add(nombre);
        }

        System.out.println("\nNombres guardados:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i));
        }

        scanner.close();
    }
}
```

**Ejecución:**
```
Introduce nombres (escribe 'fin' para terminar):
Juan
María
Pedro
fin

Nombres guardados:
1. Juan
2. María
3. Pedro
```

---

## ⚠️ Problemas Comunes y Soluciones

### Problema 1: "Salto de línea" en el buffer

**¿Qué pasa?**
```java
int edad = scanner.nextInt();  // Lees 25 y presionas ENTER
String nombre = scanner.nextLine();  // ← Se queda vacío (lee el \n)
```

**Solución:**
```java
int edad = scanner.nextInt();
scanner.nextLine();  // ← Limpiar el \n
String nombre = scanner.nextLine();  // ← Ahora funciona
```

---

### Problema 2: InputMismatchException

**¿Qué pasa?**
```java
int numero = scanner.nextInt();  // El usuario escribe "abc"
// → ¡ERROR! Exception lanzada
```

**Solución:**
```java
if (scanner.hasNextInt()) {
    int numero = scanner.nextInt();
} else {
    scanner.nextLine();  // Limpiar entrada inválida
    System.out.println("Error: No es un número");
}
```

---

### Problema 3: Usar `next()` en lugar de `nextLine()`

**❌ MAL:**
```java
String nombre = scanner.next();  // Si escribes "Juan Pérez", lee solo "Juan"
```

**✅ BIEN:**
```java
String nombre = scanner.nextLine();  // Lee "Juan Pérez" completo
```

---

## ✅ Buenas Prácticas

### 1. **Siempre validar entrada**
```java
if (scanner.hasNextInt()) {
    // entrada válida
} else {
    // entrada inválida
}
```

### 2. **Siempre limpiar el buffer después de nextInt/nextFloat**
```java
int numero = scanner.nextInt();
scanner.nextLine();  // ← OBLIGATORIO si viene nextLine() después
```

### 3. **Usar nextLine() para Strings**
```java
String texto = scanner.nextLine();  // ✅ Correcto
String texto = scanner.next();      // ❌ Evitar
```

### 4. **Siempre cerrar Scanner**
```java
Scanner scanner = new Scanner(System.in);
// ... usar scanner ...
scanner.close();  // ← IMPORTANTE
```

### 5. **Mensajes claros para el usuario**
```java
System.out.println("Introduce un número entre 1 y 10:");  // ✅ Claro
System.out.println("Número?");                            // ❌ Confuso
```

---

## 📋 Tabla Resumen

| Método | Lee | Retorna | Problema |
|--------|-----|---------|----------|
| `nextLine()` | Línea completa | String | Ninguno |
| `nextInt()` | Número entero | int | Deja \n en buffer |
| `nextFloat()` | Número decimal | float | Deja \n en buffer |
| `nextDouble()` | Número decimal (precisión) | double | Deja \n en buffer |
| `next()` | Una palabra | String | No lee espacios |
| `nextBoolean()` | true/false | boolean | Raro de usar |
| `hasNextInt()` | Comprueba si es int | boolean | No consume |
| `hasNextFloat()` | Comprueba si es float | boolean | No consume |
| `hasNextLine()` | Comprueba si hay línea | boolean | No consume |
| `close()` | Cierra scanner | — | Luego no funciona |

---

## 🎓 Conclusión

**Scanner es la herramienta básica para leer entrada del usuario en Java.**

**Puntos clave:**
1. ✅ Siempre importar: `import java.util.Scanner;`
2. ✅ Crear: `Scanner scanner = new Scanner(System.in);`
3. ✅ Validar antes de leer: `hasNextInt()`, etc.
4. ✅ Limpiar buffer si es necesario: `scanner.nextLine()`
5. ✅ Cerrar: `scanner.close();`

**Para aplicaciones serias, considera otras opciones como `BufferedReader` o frameworks de línea de comandos, pero Scanner es perfecta para aprender Java básico.**

---

**Autor:** Blanca - Estudiante CFGS DAM/DAW
**Propósito:** Referencia para consolidar conocimientos de Java
