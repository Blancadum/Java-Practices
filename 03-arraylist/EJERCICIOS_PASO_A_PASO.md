# 📊 Ejercicios ArrayList - Paso a Paso

Ejercicios progresivos sobre **listas dinámicas, búsqueda y ordenamiento**.

---

## 📖 EJERCICIO 1: ListaNumeros.java

### 🎯 Objetivo
Crear ArrayList de números, agregar elementos y mostrar con índices.

### 📥 Entrada
Agregamos 5 números: 10, 25, 15, 30, 20

### 📤 Salida Esperada
```
=== LISTA DE NÚMEROS ===
0. 10
1. 25
2. 15
3. 30
4. 20
```

### 📝 Pasos

**Paso 1: Imports**
- `import java.util.ArrayList;`

**Paso 2: Crear ArrayList de Integer**
- `ArrayList<Integer> numeros = new ArrayList<>();`

**Paso 3: Agregar 5 números**
- Usa `.add()` cinco veces
- Números: 10, 25, 15, 30, 20

**Paso 4: Mostrar encabezado**
- "=== LISTA DE NÚMEROS ==="

**Paso 5: Mostrar con índices**
- For tradicional: `for (int i = 0; i < numeros.size(); i++)`
- Muestra: `i + ". " + numeros.get(i)`

**Paso 6: Mostrar tamaño al final**
- "Total: " + `.size()`

### 💡 Pistas
- `.size()` retorna cantidad de elementos
- `.get(i)` obtiene elemento en índice i
- Índices empiezan en 0

---

## 📖 EJERCICIO 2: BuscarNumero.java

### 🎯 Objetivo
Buscar si un número existe en la ArrayList y mostrar su posición.

### 📥 Entrada
- ArrayList: [10, 25, 15, 30, 20]
- Número a buscar: 15

### 📤 Salida Esperada
```
Buscando: 15
✅ Encontrado en posición 2
```

O si no existe:
```
Buscando: 50
❌ No encontrado
```

### 📝 Pasos

**Paso 1: Crear ArrayList y agregar números**
- [10, 25, 15, 30, 20]

**Paso 2: Número a buscar**
- Variable con valor a buscar

**Paso 3: Buscar con indexOf()**
- `int posicion = numeros.indexOf(numero_buscado)`
- Si retorna -1 = no existe

**Paso 4: Mostrar resultado**
- Si posición != -1: "✅ Encontrado en posición " + posición
- Si posición == -1: "❌ No encontrado"

### 💡 Pistas
- `.indexOf()` retorna -1 si no existe
- `.indexOf()` retorna 0 si está en primera posición (no confundir con -1)

---

## 📖 EJERCICIO 3: OrdenarNumeros.java

### 🎯 Objetivo
Mostrar ArrayList desordenado y luego ordenado.

### 📥 Entrada
[30, 10, 25, 15, 20]

### 📤 Salida Esperada
```
=== ANTES (desordenado) ===
30, 10, 25, 15, 20

=== DESPUÉS (ordenado) ===
10, 15, 20, 25, 30
```

### 📝 Pasos

**Paso 1: Imports**
- `import java.util.ArrayList;`
- `import java.util.Collections;`

**Paso 2: Crear ArrayList con números desordenados**
- [30, 10, 25, 15, 20]

**Paso 3: Mostrar ANTES**
- "=== ANTES (desordenado) ==="
- Recorre con for-each y muestra separados por coma

**Paso 4: Ordenar**
- `Collections.sort(numeros)`

**Paso 5: Mostrar DESPUÉS**
- "=== DESPUÉS (ordenado) ==="
- Recorre nuevamente

### 💡 Pistas
- `Collections.sort()` ordena ascendente
- Para descendente: `Collections.sort(lista, Collections.reverseOrder())`
- For-each es más limpio aquí

---

## 📖 EJERCICIO 4: FiltrarNumeros.java

### 🎯 Objetivo
Crear nuevo ArrayList solo con números mayores a 20.

### 📥 Entrada
[10, 25, 15, 30, 20, 35, 5]

### 📤 Salida Esperada
```
=== NÚMEROS MAYORES A 20 ===
25, 30, 35
```

### 📝 Pasos

**Paso 1: Crear ArrayList original**
- [10, 25, 15, 30, 20, 35, 5]

**Paso 2: Crear ArrayList nuevo para filtrados**
- `ArrayList<Integer> filtrados = new ArrayList<>();`

**Paso 3: For-each para filtrar**
- `for (int num : original)`
- Si `num > 20`: agregar a filtrados

**Paso 4: Mostrar encabezado**
- "=== NÚMEROS MAYORES A 20 ==="

**Paso 5: Mostrar filtrados**
- For-each o for tradicional
- Separados por coma

### 💡 Pistas
- Crea ArrayList NUEVA (no modifiques la original)
- `.add()` al nuevo ArrayList
- Usa condición `if (num > 20)`

