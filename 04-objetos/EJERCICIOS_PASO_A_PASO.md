# 🏗️ Ejercicios Objetos - Paso a Paso

Ejercicios progresivos para crear y trabajar con **clases y objetos**.

---

## 📖 EJERCICIO 1: Clase Persona

### 🎯 Objetivo
Crear clase `Persona` con atributos, constructor y métodos.

### 📝 Pasos

**Paso 1: Crear la clase Persona (en archivo separado)**
- Nombre archivo: `Persona.java`
- Atributos: `nombre` (String), `edad` (int)
- Constructor que reciba nombre y edad
- Getter para nombre: `getNombre()`
- Getter para edad: `getEdad()`
- Método `getInfo()` que retorne "nombre (edad años)"
- Método `esAdulto()` que retorne true si edad >= 18

**Paso 2: Crear Main (en archivo separado)**
- Nombre archivo: `CrearPersona.java`
- Crear 3 objetos Persona
- Mostrar info de cada una

### 💡 Pistas
- Usa `this.nombre = nombre` en constructor
- Los getters retornan el valor
- `String.format()` o concatenación para getInfo()

---

## 📖 EJERCICIO 2: ArrayList de Personas

### 🎯 Objetivo
ArrayList<Persona> con operaciones básicas.

**Paso 1: Crear ArrayList**
- `ArrayList<Persona> personas = new ArrayList<>();`
- Agregar 5 personas

**Paso 2: For-each para mostrar**
- Recorrer y mostrar cada `getInfo()`

**Paso 3: Buscar por nombre**
- For-each, buscar con `.equals()`
- Mostrar si encontró

**Paso 4: Filtrar adultos**
- ArrayList nueva
- Agregar solo si `esAdulto()` retorna true
- Mostrar cantidad y lista

---

## 📖 EJERCICIO 3: Ordenar Objetos

### 🎯 Objetivo
Ordenar ArrayList de Personas por edad.

**Paso 1: Crear ArrayList con personas desordenadas**

**Paso 2: Mostrar ANTES (desordenado)**
- For-each con getInfo()

**Paso 3: Ordenar por edad**
- `personas.sort((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()))`

**Paso 4: Mostrar DESPUÉS (ordenado)**
- For-each con getInfo()

---

## 📖 EJERCICIO 4: Setters y Validación

### 🎯 Objetivo
Usar setters con validación.

**Paso 1: Agregar setters a Persona**
- `setNombre(String)` - simple
- `setEdad(int)` - validar: edad > 0 y < 150

**Paso 2: En Main**
- Crear Persona
- Cambiar nombre con `setNombre()`
- Cambiar edad con `setEdad()` (válido e inválido)

---

## 📖 EJERCICIO 5: GestorPersonas (INTEGRACIÓN)

### 🎯 Objetivo
Menú completo:
1. Agregar persona
2. Ver todas
3. Buscar
4. Mostrar adultos
5. Eliminar
6. Salir

**Pasos generales:**
- Scanner para entrada
- While para menú
- Switch para opciones
- ArrayList<Persona> para guardar
- Reutilizar métodos de la clase Persona

---

## 🎯 Orden Recomendado

1. ✅ **Clase Persona** - Crear clase base
2. ✅ **ArrayList de Personas** - Colecciones
3. ✅ **Ordenar Objetos** - Conceptos avanzados
4. ✅ **Setters/Validación** - Encapsulación
5. 🔲 **GestorPersonas** - Todo junto

---

## 💡 Conceptos Clave

- Crear clase en archivo separado
- Constructor inicializa atributos
- Getters obtienen valores
- Setters cambian valores (con validación)
- ArrayList<Objeto> para guardar múltiples
- Ordenar con `.sort()` y lambda

