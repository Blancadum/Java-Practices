# 📊 ArrayList en Java: Guía Completa

Cómo trabajar con **listas dinámicas** - lo que usaste en EACTracker.

---

## 📖 Índice

1. [¿Qué es ArrayList?](#qué-es-arraylist)
2. [Imports](#imports)
3. [Métodos principales](#métodos-principales)
4. [Recorrer ArrayList](#recorrer-arraylist)
5. [Ordenamiento](#ordenamiento)
6. [Búsqueda y filtrado](#búsqueda-y-filtrado)

---

## ¿Qué es ArrayList?

**Array:** Tamaño fijo (Java)
```java
int[] numeros = new int[5];  // Máximo 5 elementos
```

**ArrayList:** Tamaño dinámico (crece/decrece automáticamente)
```java
ArrayList<Integer> numeros = new ArrayList<>();  // Crece según necesites
```

---

## Imports

```java
import java.util.ArrayList;
import java.util.Collections;  // Para ordenar
import java.util.List;
```

---

## Métodos Principales

### 1. `new ArrayList<>()` - Crear

```java
ArrayList<String> nombres = new ArrayList<>();
ArrayList<Integer> edades = new ArrayList<>();
ArrayList<Double> precios = new ArrayList<>();
```

**El tipo entre `< >` determina qué guardas:**
- `<String>` = texto
- `<Integer>` = números enteros
- `<Double>` = números decimales
- `<Boolean>` = true/false

---

### 2. `.add()` - Agregar elemento

```java
ArrayList<String> nombres = new ArrayList<>();

nombres.add("Juan");
nombres.add("María");
nombres.add("Pedro");

// Resultado: [Juan, María, Pedro]
```

**Agregar en posición específica:**
```java
nombres.add(1, "Ana");  // Inserta en índice 1
// Resultado: [Juan, Ana, María, Pedro]
```

---

### 3. `.get()` - Obtener elemento

```java
String primer = nombres.get(0);    // Juan
String segundo = nombres.get(1);   // Ana
```

---

### 4. `.set()` - Reemplazar elemento

```java
nombres.set(1, "Carlos");  // Cambia "Ana" por "Carlos"
// Resultado: [Juan, Carlos, María, Pedro]
```

---

### 5. `.remove()` - Eliminar elemento

```java
nombres.remove(1);  // Elimina por índice
// Resultado: [Juan, María, Pedro]

nombres.remove("Pedro");  // Elimina por valor
// Resultado: [Juan, María]
```

---

### 6. `.size()` - Cantidad de elementos

```java
int cantidad = nombres.size();  // 2
```

---

### 7. `.contains()` - ¿Existe?

```java
if (nombres.contains("Juan")) {
    System.out.println("Juan está en la lista");
}
```

---

### 8. `.indexOf()` - Posición de elemento

```java
int posicion = nombres.indexOf("Juan");  // 0
int noExiste = nombres.indexOf("Zoe");   // -1 (no encontrado)
```

---

### 9. `.clear()` - Vaciar ArrayList

```java
nombres.clear();  // Elimina todos los elementos
// Resultado: []
```

---

## Recorrer ArrayList

### For tradicional

```java
for (int i = 0; i < nombres.size(); i++) {
    System.out.println(i + ". " + nombres.get(i));
}
```

**Salida:**
```
0. Juan
1. María
2. Pedro
```

---

### For-each

```java
for (String nombre : nombres) {
    System.out.println(nombre);
}
```

**Salida:**
```
Juan
María
Pedro
```

---

### While

```java
int i = 0;
while (i < nombres.size()) {
    System.out.println(nombres.get(i));
    i++;
}
```

---

## Ordenamiento

### Orden alfabético ascendente

```java
ArrayList<String> nombres = new ArrayList<>();
nombres.add("Carlos");
nombres.add("Ana");
nombres.add("Bea");

Collections.sort(nombres);
// Resultado: [Ana, Bea, Carlos]
```

---

### Orden alfabético descendente

```java
Collections.sort(nombres, Collections.reverseOrder());
// Resultado: [Carlos, Bea, Ana]
```

---

### Números ascendente

```java
ArrayList<Integer> numeros = new ArrayList<>();
numeros.add(3);
numeros.add(1);
numeros.add(2);

Collections.sort(numeros);
// Resultado: [1, 2, 3]
```

---

### Números descendente

```java
Collections.sort(numeros, Collections.reverseOrder());
// Resultado: [3, 2, 1]
```

---

### Ordenar objetos personalizados

```java
class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

ArrayList<Persona> personas = new ArrayList<>();
personas.add(new Persona("Juan", 25));
personas.add(new Persona("María", 30));
personas.add(new Persona("Pedro", 22));

// Ordenar por edad (necesitas Comparator)
personas.sort((p1, p2) -> Integer.compare(p1.edad, p2.edad));
```

---

## Búsqueda y Filtrado

### Buscar elemento

```java
ArrayList<String> nombres = new ArrayList<>();
nombres.add("Juan");
nombres.add("María");
nombres.add("Pedro");

for (String nombre : nombres) {
    if (nombre.equals("María")) {
        System.out.println("¡Encontrada!");
    }
}
```

---

### Filtrar (nuevo ArrayList con condición)

```java
ArrayList<Integer> numeros = new ArrayList<>();
numeros.add(1);
numeros.add(2);
numeros.add(3);
numeros.add(4);
numeros.add(5);

// Números mayores a 3
ArrayList<Integer> filtrados = new ArrayList<>();
for (int num : numeros) {
    if (num > 3) {
        filtrados.add(num);
    }
}

// Resultado: [4, 5]
```

---

### Contar elementos que cumplen condición

```java
int mayoresDe3 = 0;
for (int num : numeros) {
    if (num > 3) {
        mayoresDe3++;
    }
}
// mayoresDe3 = 2
```

---

## Ejemplos Prácticos

### Ejemplo 1: Crear lista y mostrar

```java
import java.util.ArrayList;

public class ListaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Mostrar
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
```

---

### Ejemplo 2: Buscar y reemplazar

```java
ArrayList<String> colores = new ArrayList<>();
colores.add("Rojo");
colores.add("Azul");
colores.add("Verde");

// Buscar "Azul" y reemplazar por "Amarillo"
for (int i = 0; i < colores.size(); i++) {
    if (colores.get(i).equals("Azul")) {
        colores.set(i, "Amarillo");
    }
}

// Resultado: [Rojo, Amarillo, Verde]
```

---

### Ejemplo 3: Filtrar y contar

```java
ArrayList<Integer> edades = new ArrayList<>();
edades.add(15);
edades.add(25);
edades.add(30);
edades.add(18);
edades.add(22);

// Contar mayores de edad (>= 18)
int mayoresDeEdad = 0;
for (int edad : edades) {
    if (edad >= 18) {
        mayoresDeEdad++;
    }
}

System.out.println("Mayores de edad: " + mayoresDeEdad);  // 4
```

---

### Ejemplo 4: Ordenar y mostrar

```java
ArrayList<String> frutas = new ArrayList<>();
frutas.add("Naranja");
frutas.add("Manzana");
frutas.add("Plátano");
frutas.add("Fresa");

Collections.sort(frutas);

for (String fruta : frutas) {
    System.out.println(fruta);
}

// Salida:
// Fresa
// Manzana
// Naranja
// Plátano
```

---

## 📋 Tabla Resumen

| Método | ¿Qué hace? | Ejemplo |
|--------|-----------|---------|
| `.add(elemento)` | Agregar al final | `lista.add("Juan")` |
| `.add(índice, elemento)` | Agregar en posición | `lista.add(0, "Ana")` |
| `.get(índice)` | Obtener elemento | `String x = lista.get(0)` |
| `.set(índice, elemento)` | Reemplazar | `lista.set(1, "Carlos")` |
| `.remove(índice)` | Eliminar por índice | `lista.remove(0)` |
| `.remove(elemento)` | Eliminar por valor | `lista.remove("Juan")` |
| `.size()` | Cantidad | `int n = lista.size()` |
| `.contains(elemento)` | ¿Existe? | `if (lista.contains("x"))` |
| `.indexOf(elemento)` | Posición | `int pos = lista.indexOf("x")` |
| `.clear()` | Vaciar | `lista.clear()` |
| `Collections.sort()` | Ordenar | `Collections.sort(lista)` |

---

## ✅ Buenas Prácticas

### 1. SIEMPRE especificar tipo

```java
✅ BIEN:
ArrayList<String> nombres = new ArrayList<>();

❌ MAL (sin tipo):
ArrayList nombres = new ArrayList();  // Warning
```

### 2. Usar for-each cuando sea posible

```java
✅ BIEN:
for (String nombre : nombres) { ... }

❌ MAL (más verbose):
for (int i = 0; i < nombres.size(); i++) { ... }
```

### 3. Comprobar `.size()` antes de acceder

```java
✅ BIEN:
if (lista.size() > 0) {
    String primero = lista.get(0);
}

❌ MAL:
String primero = lista.get(0);  // Error si está vacío
```

### 4. No modificar mientras iteras

```java
❌ MAL:
for (String nombre : nombres) {
    if (nombre.equals("Juan")) {
        nombres.remove(nombre);  // ¡ERROR!
    }
}

✅ BIEN:
ArrayList<String> aEliminar = new ArrayList<>();
for (String nombre : nombres) {
    if (nombre.equals("Juan")) {
        aEliminar.add(nombre);
    }
}
nombres.removeAll(aEliminar);
```

---

## 🎓 Conclusión

ArrayList es fundamental para:
- Guardar múltiples datos
- Ordenar datos
- Buscar y filtrar
- Procesar listas dinámicas

Lo usarás **constantemente** en Java.

