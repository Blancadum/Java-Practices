# 🏗️ Objetos y Clases en Java: Guía Completa

Cómo crear **clases personalizadas** y trabajar con **objetos**.

---

## 📖 Índice

1. [¿Qué es una clase?](#qué-es-una-clase)
2. [Estructura de una clase](#estructura-de-una-clase)
3. [Constructores](#constructores)
4. [Getters y Setters](#getters-y-setters)
5. [Métodos](#métodos)
6. [ArrayList de objetos](#arraylist-de-objetos)

---

## ¿Qué es una Clase?

Una **clase** es un **plano o modelo** para crear **objetos**.

```java
// CLASE (el plano)
class Persona {
    String nombre;
    int edad;
}

// OBJETO (la instancia)
Persona juan = new Persona();
Persona maria = new Persona();
```

**Clase = Molde**
**Objeto = Lo que sale del molde**

---

## Estructura de una Clase

### Clase Básica

```java
public class Persona {
    // ATRIBUTOS (características)
    String nombre;
    int edad;
    double altura;

    // CONSTRUCTOR (inicializa el objeto)
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // MÉTODOS (acciones)
    public void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    public String getInfo() {
        return nombre + " (" + edad + " años)";
    }
}
```

### Crear y usar objetos

```java
public class Main {
    public static void main(String[] args) {
        // Crear objeto
        Persona juan = new Persona("Juan", 25, 1.75);

        // Acceder a atributos
        System.out.println(juan.nombre);  // Juan
        System.out.println(juan.edad);    // 25

        // Usar métodos
        juan.saludar();                    // Hola, me llamo Juan
        System.out.println(juan.getInfo()); // Juan (25 años)
    }
}
```

---

## Constructores

Un **constructor** es un método especial que **inicializa** el objeto cuando lo creas.

### Constructor sin parámetros

```java
class Persona {
    String nombre;
    int edad;

    // Constructor vacío
    public Persona() {
        nombre = "Sin nombre";
        edad = 0;
    }
}

// Uso
Persona p = new Persona();  // Llama al constructor
System.out.println(p.nombre);  // Sin nombre
```

---

### Constructor con parámetros

```java
class Persona {
    String nombre;
    int edad;

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;  // this = este objeto
        this.edad = edad;
    }
}

// Uso
Persona juan = new Persona("Juan", 25);
```

**¿Por qué `this`?**
```java
public Persona(String nombre, int edad) {
    this.nombre = nombre;  // Asignar parámetro a atributo
}

// Sin this sería confuso:
// nombre = nombre;  // ¿Cuál es cuál?
```

---

### Múltiples constructores

```java
class Persona {
    String nombre;
    int edad;

    // Constructor 1: con 2 parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor 2: con 1 parámetro
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;  // Por defecto
    }

    // Constructor 3: sin parámetros
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }
}

// Uso
Persona p1 = new Persona("Juan", 25);
Persona p2 = new Persona("María");
Persona p3 = new Persona();
```

---

## Getters y Setters

**Getters** = obtener un valor
**Setters** = establecer un valor

```java
class Persona {
    private String nombre;  // private = solo accesible dentro de la clase
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // GETTER para nombre
    public String getNombre() {
        return nombre;
    }

    // SETTER para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // GETTER para edad
    public int getEdad() {
        return edad;
    }

    // SETTER para edad (con validación)
    public void setEdad(int edad) {
        if (edad > 0 && edad < 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida");
        }
    }
}

// Uso
Persona juan = new Persona("Juan", 25);

System.out.println(juan.getNombre());  // Juan
juan.setNombre("Carlos");
System.out.println(juan.getNombre());  // Carlos

juan.setEdad(30);  // OK
juan.setEdad(200); // Error: Edad no válida
```

---

## Métodos

### Método sin retorno

```java
class Persona {
    String nombre;

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

// Uso
Persona juan = new Persona();
juan.nombre = "Juan";
juan.saludar();  // Hola, soy Juan
```

---

### Método con retorno

```java
class Persona {
    String nombre;
    int edad;

    public String getInfo() {
        return nombre + " (" + edad + " años)";
    }

    public boolean esAdulto() {
        return edad >= 18;
    }
}

// Uso
Persona juan = new Persona();
juan.nombre = "Juan";
juan.edad = 25;

System.out.println(juan.getInfo());  // Juan (25 años)
if (juan.esAdulto()) {
    System.out.println("Es adulto");
}
```

---

### Método con parámetros

```java
class Persona {
    String nombre;
    int edad;

    public void cumpleaños() {
        edad++;
    }

    public void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public boolean tieneEdad(int edadAComparar) {
        return edad == edadAComparar;
    }
}

// Uso
Persona juan = new Persona();
juan.nombre = "Juan";
juan.edad = 25;

juan.cumpleaños();
System.out.println(juan.edad);  // 26

juan.cambiarNombre("Carlos");
System.out.println(juan.nombre);  // Carlos

if (juan.tieneEdad(26)) {
    System.out.println("Tiene 26");
}
```

---

## ArrayList de Objetos

### Crear ArrayList de objetos

```java
ArrayList<Persona> personas = new ArrayList<>();

// Agregar objetos
personas.add(new Persona("Juan", 25));
personas.add(new Persona("María", 30));
personas.add(new Persona("Pedro", 22));
```

---

### Recorrer ArrayList de objetos

```java
// For-each
for (Persona p : personas) {
    System.out.println(p.getNombre() + " tiene " + p.getEdad());
}

// For tradicional
for (int i = 0; i < personas.size(); i++) {
    Persona p = personas.get(i);
    System.out.println(p.getNombre());
}
```

---

### Buscar objeto

```java
// Buscar por nombre
for (Persona p : personas) {
    if (p.getNombre().equals("Juan")) {
        System.out.println("Encontrado: " + p.getInfo());
    }
}
```

---

### Filtrar objetos

```java
// ArrayList con mayores de edad
ArrayList<Persona> mayores = new ArrayList<>();

for (Persona p : personas) {
    if (p.getEdad() >= 18) {
        mayores.add(p);
    }
}

System.out.println("Mayores de edad: " + mayores.size());
```

---

### Ordenar objetos

```java
// Ordenar por edad (necesita Comparable o Comparator)
personas.sort((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));

// Mostrar ordenado
for (Persona p : personas) {
    System.out.println(p.getNombre() + " - " + p.getEdad());
}
```

---

## Ejemplo Completo

```java
import java.util.ArrayList;

// CLASE
class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }

    // Métodos
    public String getInfo() {
        return nombre + " (" + edad + " años)";
    }

    public boolean esAdulto() {
        return edad >= 18;
    }
}

// PROGRAMA
public class Main {
    public static void main(String[] args) {
        // Crear ArrayList
        ArrayList<Persona> personas = new ArrayList<>();

        // Agregar objetos
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Pedro", 16));

        // Mostrar todos
        System.out.println("=== TODAS ===");
        for (Persona p : personas) {
            System.out.println(p.getInfo());
        }

        // Mostrar solo adultos
        System.out.println("\n=== ADULTOS ===");
        for (Persona p : personas) {
            if (p.esAdulto()) {
                System.out.println(p.getNombre());
            }
        }

        // Ordenar por edad
        personas.sort((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));
        System.out.println("\n=== ORDENADO POR EDAD ===");
        for (Persona p : personas) {
            System.out.println(p.getInfo());
        }
    }
}
```

**Salida:**
```
=== TODAS ===
Juan (25 años)
María (30 años)
Pedro (16 años)

=== ADULTOS ===
Juan
María

=== ORDENADO POR EDAD ===
Pedro (16 años)
Juan (25 años)
María (30 años)
```

---

## 📋 Tabla Resumen

| Concepto | Uso |
|----------|-----|
| **Clase** | Plano para crear objetos |
| **Constructor** | Inicializa el objeto |
| **Atributo** | Característica del objeto |
| **Método** | Acción que puede hacer el objeto |
| **Getter** | Obtener valor de atributo |
| **Setter** | Cambiar valor de atributo |
| **new** | Crear nuevo objeto |
| **this** | Referencia al objeto actual |

---

## ✅ Buenas Prácticas

### 1. Usar private para atributos

```java
✅ BIEN:
class Persona {
    private String nombre;  // Solo accesible dentro
    public String getNombre() { return nombre; }
}

❌ MAL:
class Persona {
    public String nombre;  // Accesible desde cualquier lugar
}
```

### 2. Siempre crear getters/setters

```java
✅ BIEN:
public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }

❌ MAL:
p.nombre = "Juan";  // Acceso directo
```

### 3. Constructor con parámetros

```java
✅ BIEN:
Persona p = new Persona("Juan", 25);

❌ MAL:
Persona p = new Persona();
p.nombre = "Juan";
p.edad = 25;
```

---

## 🎓 Conclusión

**Una clase es:**
- Un **plano** que defines una sola vez
- Contiene **atributos** (características)
- Contiene **métodos** (acciones)
- Se crea con **constructores**
- Se accede con **getters/setters**

**Un objeto es:**
- Una **instancia** de una clase
- Creado con `new`
- Tiene sus propios valores en los atributos

**ArrayList de objetos:**
- Listas dinámicas de objetos
- Filtrar, buscar, ordenar objetos
- Combina todo lo aprendido

