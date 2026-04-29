# 📝 Ejercicios: Herencia - Paso a Paso

Aprende a **reutilizar código** creando jerarquías de clases.

---

## 🎯 Ejercicio 1: Herencia Básica

**Objetivo:** Crear clase padre e hijo, y heredar atributos/métodos.

### Paso a Paso:

1. Crea clase `Animal` (padre) con:
   - Atributos: `nombre` (String), `edad` (int)
   - Constructor que reciba nombre y edad
   - Método `dormir()` que imprime: "{nombre} está durmiendo"

2. Crea clase `Perro` (hija) que herede de `Animal` con:
   - Constructor que llame al constructor padre
   - Método propio `traerPelota()` que imprime: "{nombre} trae la pelota"

3. En `main()`, crea un Perro y usa métodos heredados y propios

### Pistas:
```java
// PADRE
public class Animal {
    // TODO: protected String nombre;
    // TODO: protected int edad;
    // TODO: public Animal(String nombre, int edad) { ... }
    // TODO: public void dormir() { ... }
}

// HIJA
public class Perro extends Animal {
    // TODO: public Perro(String nombre, int edad) {
    // TODO:     super(nombre, edad);
    // TODO: }
    // TODO: public void traerPelota() { ... }
}
```

### Resultado esperado:
```
Rex está durmiendo
Rex trae la pelota
```

---

## 🎯 Ejercicio 2: Super en Constructor

**Objetivo:** Usar super() para inicializar el padre.

### Paso a Paso:

1. Crea clase `Persona` (padre) con:
   - Atributos: `nombre` (String), `edad` (int)
   - Constructor

2. Crea clase `Estudiante` (hija) con:
   - Atributo propio: `matricula` (String)
   - Constructor que:
     - Llame `super(nombre, edad)`
     - Asigne `this.matricula`

3. En `main()`, crea un Estudiante y accede a todos sus atributos

### Pistas:
```java
public class Estudiante extends Persona {
    private String matricula;

    // TODO: public Estudiante(String nombre, int edad, String matricula) {
    // TODO:     super(nombre, edad);
    // TODO:     this.matricula = matricula;
    // TODO: }
}
```

### Resultado esperado:
```
Estudiante: Juan, 20 años, Matrícula: 12345
```

---

## 🎯 Ejercicio 3: Override - Sobrescribir Método

**Objetivo:** Redefinir un método del padre en la hija.

### Paso a Paso:

1. Crea clase `Animal` con:
   - Método `sonido()` que imprime: "Sonido genérico"

2. Crea clase `Perro` que herede de `Animal` con:
   - Método `sonido()` OVERRIDE que imprime: "¡Guau guau!"

3. Crea clase `Gato` que herede de `Animal` con:
   - Método `sonido()` OVERRIDE que imprime: "¡Miau miau!"

4. En `main()`, crea 1 Perro y 1 Gato, llama sonido() en ambos

### Pistas:
```java
@Override
public void sonido() {
    // TODO: System.out.println("¡Guau guau!");
}
```

### Resultado esperado:
```
Perro:
¡Guau guau!

Gato:
¡Miau miau!
```

---

## 🎯 Ejercicio 4: Polimorfismo

**Objetivo:** Usar referencias del padre para diferentes hijas.

### Paso a Paso:

1. Crea clase `Vehiculo` (padre) con:
   - Atributo: `marca` (String)
   - Método abstracto: `acelerar()`

2. Crea clases hijas:
   - `Coche extends Vehiculo` con `acelerar()` que imprime "Vroooom"
   - `Bicicleta extends Vehiculo` con `acelerar()` que imprime "Pedalea rápido"
   - `Moto extends Vehiculo` con `acelerar()` que imprime "Brrrr"

3. En `main()`, crea un Array de Vehiculo con 3 objetos diferentes

4. Recorre el Array y llama `acelerar()` en cada uno

### Pistas:
```java
// Array de padre
Vehiculo[] vehiculos = {
    // TODO: new Coche(...),
    // TODO: new Bicicleta(...),
    // TODO: new Moto(...)
};

// TODO: for (Vehiculo v : vehiculos) {
// TODO:     v.acelerar();
// TODO: }
```

### Resultado esperado:
```
Vroooom
Pedalea rápido
Brrrr
```

---

## 🎯 Ejercicio 5: Clases Abstractas

**Objetivo:** Crear clase abstracta que fuerza implementación.

### Paso a Paso:

1. Crea clase `Persona` ABSTRACTA con:
   - Atributos: `nombre`, `edad`
   - Método abstracto: `trabajar()` (sin implementación)
   - Método normal: `presentarse()` que imprime "Hola, soy {nombre}"

2. Crea clases concretas:
   - `Ingeniero extends Persona` con `trabajar()` = "Escribo código"
   - `Profesor extends Persona` con `trabajar()` = "Enseño"
   - `Medico extends Persona` con `trabajar()` = "Diagnostico"

3. En `main()`, crea array de Persona con 3 objetos

4. Llama `presentarse()` y `trabajar()` en cada uno

### Pistas:
```java
public abstract class Persona {
    // TODO: public abstract void trabajar();
    // TODO: public void presentarse() { ... }
}

public class Ingeniero extends Persona {
    // TODO: @Override
    // TODO: public void trabajar() {
    // TODO:     System.out.println("Escribo código");
    // TODO: }
}
```

### Resultado esperado:
```
Hola, soy Juan
Escribo código

Hola, soy María
Enseño

Hola, soy Carlos
Diagnostico
```

---

## 📋 Resumen de Conceptos

| Ejercicio | Concepto | Aprenderás |
|-----------|----------|-----------|
| 1 | Herencia básica | extends, protected, herencia de métodos |
| 2 | Super | super() en constructor, datos propios |
| 3 | Override | Redefinir método en hija |
| 4 | Polimorfismo | Array de padre, diferentes hijas |
| 5 | Clases abstractas | abstract, métodos obligatorios |

---

## ✅ Checklist de Aprendizaje

- [ ] Ejercicio 1: Herencia básica funcionando
- [ ] Ejercicio 2: Super() correctamente inicializando padre
- [ ] Ejercicio 3: Override diferenciando comportamientos
- [ ] Ejercicio 4: Polimorfismo con array del padre
- [ ] Ejercicio 5: Clases abstractas obligando implementación

**Cuando completes todo, habrás dominado herencia en Java ✨**
