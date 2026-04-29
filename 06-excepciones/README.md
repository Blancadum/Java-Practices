# 6️⃣ Excepciones - Manejo Profesional de Errores

Aprende a **manejar errores** de forma profesional con try-catch.

## 📚 Contenido

- **Excepciones.md** - Guía teórica completa
- **EJERCICIOS_PASO_A_PASO.md** - 5 ejercicios progresivos
- **PLANTILLAS/** - Archivos para resolver
- **SOLUCIONES/** - Soluciones completas

## 🎯 Qué Aprenderás

- [x] Try-catch básico
- [x] Multiple catch para diferentes excepciones
- [x] Try-catch-finally
- [x] Throws en métodos
- [x] Excepciones personalizadas
- [x] Validación y lanzamiento de excepciones

## 📋 Ejercicios

1. **CalculadoraPlantilla** - Try-catch básico
2. **ConvertsorPlantilla** - Multiple catch
3. **SesionPlantilla** - Try-catch-finally
4. **PersonaExcepcionesPlantilla** - Excepciones personalizadas
5. **UsuarioExcepcionesPlantilla** - Sistema de registro completo

## 🚀 Cómo Usar

1. Lee **Excepciones.md**
2. Abre **PLANTILLAS/**
3. Sigue **EJERCICIOS_PASO_A_PASO.md**
4. Compara con **SOLUCIONES/**

## 💡 Requisitos

- MetodosAvanzados ✓
- Conceptos básicos de clases

## 📂 Estructura

```
Excepciones/
├── README.md
├── Excepciones.md
├── EJERCICIOS_PASO_A_PASO.md
├── PLANTILLAS/ (5 archivos)
└── SOLUCIONES/ (8 archivos)
```

## ✨ Conceptos Clave

```java
// Try-catch
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
}

// Multiple catch
try {
    int n = Integer.parseInt(texto);
} catch (NumberFormatException e) {
    System.out.println("No es número");
} catch (Exception e) {
    System.out.println("Error inesperado");
}

// Finally (siempre se ejecuta)
finally {
    System.out.println("Limpieza");
}

// Custom exception
public class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String msg) {
        super(msg);
    }
}
```

## 📖 Orden Recomendado

1. Scanner ✓
2. Archivos ✓
3. ArrayList ✓
4. Objetos ✓
5. MetodosAvanzados ✓
6. **Excepciones** ← Estás aquí
7. Herencia

---

**¡Maneja errores como un profesional!** 🛡️
