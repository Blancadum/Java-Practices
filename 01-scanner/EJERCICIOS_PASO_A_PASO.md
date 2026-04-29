# 📚 Ejercicios Scanner - Paso a Paso

Cada ejercicio es una guía para que TÚ lo implementes. Sin mirar el código, solo sigue los pasos.

---

## ✅ EJERCICIO 1: Saludo.java (YA HECHO)

Mira el archivo `Saludo.java` para ver cómo se hace.

---

## ✅ EJERCICIO 2: Suma.java (YA HECHO)

Mira el archivo `Suma.java` para ver cómo se hace.

---

## 📖 EJERCICIO 3: Calculadora.java

### 🎯 Objetivo
Hacer una calculadora que suma, resta, multiplica o divide dos números.

### 📥 Entrada
- Primer número (double)
- Operador: +, -, *, /
- Segundo número (double)

### 📤 Salida Esperada
```
Introduce primer número:
5
Introduce operador (+, -, *, /):
+
Introduce segundo número:
3
5.0 + 3.0 = 8.0
```

### 📝 Pasos (SIN MIRAR CÓDIGO)

**Paso 1: Crear el Scanner**
- Importa `java.util.Scanner`
- Crea un objeto `Scanner` que lea del sistema

**Paso 2: Pedir primer número**
- Muestra: "Introduce primer número:"
- Lee un `double` (usa `nextDouble()`)

**Paso 3: Pedir operador**
- Muestra: "Introduce operador (+, -, *, /):"
- Lee UN CARÁCTER (pista: `next().charAt(0)`)
- ⚠️ Limpia el buffer después

**Paso 4: Pedir segundo número**
- Muestra: "Introduce segundo número:"
- Lee otro `double`

**Paso 5: Calcular resultado**
- Crea una variable `resultado`
- Usa un `switch` para cada operador:
  - Si es '+' → suma
  - Si es '-' → resta
  - Si es '*' → multiplica
  - Si es '/' → divide (pero ¡ojo! no dividir entre 0)
  - Si no es ninguno → mostrar error

**Paso 6: Mostrar resultado**
- Imprime: `numero1 operador numero2 = resultado`

**Paso 7: Cerrar Scanner**

### 💡 Pistas
- Usa `switch` para el operador
- En el caso '/', valida que `numero2 != 0`
- Usa `System.out.println()` para mostrar el resultado

---

## 📖 EJERCICIO 4: IMC.java

### 🎯 Objetivo
Calcular el Índice de Masa Corporal (IMC) y clasificarlo.

**Fórmula:** `IMC = peso / (altura * altura)`

**Clasificación:**
- IMC < 18.5 → Bajo peso
- 18.5 ≤ IMC < 25 → Peso normal
- 25 ≤ IMC < 30 → Sobrepeso
- IMC ≥ 30 → Obesidad

### 📥 Entrada
- Nombre (String)
- Peso en kg (double)
- Altura en metros (double, ej: 1.75)

### 📤 Salida Esperada
```
¿Cuál es tu nombre?
Juan
¿Cuál es tu peso (kg)?
80
¿Cuál es tu altura (m)? (ej: 1.75)
1.75

=== RESULTADO ===
Nombre: Juan
Peso: 80.0 kg
Altura: 1.75 m
IMC: 26.12
Categoría: Sobrepeso
```

### 📝 Pasos

**Paso 1: Crear Scanner y pedir datos**
- Nombre (String)
- Peso (double)
- Altura (double)
- Limpia buffer después de `nextDouble()`

**Paso 2: Validar datos**
- Si peso ≤ 0 o altura ≤ 0 → mostrar error y salir
- (Usa `return` para salir del main)

**Paso 3: Calcular IMC**
- Crea variable `imc`
- Aplica la fórmula

**Paso 4: Clasificar IMC**
- Usa `if-else if` para determinar categoría
- Guarda en variable `categoria`

**Paso 5: Mostrar resultado**
- Imprime línea separadora: "=== RESULTADO ==="
- Nombre, Peso, Altura, IMC (con 2 decimales), Categoría
- Pista: `String.format("%.2f", imc)` para 2 decimales

**Paso 6: Cerrar Scanner**

### 💡 Pistas
- Usa `if-else if` (no switch, porque es un rango)
- Valida `peso > 0` y `altura > 0` al inicio
- Formatear a 2 decimales hace el resultado más bonito

