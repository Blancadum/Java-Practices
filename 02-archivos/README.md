# 2️⃣ Archivos - Lectura y Escritura de Ficheros

Aprende a **guardar y leer datos en ficheros** usando Java NIO.

## 📚 Contenido

- **Archivos.md** - Guía teórica completa
- **EJERCICIOS_PASO_A_PASO.md** - 5 ejercicios progresivos
- **PLANTILLAS/** - Archivos para resolver
- **SOLUCIONES/** - Soluciones completas

## 🎯 Qué Aprenderás

- [x] Crear y escribir ficheros
- [x] Leer datos de ficheros
- [x] Usar `Files`, `Path`, `StandardOpenOption`
- [x] Appending vs overwrite
- [x] Procesar líneas con `split()`
- [x] Persistencia de datos

## 📋 Ejercicios

1. **GuardarPersonaSol** - Guardar datos en fichero
2. **LeerPersonasSol** - Leer fichero completo
3. **ProcesarPersonasSol** - Parsear CSV con split()
4. **BuscarYReemplazarSol** - Modificar líneas específicas
5. **EliminarPersonaSol** - Eliminar registros

## 🚀 Cómo Usar

### Aprender paso a paso
1. Lee **Archivos.md**
2. Abre **PLANTILLAS/**
3. Sigue pasos en **EJERCICIOS_PASO_A_PASO.md**
4. Compara con **SOLUCIONES/**

## 💡 Requisitos

- Java JDK 11+
- Entender Scanner (tema anterior)
- Conocer excepciones básicas (try-catch)

## 📂 Estructura

```
Archivos/
├── README.md
├── Archivos.md
├── EJERCICIOS_PASO_A_PASO.md
├── PLANTILLAS/
│   ├── GuardarPersonaPlantilla.java
│   ├── LeerPersonasPlantilla.java
│   ├── ProcesarPersonasPlantilla.java
│   ├── BuscarYReemplazarPlantilla.java
│   └── EliminarPersonaPlantilla.java
└── SOLUCIONES/
    ├── GuardarPersonaSol.java
    ├── LeerPersonasSol.java
    ├── ProcesarPersonasSol.java
    ├── BuscarYReemplazarSol.java
    └── EliminarPersonaSol.java
```

## ✨ Conceptos Clave

```java
// Escribir
Files.write(path, contenido.getBytes(), StandardOpenOption.APPEND);

// Leer
List<String> lineas = Files.readAllLines(path);
for (String linea : lineas) { }

// Parsear
String[] datos = linea.split(",");
```

## 📖 Orden Recomendado

1. Scanner ← Debes completar primero
2. **Archivos** ← Estás aquí
3. ArrayList
4. Objetos
5. MetodosAvanzados

---

**¡Persiste datos en ficheros!** 💾
