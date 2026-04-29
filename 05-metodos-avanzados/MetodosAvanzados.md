# 🔧 Métodos Avanzados en Java: Guía Completa

Cómo crear **métodos flexibles, reutilizables y potentes**.

---

## 📖 Índice

1. [Métodos con retorno](#métodos-con-retorno)
2. [Métodos con parámetros](#métodos-con-parámetros)
3. [Sobrecarga de métodos](#sobrecarga-de-métodos)
4. [Métodos estáticos](#métodos-estáticos)
5. [Métodos privados vs públicos](#métodos-privados-vs-públicos)

---

## Métodos con Retorno

### Sin retorno (void)

```java
public void saludar() {
    System.out.println("Hola");
}

// Uso
saludar();  // No retorna nada
```

---

### Con retorno - String

```java
public String getNombre() {
    return "Juan";
}

// Uso
String nombre = getNombre();
System.out.println(nombre);  // Juan
```

---

### Con retorno - int

```java
public int sumar(int a, int b) {
    return a + b;
}

// Uso
int resultado = sumar(5, 3);
System.out.println(resultado);  // 8
```

---

### Con retorno - boolean

```java
public boolean esAdulto(int edad) {
    return edad >= 18;
}

// Uso
if (esAdulto(25)) {
    System.out.println("Es adulto");
}
```

---

### Con retorno - double/float

```java
public double calcularMedia(double a, double b, double c) {
    return (a + b + c) / 3;
}

// Uso
double media = calcularMedia(7.5, 8.0, 9.0);
System.out.println(media);  // 8.166...
```

---

## Métodos con Parámetros

### Un parámetro

```java
public void mostrarNombre(String nombre) {
    System.out.println("Hola, " + nombre);
}

// Uso
mostrarNombre("Juan");  // Hola, Juan
```

---

### Múltiples parámetros

```java
public void mostrarPersona(String nombre, int edad, double altura) {
    System.out.println(nombre + ", " + edad + " años, " + altura + "m");
}

// Uso
mostrarPersona("Juan", 25, 1.75);
```

---

### Parámetro de otro tipo

```java
public void procesarPersona(Persona p) {
    System.out.println(p.getNombre());
}

// Uso
Persona juan = new Persona("Juan", 25);
procesarPersona(juan);
```

---

### Array como parámetro

```java
public int sumarArray(int[] numeros) {
    int suma = 0;
    for (int num : numeros) {
        suma += num;
    }
    return suma;
}

// Uso
int[] nums = {1, 2, 3, 4, 5};
int total = sumarArray(nums);
System.out.println(total);  // 15
```

---

## Sobrecarga de Métodos

**Mismo nombre, diferente lista de parámetros.**

```java
class Calculadora {
    // Método 1: suma de 2 int
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método 2: suma de 3 int
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método 3: suma de 2 double
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método 4: suma de array
    public int sumar(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }
}

// Uso - Java elige el correcto automáticamente
Calculadora calc = new Calculadora();
System.out.println(calc.sumar(5, 3));           // 8 (método 1)
System.out.println(calc.sumar(5, 3, 2));        // 10 (método 2)
System.out.println(calc.sumar(5.5, 3.2));       // 8.7 (método 3)
System.out.println(calc.sumar(new int[]{1,2,3})); // 6 (método 4)
```

---

## Métodos Estáticos

**No necesitan crear instancia de la clase.**

```java
class Matematica {
    // Método estático
    public static double redondear(double num, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.round(num * factor) / factor;
    }
}

// Uso - sin crear objeto
double resultado = Matematica.redondear(3.14159, 2);
System.out.println(resultado);  // 3.14
```

---

### Estático vs Instancia

```java
class Persona {
    private String nombre;
    static int totalPersonas = 0;  // Compartido por todas

    public Persona(String nombre) {
        this.nombre = nombre;
        totalPersonas++;  // Incrementa cada vez que se crea
    }

    // Método de instancia - usa 'this'
    public String getNombre() {
        return this.nombre;
    }

    // Método estático - NO usa 'this'
    public static int getTotalPersonas() {
        return totalPersonas;
    }
}

// Uso
Persona p1 = new Persona("Juan");
Persona p2 = new Persona("María");

System.out.println(p1.getNombre());           // Juan (instancia)
System.out.println(Persona.getTotalPersonas()); // 2 (estático)
```

---

## Métodos Privados vs Públicos

### Público

```java
public class Persona {
    public String getNombre() {
        return nombre;
    }
}

// Puedes llamarlo desde cualquier lugar
Persona p = new Persona();
p.getNombre();  // OK
```

---

### Privado

```java
public class Persona {
    private String nombre;

    // Método público
    public void setNombre(String nombre) {
        validarNombre(nombre);  // Llama a método privado
        this.nombre = nombre;
    }

    // Método privado - solo para uso interno
    private void validarNombre(String nombre) {
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre vacío");
        }
    }
}

// Uso
Persona p = new Persona();
p.setNombre("Juan");  // OK (público)
// p.validarNombre("Juan");  // ERROR - es privado
```

---

## Ejemplo Completo

```java
public class CalculadoraAvanzada {
    // Método estático - sin crear instancia
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método con array
    public static int sumar(int[] numeros) {
        return sumarArray(numeros);  // Llama método privado
    }

    // Método privado - ayuda interna
    private static int sumarArray(int[] nums) {
        int suma = 0;
        for (int num : nums) {
            suma += num;
        }
        return suma;
    }

    // Método con validación
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre 0");
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Sobrecarga - Java elige el correcto
        System.out.println(sumar(5, 3));              // 8
        System.out.println(sumar(5, 3, 2));           // 10
        System.out.println(sumar(5.5, 3.2));          // 8.7
        System.out.println(sumar(new int[]{1,2,3}));  // 6

        // Con validación
        System.out.println(dividir(10, 2));           // 5.0
        // System.out.println(dividir(10, 0));  // ERROR
    }
}
```

---

## 📋 Tabla Resumen

| Concepto | Uso | Ejemplo |
|----------|-----|---------|
| **void** | No retorna | `public void saludar()` |
| **return int** | Retorna número | `return a + b;` |
| **return String** | Retorna texto | `return nombre;` |
| **return boolean** | Retorna true/false | `return edad >= 18;` |
| **Parámetros** | Entrada de datos | `(int a, int b)` |
| **Sobrecarga** | Mismo nombre, diferente params | `sumar(int, int)` y `sumar(int, int, int)` |
| **static** | Sin instancia | `public static void main()` |
| **private** | Solo interno | `private void validar()` |
| **public** | Accesible | `public String getNombre()` |

---

## ✅ Buenas Prácticas

### 1. Nombres claros

```java
✅ BIEN:
public int calcularEdadEnAños(int añoNacimiento)

❌ MAL:
public int ce(int an)
```

### 2. Un método = una responsabilidad

```java
✅ BIEN:
private void validar(String nombre) { }
private void guardar(String nombre) { }

❌ MAL:
private void procesarTodo(String nombre) { }  // Hace dos cosas
```

### 3. Métodos pequeños y reutilizables

```java
✅ BIEN:
public double redondear(double num) { }
public void mostrar(double num) { }

❌ MAL:
public void redondearYMostrar(double num) { }  // Dos responsabilidades
```

### 4. Validar parámetros

```java
✅ BIEN:
public void setEdad(int edad) {
    if (edad < 0 || edad > 150) {
        throw new IllegalArgumentException("Edad inválida");
    }
    this.edad = edad;
}

❌ MAL:
public void setEdad(int edad) {
    this.edad = edad;  // Sin validación
}
```

### 5. Retornar en lugar de mostrar

```java
✅ BIEN:
public int sumar(int a, int b) {
    return a + b;
}

❌ MAL:
public void sumar(int a, int b) {
    System.out.println(a + b);  // Mezcla lógica con presentación
}
```

---

## 🎓 Conclusión

**Métodos avanzados permiten:**
- ✅ Código **reutilizable**
- ✅ Métodos **flexibles** (sobrecarga)
- ✅ Mejor **organización** (privado/público)
- ✅ **Validación** de entrada
- ✅ Métodos **estáticos** sin instancia

