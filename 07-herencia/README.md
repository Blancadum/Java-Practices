# 7️⃣ Herencia - Reutilización de Código

Aprende a **reutilizar código** creando jerarquías de clases.

## 📚 Contenido

- **Herencia.md** - Guía teórica completa
- **EJERCICIOS_PASO_A_PASO.md** - 5 ejercicios progresivos
- **PLANTILLAS/** - Archivos para resolver
- **SOLUCIONES/** - Soluciones completas

## 🎯 Qué Aprenderás

- [x] Extends - relación padre-hijo
- [x] Super en constructores
- [x] Métodos protected
- [x] Override - sobrescribir métodos
- [x] Polimorfismo
- [x] Clases abstractas
- [x] Métodos abstractos obligatorios

## 📋 Ejercicios

1. **AnimalPerroPlantilla** - Herencia básica
2. **PersonaEstudiantePlantilla** - Super en constructor
3. **AnimalSonidoPlantilla** - Override de métodos
4. **VehiculoPolimorfismoPlantilla** - Polimorfismo
5. **PersonaAbstractaPlantilla** - Clases abstractas

## 🚀 Cómo Usar

1. Lee **Herencia.md**
2. Abre **PLANTILLAS/**
3. Sigue **EJERCICIOS_PASO_A_PASO.md**
4. Compara con **SOLUCIONES/**

## 💡 Requisitos

- Excepciones ✓
- Conceptos OOP sólidos

## 📂 Estructura

```
Herencia/
├── README.md
├── Herencia.md
├── EJERCICIOS_PASO_A_PASO.md
├── PLANTILLAS/ (5 archivos)
└── SOLUCIONES/ (5 archivos)
```

## ✨ Conceptos Clave

```java
// Herencia
public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);  // Constructor padre
    }
}

// Protected (acceso en hijas)
protected String nombre;

// Override
@Override
public void sonido() {
    System.out.println("¡Guau!");
}

// Polimorfismo
Animal[] animales = {
    new Perro(), new Gato(), new Pajaro()
};
for (Animal a : animales) {
    a.sonido();  // Cada uno hace su sonido
}

// Clase abstracta
public abstract class Persona {
    public abstract void trabajar();  // Obligatorio
}
```

## 📖 Orden Recomendado

1. Scanner ✓
2. Archivos ✓
3. ArrayList ✓
4. Objetos ✓
5. MetodosAvanzados ✓
6. Excepciones ✓
7. **Herencia** ← Estás aquí (final del roadmap)

---

**¡Domina la orientación a objetos!** 🏛️