---

## 📖 EJERCICIO 5: ContarYFiltrar.java

### 🎯 Objetivo
Contar cuántos elementos cumplen una condición y mostrarlos.

### 📥 Entrada
ArrayList de edades: [15, 25, 17, 30, 16, 22, 18]

### 📤 Salida Esperada
```
Total de edades: 7
Mayores de edad (>= 18): 4
Menores de edad (< 18): 3

Mayores de edad: 25, 30, 22, 18
Menores de edad: 15, 17, 16
```

### 📝 Pasos

**Paso 1: Crear ArrayList de edades**
- [15, 25, 17, 30, 16, 22, 18]

**Paso 2: Contar mayores de edad**
- Variable contador inicializada a 0
- For-each para recorrer
- Si edad >= 18: contador++

**Paso 3: Contar menores de edad**
- Similar pero < 18

**Paso 4: Mostrar cantidades**
- "Total: " + tamaño
- "Mayores: " + contador1
- "Menores: " + contador2

**Paso 5: Crear ArrayLists filtrados**
- `ArrayList<Integer> mayores = new ArrayList<>();`
- `ArrayList<Integer> menores = new ArrayList<>();`

**Paso 6: Llenar ArrayLists filtrados**
- For-each para agregar a cada lista según edad

**Paso 7: Mostrar listas filtradas**
- "Mayores de edad: " + mostrar con comas
- "Menores de edad: " + mostrar con comas

### 💡 Pistas
- Usa dos contadores (mayores y menores)
- Crea dos ArrayLists filtrados
- Puedes hacer método privado para mostrar con comas

---

## 📖 EJERCICIO 6: GestorNombres.java (INTEGRACIÓN)

### 🎯 Objetivo
**Menú interactivo que:**
1. Agregar nombre
2. Ver nombres (ordenados)
3. Buscar nombre
4. Eliminar nombre
5. Salir

### 📤 Ejemplo de uso
```
=== GESTOR DE NOMBRES ===
1. Agregar
2. Ver (ordenados)
3. Buscar
4. Eliminar
5. Salir

Elige: 1
Nombre: Juan
✅ Agregado

Elige: 1
Nombre: María
✅ Agregado

Elige: 2
=== NOMBRES ===
1. Juan
2. María

Elige: 3
Buscar: Juan
✅ Encontrado en posición 1

Elige: 5
👋 Adiós
```

### 📝 Pasos

**Paso 1: Scanner y ArrayList**
- ArrayList<String> nombres

**Paso 2: Menú while**
- Repetitivo hasta opción 5

**Paso 3: Switch de opciones**

**Opción 1: Agregar**
- Pedir nombre
- `.add(nombre)`
- Mostrar "✅ Agregado"

**Opción 2: Ver ordenados**
- `Collections.sort(nombres)`
- For tradicional con índices
- "1. " + nombre

**Opción 3: Buscar**
- Pedir nombre
- `.indexOf(nombre)`
- Si != -1: "✅ Encontrado en posición " + pos
- Si == -1: "❌ No encontrado"

**Opción 4: Eliminar**
- Pedir nombre
- `.remove(nombre)`
- Si TRUE: "✅ Eliminado"
- Si FALSE: "❌ No encontrado"

**Opción 5: Salir**
- `salir = true`

### 💡 Pistas
- ArrayList se modifica (add, remove) → cambios permanentes
- Collections.sort() modifica el ArrayList original
- `.remove(String)` retorna boolean

---

## 🎯 Orden Recomendado

1. ✅ **ListaNumeros** - Crear y mostrar (básico)
2. ✅ **BuscarNumero** - Búsqueda (.indexOf)
3. ✅ **OrdenarNumeros** - Ordenamiento
4. ✅ **FiltrarNumeros** - Crear nuevo ArrayList
5. ✅ **ContarYFiltrar** - Múltiples ArrayLists
6. 🔲 **GestorNombres** - Todo junto (menú)

---

## 💡 Conceptos Clave

| Ejercicio | Conceptos |
|-----------|-----------|
| ListaNumeros | `.add()`, `.get()`, `.size()` |
| BuscarNumero | `.indexOf()` |
| OrdenarNumeros | `Collections.sort()` |
| FiltrarNumeros | Crear ArrayList nuevo, `.add()` condicional |
| ContarYFiltrar | Múltiples ArrayLists, contadores |
| GestorNombres | Menú, switch, todas las operaciones |

---

## ✅ Checklist Final

Para cada ejercicio:
- [ ] ArrayList creado con tipo correcto `<Integer>` o `<String>`
- [ ] Elementos agregados con `.add()`
- [ ] Recorrido con for o for-each
- [ ] Búsqueda o filtrado si aplica
- [ ] Mostrar resultados claros
- [ ] Sin errores al compilar

