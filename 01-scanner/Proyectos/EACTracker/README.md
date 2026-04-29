# 📚 EACTracker - Gestor de Entregas IOC

Un programa **práctico y funcional** para rastrear tus EACs (entregas) del curso CFGS DAM/DAW de IOC.

---

## 🎯 Características

✅ **Agregar EACs** - Registra qué debes entregar y cuándo
✅ **Ver todas** - Listado completo con estado (emoji)
✅ **Marcar completadas** - Actualiza el estado sin borrar
✅ **Próximas entregas** - Ordena por fecha (próximas primero)
✅ **Eliminar** - Borra una EAC del registro
✅ **Persistencia** - Guarda en archivo (no pierde datos)

---

## 📋 Menú Principal

```
=== EAC TRACKER ===
1. Agregar EAC
2. Ver todas
3. Marcar como completada
4. Próximas entregas
5. Eliminar EAC
0. Salir
```

---

## 🚀 Cómo Compilar y Ejecutar

### Compilar
```bash
cd /Volumes/Compartido/IOC/SEMESTRE2/PROG/practicando/EACTracker
javac Constants.java UtilsIO.java EACFileUtils.java EACTracker.java
```

### Ejecutar
```bash
java EACTracker
```

---

## 💻 Ejemplo de Uso Paso a Paso

### Inicio

```
Carpeta (Enter = defecto): (Enter)
Archivo (Enter = defecto): (Enter)
```
✅ Usa valores por defecto: `./eac_tracker/mis_eacs.txt`

### Opción 1: Agregar EAC

```
=== EAC TRACKER ===
Elige: 1
EAC (ej: EAC1): EAC1
Descripción: Fundamentos Java
Fecha (YYYY-MM-DD): 2026-03-15
✅ EAC agregada
```

Repetir para agregar más:
```
Elige: 1
EAC (ej: EAC1): EAC5
Descripción: Gestión de Apuestas
Fecha (YYYY-MM-DD): 2026-05-23
✅ EAC agregada
```

### Opción 2: Ver todas

```
Elige: 2

=== MIS EACs ===
❌ EAC1 - Fundamentos Java (Entrega: 2026-03-15)
❌ EAC5 - Gestión de Apuestas (Entrega: 2026-05-23)
```

**Emojis:**
- ❌ No comenzada
- ⏳ En progreso (futuro: cambiar manualmente en archivo)
- ✅ Completada

### Opción 3: Marcar como completada

```
Elige: 3
¿Cuál EAC completaste? (ej: EAC1): EAC1
✅ Marcada como completada
```

Ahora al ver todas:
```
Elige: 2

=== MIS EACs ===
✅ EAC1 - Fundamentos Java (Entrega: 2026-03-15)
❌ EAC5 - Gestión de Apuestas (Entrega: 2026-05-23)
```

### Opción 4: Próximas entregas

```
Elige: 4

=== PRÓXIMAS ENTREGAS ===
📅 EAC5 - 2026-05-23 (No comenzada)
```

✅ Solo muestra **no completadas**
✅ **Ordenadas por fecha** (cercanas primero)

### Opción 5: Eliminar EAC

```
Elige: 5
¿Cuál EAC eliminar? (ej: EAC1): EAC1
✅ EAC eliminada
```

### Opción 0: Salir

```
Elige: 0
👋 ¡Hasta luego!
```

---

## 📁 Estructura de Archivos

```
EACTracker/
├── Constants.java          ← Mensajes centralizados
├── UtilsIO.java           ← Lectura/escritura usuario
├── EACFileUtils.java      ← Lógica de archivos
├── EACTracker.java        ← Main + menú
├── README.md              ← Este archivo
└── eac_tracker/           ← Carpeta de datos (se crea automáticamente)
    └── mis_eacs.txt       ← Archivo de datos
```

---

## 📝 Formato del Archivo

El archivo `mis_eacs.txt` guarda una línea por EAC:

```
EAC1|Fundamentos Java|2026-03-15|No comenzada
EAC5|Gestión de Apuestas|2026-05-23|Completada
EAC8|Base de Datos|2026-06-10|No comenzada
```

**Campos separados por `|`:**
1. **Nombre EAC** (ej: EAC1, EAC5)
2. **Descripción** (ej: Fundamentos Java)
3. **Fecha entrega** (formato YYYY-MM-DD)
4. **Estado** (No comenzada, En progreso, Completada)

---

## 🔧 Detalles de las Clases

### Constants.java
Centraliza todos los mensajes. **Cambios aquí = cambios en todo el programa.**

```java
public static final String DEFAULT_DIR = "./eac_tracker";
public static final String SUCCESS_ADDED = "✅ EAC agregada";
// ...
```

### UtilsIO.java
Maneja la **interacción con el usuario** (Scanner).

**Métodos:**
- `askString(msg)` → Pide texto (puede estar vacío)
- `askNotEmpty(msg)` → Pide texto (valida que no esté vacío)
- `askInt(msg)` → Pide número (valida que sea entero)
- `show(msg)` → Muestra mensaje
- `showError(msg)` → Muestra error

### EACFileUtils.java
**Lo más importante:** Maneja archivos y lógica.

