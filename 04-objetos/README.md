# 4️⃣ Objetos - Programación Orientada a Objetos

Aprende a **diseñar y usar clases** con atributos, constructores y métodos.

## 📚 Contenido

- **Objetos.md** - Guía teórica OOP
- **EJERCICIOS_PASO_A_PASO.md** - 5 ejercicios progresivos
- **PLANTILLAS/** - Archivos para resolver
- **SOLUCIONES/** - Soluciones completas

## 🎯 Qué Aprenderás

- [x] Crear clases con atributos
- [x] Constructores
- [x] Getters y setters
- [x] Métodos de utilidad
- [x] ArrayList de objetos
- [x] Ordenar objetos
- [x] Menú completo con objetos

## 📋 Ejercicios

1. **Persona** - Clase base (usado en todos)
2. **CrearPersonaSol** - Instanciar objetos
3. **ArrayListPersonasSol** - ArrayList<Persona>
4. **OrdenarPersonasSol** - sort() con objetos
5. **GestorPersonasSol** - Sistema completo

## 🚀 Cómo Usar

1. Lee **Objetos.md**
2. Abre **PLANTILLAS/**
3. Sigue **EJERCICIOS_PASO_A_PASO.md**
4. Compara con **SOLUCIONES/**

## 💡 Requisitos

- Scanner ✓
- Archivos ✓
- ArrayList ✓
- Conceptos OOP básicos

## 📂 Estructura

```
Objetos/
├── README.md
├── Objetos.md
├── EJERCICIOS_PASO_A_PASO.md
├── Persona.java (clase base)
├── PLANTILLAS/ (5 archivos)
└── SOLUCIONES/ (5 archivos)
```

## ✨ Conceptos Clave

```java
// Clase
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) { }
    public String getNombre() { }
    public void setEdad(int edad) { }
}

// Usar
Persona p = new Persona("Juan", 25);
ArrayList<Persona> personas = new ArrayList<>();
personas.add(p);
```

## 📖 Orden Recomendado

1. Scanner ✓
2. Archivos ✓
3. ArrayList ✓
4. **Objetos** ← Estás aquí
5. MetodosAvanzados
6. Excepciones
7. Herencia

---

**¡Diseña tus propias clases!** 🏗️