---

## 📖 EJERCICIO 5: ValidarEdad.java

### 🎯 Objetivo
Pedir edad y VALIDAR que sea:
1. Un número
2. Entre 0 y 150

Si no es válido, repetir hasta que lo sea.

### 📥 Entrada
```
Introduce tu edad (0-150):
abc
❌ Error: Debes introducir un número
Introduce tu edad (0-150):
200
❌ Error: Debe estar entre 0 y 150
Introduce tu edad (0-150):
25
✅ Edad válida: 25
```

### 📤 Salida Esperada
```
✅ Edad válida: 25
Eres adulto
```

### 📝 Pasos

**Paso 1: Crear Scanner y variables**
- Variable `edad` inicializada a -1
- Variable `valido` inicializada a false

**Paso 2: Bucle while**
- Mientras `!valido`:
  - Pedir edad
  - Validar

**Paso 3: Validar que es número**
- Usa `scanner.hasNextInt()`
- Si es true:
  - Lee el número
  - Limpia buffer con `nextLine()`
- Si es false:
  - Muestra error
  - Limpia entrada inválida con `nextLine()`

**Paso 4: Validar que está en rango**
- Si es número y está entre 0 y 150:
  - `valido = true`
  - Muestra "✅ Edad válida"
- Si no está en rango:
  - Muestra error
  - Sigue el bucle

**Paso 5: Después del bucle**
- Si edad < 18 → "Eres menor de edad"
- Si edad < 65 → "Eres adulto"
- Si no → "Eres jubilado"

**Paso 6: Cerrar Scanner**

### 💡 Pistas
- `hasNextInt()` NO consume entrada (solo comprueba)
- `nextInt()` SÍ consume entrada
- Siempre limpia buffer con `nextLine()` después de `nextInt()`
- El while sigue mientras `!valido` (mientras NO sea válido)

---

## 📖 EJERCICIO 6: MenuPizzeria.java

### 🎯 Objetivo
Un menú repetitivo donde:
1. Ver menú de pizzas
2. Pedir pizzas (tamaño + cantidad)
3. Ver total acumulado
4. Salir

### 📥 Datos
Precios:
- Pequeña: 8.50€
- Mediana: 12.00€
- Grande: 15.50€

### 📤 Salida Esperada
```
=== PIZZERÍA ITALIA ===
1. Ver menú
2. Pedir pizza
3. Ver total
4. Salir
Elige opción:
1

=== MENÚ ===
Pequeña (25cm): €8.50
Mediana (30cm): €12.00
Grande (35cm): €15.50

=== PIZZERÍA ITALIA ===
Elige opción:
2

¿Qué tamaño quieres?
1. Pequeña (€8.50)
2. Mediana (€12.00)
3. Grande (€15.50)
Elige:
2
¿Cuántas pizzas quieres?
2
✅ Agregadas 2 pizza(s)

=== PIZZERÍA ITALIA ===
Elige opción:
3

=== TOTAL ===
Pizzas: 2
Total: €24.00
```

### 📝 Pasos

**Paso 1: Crear Scanner y variables**
- Constantes con precios (PRECIO_PEQUEÑA, etc.)
- `total` = 0 (acumulador)
- `pizzas` = 0 (contador)
- `salir` = false

**Paso 2: Bucle while**
- Mientras `!salir`:

**Paso 3: Mostrar menú principal**
- 4 opciones (Ver menú, Pedir, Ver total, Salir)
- Lee opción (con validación: `hasNextInt()`)
- Si no es número, limpia buffer y muestra error

**Paso 4: Switch según opción**

**Opción 1: Ver menú**
- Muestra precios de las 3 pizzas

**Opción 2: Pedir pizza**
- Submenu: pedir tamaño (1/2/3)
- Según tamaño, obtener precio
- Pedir cantidad
- Sumar al `total` y al contador `pizzas`
- Validar cantidad > 0

**Opción 3: Ver total**
- Si `pizzas == 0`: "No has pedido ninguna"
- Si no: mostrar cantidad y total
- Usa `String.format("%.2f", total)` para 2 decimales

**Opción 4: Salir**
- `salir = true`
- Mostrar: "👋 ¡Gracias por tu compra!"
- Si hay compra, mostrar total a pagar

**Opción invalida**
- "❌ Opción no válida"

