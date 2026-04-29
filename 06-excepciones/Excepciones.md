# 🛡️ Excepciones en Java: Guía Completa

Cómo **manejar errores** de forma profesional con try-catch-finally.

---

## 📖 Índice

1. [Qué es una excepción](#qué-es-una-excepción)
2. [Try-Catch básico](#try-catch-básico)
3. [Try-Catch-Finally](#try-catch-finally)
4. [Multiple Catch](#multiple-catch)
5. [Throws](#throws)
6. [Excepciones personalizadas](#excepciones-personalizadas)

---

## Qué es una Excepción

Una **excepción** es un evento que ocurre durante la ejecución que **interrumpe** el flujo normal.

### Tipos comunes:

```java
// ArithmeticException - error matemático
int resultado = 10 / 0;  // ❌ ERROR

// NullPointerException - acceder a null
String nombre = null;
System.out.println(nombre.length());  // ❌ ERROR

// NumberFormatException - convertir texto no numérico
int edad = Integer.parseInt("abc");  // ❌ ERROR

// ArrayIndexOutOfBoundsException - índice fuera de rango
int[] nums = {1, 2, 3};
int x = nums[10];  // ❌ ERROR

// IOException - error de entrada/salida (archivos)
new FileReader("archivo_inexistente.txt");  // ❌ ERROR
```

---

## Try-Catch Básico

Atrapa el error y continúa sin que el programa falle.

### Estructura:

```java
try {
    // CÓDIGO QUE PUEDE FALLAR
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    // CÓDIGO SI FALLA
    System.out.println("❌ No se puede dividir entre 0");
}
System.out.println("✅ El programa continúa");
```

### Resultado:
```
❌ No se puede dividir entre 0
✅ El programa continúa
```

---

## Ejemplos Try-Catch

### Convertir texto a número

```java
String texto = "25";

try {
    int edad = Integer.parseInt(texto);
    System.out.println("Edad: " + edad);
} catch (NumberFormatException e) {
    System.out.println("❌ El texto no es un número válido");
}
```

---

### Acceder a array seguro

```java
int[] numeros = {10, 20, 30};
int indice = 5;

try {
    int valor = numeros[indice];
    System.out.println("Valor: " + valor);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("❌ Índice fuera de rango");
}
```

---

### Trabajar con archivos

```java
import java.io.*;

try {
    FileReader file = new FileReader("datos.txt");
    // Leer archivo
    file.close();
} catch (FileNotFoundException e) {
    System.out.println("❌ Archivo no encontrado");
} catch (IOException e) {
    System.out.println("❌ Error leyendo archivo");
}
```

---

## Try-Catch-Finally

`finally` se ejecuta **siempre**, aunque haya excepción o no.

### Estructura:

```java
try {
    // Código que puede fallar
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    // Si hay excepción
    System.out.println("❌ Error detectado");
} finally {
    // Siempre se ejecuta
    System.out.println("✅ Limpieza completada");
}
```

### Resultado:
```
❌ Error detectado
✅ Limpieza completada
```

---

### Caso: Cierre de archivo seguro

```java
import java.io.*;

FileReader file = null;

try {
    file = new FileReader("datos.txt");
    // Procesar archivo
} catch (FileNotFoundException e) {
    System.out.println("❌ Archivo no encontrado");
} finally {
    // Asegurar cierre
    if (file != null) {
        try {
            file.close();
        } catch (IOException e) {
            System.out.println("❌ Error cerrando archivo");
        }
    }
}
```

---

## Multiple Catch

Captura **diferentes excepciones** de diferentes formas.

### Estructura:

```java
try {
    // Código
} catch (ArithmeticException e) {
    // Si es división por 0
} catch (NumberFormatException e) {
    // Si es conversión inválida
} catch (Exception e) {
    // Cualquier otra excepción (debe ser última)
}
```

---

### Ejemplo completo:

```java
Scanner scanner = new Scanner(System.in);

try {
    System.out.println("Introduce un número: ");
    String entrada = scanner.nextLine();

    int numero = Integer.parseInt(entrada);  // Puede fallar
    int resultado = 100 / numero;             // Puede fallar

    System.out.println("Resultado: " + resultado);

} catch (NumberFormatException e) {
    System.out.println("❌ No es un número válido");
} catch (ArithmeticException e) {
    System.out.println("❌ No se puede dividir entre 0");
} catch (Exception e) {
    System.out.println("❌ Error inesperado: " + e.getMessage());
}
```

---

## Throws

Declara que un método **puede lanzar** una excepción (sin atraparla).

### Estructura:

```java
public void leerArchivo(String archivo) throws IOException {
    FileReader file = new FileReader(archivo);
    // ... procesar
    file.close();
}
```

---

### Quién atrapa:

```java
public static void main(String[] args) {
    try {
        leerArchivo("datos.txt");
    } catch (IOException e) {
        System.out.println("❌ Error con archivo");
    }
}
```

---

## Excepciones Personalizadas

Crear tus propias excepciones.

### Paso 1: Crear la clase

```java
public class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
```

---

### Paso 2: Lanzar la excepción

```java
public void setEdad(int edad) throws EdadInvalidaException {
    if (edad < 0 || edad > 150) {
        throw new EdadInvalidaException("Edad debe estar entre 0 y 150");
    }
    this.edad = edad;
}
```

---

### Paso 3: Atrapar la excepción

```java
public static void main(String[] args) {
    Persona p = new Persona();

    try {
        p.setEdad(25);    // OK
        p.setEdad(-5);    // ❌ Lanza excepción
    } catch (EdadInvalidaException e) {
        System.out.println("❌ " + e.getMessage());
    }
}
```

---

## Try-With-Resources

Cierre automático de recursos (Java 7+).

### Antes (manual):

```java
FileReader file = null;
try {
    file = new FileReader("datos.txt");
    // ...
} finally {
    if (file != null) file.close();
}
```

---

### Después (automático):

```java
try (FileReader file = new FileReader("datos.txt")) {
    // El archivo se cierra automáticamente
}
```

---

## 📋 Tabla Resumen

| Concepto | Uso | Ejemplo |
|----------|-----|---------|
| **try** | Envuelve código que puede fallar | `try { ... }` |
| **catch** | Atrapa una excepción específica | `catch (IOException e)` |
| **finally** | Ejecuta siempre | `finally { ... }` |
| **throws** | Declara que puede lanzar excepción | `throws IOException` |
| **throw** | Lanza una excepción | `throw new Exception()` |
| **Exception** | Clase base de excepciones | Heredar para custom |

---

## ✅ Buenas Prácticas

### 1. Capturar excepciones específicas

```java
✅ BIEN:
try {
    int n = Integer.parseInt(texto);
} catch (NumberFormatException e) {
    System.out.println("❌ Número inválido");
}

❌ MAL:
try {
    int n = Integer.parseInt(texto);
} catch (Exception e) {  // Demasiado genérico
    System.out.println("❌ Error");
}
```

---

### 2. Proporcionar mensaje claro

```java
✅ BIEN:
} catch (IOException e) {
    System.out.println("❌ No se pudo leer " + nombreArchivo);
}

❌ MAL:
} catch (IOException e) {
    System.out.println("❌ Error");
}
```

---

### 3. Usar finally para limpiar recursos

```java
✅ BIEN:
FileReader file = null;
try {
    file = new FileReader("datos.txt");
} finally {
    if (file != null) file.close();
}

❌ MAL:
FileReader file = new FileReader("datos.txt");
// Si falla, el archivo no se cierra
```

---

### 4. No ignorar excepciones

```java
✅ BIEN:
try {
    // código
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}

❌ MAL:
try {
    // código
} catch (Exception e) {
    // Silencio absoluto
}
```

---

### 5. Excepciones personalizadas para lógica

```java
✅ BIEN:
if (edad < 0) {
    throw new EdadInvalidaException("Edad negativa");
}

❌ MAL:
if (edad < 0) {
    throw new Exception("Edad negativa");  // Demasiado genérico
}
```

---

## 🎓 Conclusión

**Excepciones permiten:**
- ✅ Manejar errores de forma **profesional**
- ✅ Limpiar recursos con **finally**
- ✅ Crear excepciones **personalizadas**
- ✅ Código más **robusto**
- ✅ Mensajes de error **claros**