**Métodos públicos:**
- `addEAC(eac, desc, date)` → Añade una línea al archivo
- `getAllEACs()` → Lee todas y retorna string con emojis
- `getUpcomingEACs()` → Retorna no completadas **ordenadas por fecha**
- `markAsCompleted(eacName)` → Cambia estado a "Completada"
- `deleteEAC(eacName)` → Elimina una línea del archivo

**Clase interna:**
```java
private static class EACEntry {
    String eac, description, date, status;
}
```
Usada para ordenar por fecha.

### EACTracker.java
**El main:** Orquesta todo.

**Flujo:**
1. `main()` → llama `start()`
2. `start()` → pide carpeta/archivo → menú loop
3. Switch con casos 1-5 → llama métodos privados
4. Cada método llama a UtilsIO y EACFileUtils

---

## 💡 Conceptos Java Practicados

### 📚 Estructura de Datos
- **ArrayList** - Guardamos EACs para ordenar
- **List** - Lectura de líneas con `Files.readAllLines()`

### 🔄 Control de Flujo
- **while loop** - Menú repetitivo hasta opción 0
- **switch statement** - 5 opciones diferentes
- **try-catch** - Manejo de excepciones (archivos, input)

### 📂 I/O (Input/Output)
- **Scanner** - Lectura desde teclado
- **Files.readAllLines()** - Leer archivo completo
- **Files.write()** - Escribir en archivo
- **Files.createDirectories()** - Crear carpeta si no existe

### 🎯 Métodos y Encapsulación
- **Métodos privados** - `addNewEAC()`, `viewAllEACs()`, etc.
- **Métodos con Exception** - `throws Exception` en métodos de archivo
- **Métodos que retornan String** - Para mostrar datos formateados

### ✨ Características Avanzadas
- **Locale.setDefault()** - Números con punto (1.5 no 1,5)
- **String.format()** - Formatear strings con emojis
- **List.sort()** - Ordenar por fecha con comparador
- **equalsIgnoreCase()** - Comparación insensible a mayúsculas

---

## 🎓 Relación con EAC5

| Aspecto | EAC5 | EACTracker |
|--------|------|-----------|
| Estructura | Menú + switch | ✅ Igual |
| Datos | sport, event, odds, amount | eac, descripción, fecha |
| Archivos | apuestas.txt | mis_eacs.txt |
| Validación | askForNotEmpty | ✅ Igual |
| Try-catch | Sí | ✅ Sí |
| **Novedad** | - | ArrayList + sort (próximas entregas) |

---

## 🚀 Mejoras Posibles

Si quieres expandir el programa:

1. **Opción "En progreso"** - Poder cambiar estado a esta opción
2. **Filtrar por mes** - Ver EACs de un mes específico
3. **Búsqueda** - Buscar por palabra clave en descripción
4. **Estadísticas** - % de EACs completadas
5. **Cambiar carpeta/archivo** - Opción en menú
6. **Recordatorios** - Mostrar EACs con < 7 días para entregar

---

## ❓ FAQs

### P: ¿Dónde guarda los datos?
**R:** En `./eac_tracker/mis_eacs.txt` (relativo a dónde ejecutes `java EACTracker`)

### P: ¿Puedo cambiar la carpeta?
**R:** Sí, al inicio del programa pregunta. Si dejas en blanco usa la carpeta por defecto.

### P: ¿Se pierden los datos si cierro el programa?
**R:** No, quedan guardados en el archivo.

### P: ¿Qué pasa si me equivoco al escribir la EAC?
**R:** Opción 5 (Eliminar) → Escribe el nombre exacto → Se borra

### P: ¿Puedo editar el archivo directamente?
**R:** Sí, pero mantén el formato: `EAC|descripción|fecha|estado`

### P: ¿Las fechas deben estar en ese formato?
**R:** Sí, `YYYY-MM-DD` para que la ordenación funcione (2026-05-23, no 23-05-2026)

---

## 🎯 Uso Real - Mi Caso

Como estudiante CFGS DAM/DAW, puedes usarlo así:

**Al empezar:**
```
Opción 1: Agrega EAC1, EAC2, EAC3, ... (todas tus entregas)
```

**Cada semana:**
```
Opción 4: Mira qué vence próxima semana
```

**Cuando terminas una EAC:**
```
Opción 3: Marca como completada
Opción 4: Verifica cuál es la próxima
```

**Antes del PAF1 (23 mayo):**
```
Opción 2: Verifica cuáles faltan
Opción 5: Elimina las antiguas si quieres
```

---

## 📞 Ayuda

Si algo no funciona:

1. **Compila de nuevo**: `javac *.java`
2. **Revisa el archivo**: `cat ./eac_tracker/mis_eacs.txt`
3. **Verifica fechas**: Deben ser `YYYY-MM-DD`
4. **Mira los mensajes de error**: Te dicen qué falta

---

## ✅ Checklist Final

- [x] Las 4 clases creadas
- [x] Compilación sin errores
- [x] Menú funcional (while + switch)
- [x] Agregar EAC (opción 1)
- [x] Ver todas (opción 2)
- [x] Marcar completada (opción 3)
- [x] Próximas entregas ordenadas (opción 4)
- [x] Eliminar (opción 5)
- [x] Guardado en archivo
- [x] Persistencia de datos

**¡Listo para usar! 🚀**