**Paso 5: Cerrar Scanner**

### 💡 Pistas
- Usa `while` para el menú principal
- Usa `switch` para las opciones
- Las variables `total` y `pizzas` se mantienen (no se resetean)
- Puedes hacer métodos privados para reutilizar código (mostrarMenu, pedirPizza, mostrarTotal)

---

## 📖 EJERCICIO 7: RegistroEstudiante.java

### 🎯 Objetivo
Registrar datos de un estudiante y mostrar resumen.

### 📥 Entrada
- Nombre (String)
- Edad (int, validada entre 15 y 80)
- Nota promedio (double, 0-10)
- ¿Tiene beca? (s/n)

### 📤 Salida Esperada
```
=== REGISTRO DE ESTUDIANTE ===

Nombre:
Juan García
Edad (15-80):
19
Nota promedio (0.0-10.0):
8.5
¿Tienes beca? (s/n):
s

=== RESUMEN ===
Nombre: Juan García
Edad: 19 años
Nota: 8.50
Beca: Sí
Estado: Bueno
🎉 ¡Felicidades! Estás en el programa de honor
```

### 📝 Pasos

**Paso 1: Crear Scanner**

**Paso 2: Pedir nombre**
- Muestra: "Nombre:"
- Lee con `nextLine()`

**Paso 3: Pedir edad (CON VALIDACIÓN)**
- Mientras edad no sea válida:
  - Muestra: "Edad (15-80):"
  - Comprueba `hasNextInt()`
  - Si es número y está entre 15-80 → valid
  - Si no → muestra error y repite
- Limpia buffer

**Paso 4: Pedir nota promedio**
- Muestra: "Nota promedio (0.0-10.0):"
- Lee `double`
- Limpia buffer

**Paso 5: Pedir beca**
- Muestra: "¿Tienes beca? (s/n):"
- Lee String
- Convierte a minúsculas (`.toLowerCase()`)
- Si es "s" → beca = true

**Paso 6: Mostrar resumen**
- Línea: "=== RESUMEN ==="
- Nombre, Edad, Nota (2 decimales), Beca (Sí/No)

**Paso 7: Determinar estado**
- Si nota >= 9 → "Excelente"
- Si nota >= 7 → "Bueno"
- Si nota >= 5 → "Aprobado"
- Si no → "Suspenso"
- Muestra estado

**Paso 8: Bonus: Felicitación**
- Si tiene beca Y nota >= 8:
  - Muestra: "🎉 ¡Felicidades! Estás en el programa de honor"

**Paso 9: Cerrar Scanner**

### 💡 Pistas
- La edad lleva validación con `while` (como en ValidarEdad)
- Usa `respuesta.equals("s")` para comparar strings
- Usa `tieneBeca ? "Sí" : "No"` para imprimir condicionalmente
- Usa `if-else if` para el estado (como IMC)
- `String.format("%.2f", nota)` para 2 decimales

---

## 🎯 Orden Recomendado

1. ✅ **Saludo.java** - Ya hecho (lo más básico)
2. ✅ **Suma.java** - Ya hecho (múltiples números)
3. 🔲 **Calculadora.java** - Switch + operadores
4. 🔲 **ValidarEdad.java** - While + hasNextInt() (IMPORTANTE)
5. 🔲 **IMC.java** - Fórmulas + clasificación
6. 🔲 **RegistroEstudiante.java** - Validación mixta
7. 🔲 **MenuPizzeria.java** - Lo más complejo (while + switch + métodos)

---

## 💡 Conceptos Clave Practicados

| Ejercicio | Conceptos |
|-----------|-----------|
| Calculadora | `switch`, `char`, operadores |
| ValidarEdad | `while`, `hasNextInt()`, validación |
| IMC | Fórmulas, `if-else if`, `String.format()` |
| RegistroEstudiante | Mezcla de todo + métodos |
| MenuPizzeria | `while`, `switch`, acumuladores, métodos |

---

## ✅ Checklist Final

Para cada ejercicio:
- [ ] Crear clase con `main`
- [ ] Importar Scanner
- [ ] Crear Scanner que lea de `System.in`
- [ ] Pedir datos con mensajes claros
- [ ] Validar si es necesario
- [ ] Realizar cálculos/lógica
- [ ] Mostrar resultado
- [ ] Cerrar Scanner

