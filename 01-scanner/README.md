# 1️⃣ Scanner - Entrada de Datos en Java

Aprende a **capturar y validar entrada del usuario** usando Scanner.

## 📚 Contenido

- **Scanner.md** - Guía teórica completa
- **EJERCICIOS_PASO_A_PASO.md** - 5 ejercicios progresivos
- **PLANTILLAS/** - Archivos para resolver (con TODO comments)
- **SOLUCIONES/** - Soluciones completas

## 🎯 Qué Aprenderás

- [x] Crear Scanner para leer entrada
- [x] `nextInt()`, `nextDouble()`, `nextLine()`
- [x] Validar entrada con `hasNextInt()`
- [x] Manejar múltiples tipos de datos
- [x] Limpiar buffer con `nextLine()`
- [x] Crear menús interactivos

## 📋 Ejercicios

1. **CalculadoraPlantilla** - Operaciones básicas con dos números
2. **IMCPlantilla** - Cálculo de IMC con validación
3. **ValidarEdadPlantilla** - Validación con while loop
4. **RegistroEstudiantePlantilla** - Múltiples tipos de datos
5. **MenuPizzeriaPlantilla** - Menú completo con acumuladores

## 🚀 Cómo Usar

### Opción 1: Aprender viendo soluciones
1. Lee **Scanner.md** para entender conceptos
2. Mira las soluciones en **SOLUCIONES/**
3. Prueba en VSCode

### Opción 2: Resolver ejercicios (recomendado)
1. Lee **EJERCICIOS_PASO_A_PASO.md**
2. Abre archivo en **PLANTILLAS/**
3. Sigue los pasos (cada TODO es un paso)
4. Compara con **SOLUCIONES/**

## 💡 Requisitos

- Java JDK 11+
- VSCode o IDE Java
- Conocimiento básico de variables y tipos

## 📂 Estructura Archivo

```
Scanner/
├── README.md
├── Scanner.md
├── EJERCICIOS_PASO_A_PASO.md
├── PLANTILLAS/
│   ├── CalculadoraPlantilla.java
│   ├── IMCPlantilla.java
│   ├── ValidarEdadPlantilla.java
│   ├── RegistroEstudiantePlantilla.java
│   └── MenuPizzeriaPlantilla.java
└── SOLUCIONES/
    ├── CalculadoraSol.java
    ├── IMCSol.java
    ├── ValidarEdadSol.java
    ├── RegistroEstudianteSol.java
    └── MenuPizzeriaSol.java
```

## ✨ Tips

- Los comentarios en PLANTILLAS/ te guían paso a paso
- Cada `// TODO:` es un paso a seguir
- Intenta resolver sin mirar SOLUCIONES/
- Lee EJERCICIOS_PASO_A_PASO.md antes de empezar

## 📖 Conceptos Clave

```java
// Crear Scanner
Scanner scanner = new Scanner(System.in);

// Validar antes de leer
if (scanner.hasNextInt()) {
    int numero = scanner.nextInt();
}

// Limpiar buffer
scanner.nextLine();

// Menú con while
while (!salir) {
    // mostrar opciones
    // switch(opcion)
}
```

---

**¡Listo para aprender!** 🎓
