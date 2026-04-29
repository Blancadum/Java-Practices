# 5️⃣ Métodos Avanzados - Flexibilidad y Reutilización

Aprende a crear **métodos flexibles, reutilizables y potentes**.

## 📚 Contenido

- **MetodosAvanzados.md** - Guía teórica completa
- **EJERCICIOS_PASO_A_PASO.md** - 5 ejercicios progresivos
- **PLANTILLAS/** - Archivos para resolver
- **SOLUCIONES/** - Soluciones completas

## 🎯 Qué Aprenderás

- [x] Retorno de valores (int, String, boolean, double)
- [x] Parámetros múltiples
- [x] Validación de entrada
- [x] Sobrecarga de métodos
- [x] Métodos estáticos
- [x] Métodos privados vs públicos
- [x] Void vs métodos con retorno

## 📋 Ejercicios

1. **CalculadoraBasicaPlantilla** - Retorno simple
2. **EstudiantePlantilla** - Múltiples parámetros + validación
3. **PersonaMetodosPlantilla** - Void vs retorno
4. **DescuentoPlantilla** - Sobrecarga de métodos
5. **UtilidadesPlantilla** - Métodos estáticos

## 🚀 Cómo Usar

1. Lee **MetodosAvanzados.md**
2. Abre **PLANTILLAS/**
3. Sigue **EJERCICIOS_PASO_A_PASO.md**
4. Compara con **SOLUCIONES/**

## 💡 Requisitos

- Objetos ✓
- Conceptos de métodos básicos

## 📂 Estructura

```
MetodosAvanzados/
├── README.md
├── MetodosAvanzados.md
├── EJERCICIOS_PASO_A_PASO.md
├── PLANTILLAS/ (5 archivos)
└── SOLUCIONES/ (5 archivos)
```

## ✨ Conceptos Clave

```java
// Retorno
public int sumar(int a, int b) {
    return a + b;
}

// Validación
if (edad < 0) throw new IllegalArgumentException("Inválido");

// Sobrecarga (mismo nombre, diferentes parámetros)
public double calcular(double a, double b) { }
public double calcular(int cantidad, double unitario) { }

// Estático (sin instancia)
public static boolean esAdulto(int edad) {
    return edad >= 18;
}
// Uso: Utilidades.esAdulto(25)
```

## 📖 Orden Recomendado

1. Scanner ✓
2. Archivos ✓
3. ArrayList ✓
4. Objetos ✓
5. **MetodosAvanzados** ← Estás aquí
6. Excepciones
7. Herencia

---

**¡Crea métodos profesionales!** 🎯
