# 👨‍👧 Herencia en Java: Guía Completa

Cómo **reutilizar código** creando clases que heredan de otras.

---

## 📖 Índice

1. [Concepto de herencia](#concepto-de-herencia)
2. [Extends - Clase padre e hijo](#extends---clase-padre-e-hijo)
3. [Super](#super)
4. [Override - Sobrescribir métodos](#override---sobrescribir-métodos)
5. [Polimorfismo](#polimorfismo)
6. [Clases abstractas](#clases-abstractas)

---

## Concepto de Herencia

**Herencia** = una clase **hereda** atributos y métodos de otra clase.

### Analogía:

```
Animal (clase padre)
  ├─ Perro (clase hija)
  ├─ Gato (clase hija)
  └─ Pajaro (clase hija)
```

Todos heredan de `Animal`, pero cada uno tiene su propio comportamiento.

---

## Extends - Clase Padre e Hijo

### Estructura:

```java
// CLASE PADRE
public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo");
    }
}

// CLASE HIJA (hereda de Animal)
public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);  // Llama constructor de Animal
    }

    public void traerPelota() {
        System.out.println(nombre + " trae la pelota");
    }
}
```

---

## Uso:

```java
Perro perro = new Perro("Rex", 3);
perro.dormir();       // Heredado de Animal ✅
perro.traerPelota();  // Propio de Perro ✅
```

---

## Protected vs Private

```java
public class Animal {
    private String nombre;      // ❌ Hijas NO acceden
    protected int edad;         // ✅ Hijas SÍ acceden
    public String color;        // ✅ Todos acceden
}

public class Perro extends Animal {
    public void info() {
        System.out.println(nombre);  // ❌ ERROR (private)
        System.out.println(edad);    // ✅ OK (protected)
        System.out.println(color);   // ✅ OK (public)
    }
}
```

---

## Super

`super` permite acceder a métodos y constructor de la clase padre.

### Constructor padre:

```java
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
}

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);  // Llama constructor de Animal
        this.raza = raza;
    }
}
```

---

### Método padre:

```java
public class Animal {
    public void hacer() {
        System.out.println("El animal hace algo");
    }
}

public class Perro extends Animal {
    @Override
    public void hacer() {
        super.hacer();  // Ejecuta método de Animal
        System.out.println("El perro corre");
    }
}
```

---

## Override - Sobrescribir Métodos

**Override** = la clase hija **redefine** el método del padre.

### Estructura:

```java
// PADRE
public class Animal {
    public void sonido() {
        System.out.println("Sonido genérico");
    }
}

// HIJA 1
public class Perro extends Animal {
    @Override
    public void sonido() {
        System.out.println("¡Guau guau!");
    }
}

// HIJA 2
public class Gato extends Animal {
    @Override
    public void sonido() {
        System.out.println("¡Miau miau!");
    }
}
```

---

## Uso:

```java
Animal perro = new Perro();
Animal gato = new Gato();

perro.sonido();  // ¡Guau guau!
gato.sonido();   // ¡Miau miau!
```

---

## Polimorfismo

**Polimorfismo** = el mismo método se comporta diferente según el objeto.

### Ejemplo:

```java
public class Principal {
    public static void main(String[] args) {
        // Array de animales
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Pajaro()
        };

        // Mismo método, diferente comportamiento
        for (Animal a : animales) {
            a.sonido();  // Cada uno hace su sonido
        }
    }
}
```

---

## Clases Abstractas

**Clase abstracta** = no se puede instanciar, solo heredar.

### Estructura:

```java
public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto - las hijas DEBEN implementarlo
    public abstract void sonido();

    // Método normal - las hijas lo heredan
    public void dormir() {
        System.out.println(nombre + " duerme");
    }
}
```

---

### Implementar:

```java
public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {  // OBLIGATORIO implementar
        System.out.println("¡Guau guau!");
    }
}

public static void main(String[] args) {
    // Animal a = new Animal("Genérico");  // ❌ ERROR
    Perro p = new Perro("Rex");  // ✅ OK
    p.sonido();
}
```

---

## 📊 Comparación

| Concepto | Uso | Ejemplo |
|----------|-----|---------|
| **extends** | Heredar de clase | `class Perro extends Animal` |
| **super()** | Llamar constructor padre | `super(nombre)` |
| **super.metodo()** | Llamar método padre | `super.sonido()` |
| **@Override** | Sobrescribir método | Redefine en hija |
| **protected** | Acceso solo en hijas | Datos compartidos |
| **abstract** | Fuerza implementación | Métodos obligatorios |

---

## ✅ Buenas Prácticas

### 1. Usar herencia para relaciones reales

```java
✅ BIEN:
class Perro extends Animal { }  // Perro ES un Animal

❌ MAL:
class Perro extends Coche { }   // Perro NO es un Coche
```

---

### 2. Usar protected para datos compartidos

```java
✅ BIEN:
protected String nombre;  // Las hijas acceden

❌ MAL:
private String nombre;    // Las hijas no acceden
```

---

### 3. Llamar super() en el constructor

```java
✅ BIEN:
public Perro(String nombre) {
    super(nombre);  // Inicializa padre
    // ...
}

❌ MAL:
public Perro(String nombre) {
    this.nombre = nombre;  // ¿Y el constructor padre?
}
```

---

### 4. Usar @Override para claridad

```java
✅ BIEN:
@Override
public void sonido() {
    System.out.println("¡Guau!");
}

❌ MAL:
public void sonido() {
    System.out.println("¡Guau!");
}
```

---

### 5. No profundizar demasiado

```java
✅ BIEN:
Animal
  ├─ Perro
  ├─ Gato

❌ MAL (demasiadas capas):
Animal
  └─ Mamifero
      └─ Carnivoro
          └─ Felino
              └─ Gato
```

---

## 🎓 Conclusión

**Herencia permite:**
- ✅ **Reutilizar** código
- ✅ **Evitar** duplicación
- ✅ **Organizar** clases relacionadas
- ✅ **Polimorfismo** = código flexible
- ✅ **Mantenimiento** más fácil
