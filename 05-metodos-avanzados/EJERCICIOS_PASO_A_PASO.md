# 📝 Ejercicios: Métodos Avanzados - Paso a Paso

Aprende a crear **métodos flexibles, reutilizables y potentes**.

---

## 🎯 Ejercicio 1: Método con Retorno Simple

**Objetivo:** Crear un método que calcula y retorna un valor.

### Paso a Paso:

1. Crea una clase `CalculadoraBasica`
2. Crea un método `sumar` que:
   - Reciba 2 números (int)
   - Calcule la suma
   - **Retorne** el resultado (int)
3. En `main()`, llama el método y guarda el resultado en una variable
4. Imprime el resultado

### Pistas:
```java
public int sumar(int a, int b) {
    // TODO: calcula a + b
    // TODO: return resultado
}
```

### Resultado esperado:
```
suma de 5 + 3 = 8
```

---

## 🎯 Ejercicio 2: Método con Múltiples Parámetros

**Objetivo:** Crear un método que reciba varios datos diferentes.

### Paso a Paso:

1. Crea una clase `Estudiante`
2. Crea un método que reciba:
   - Nombre (String)
   - 3 notas (double)
   - Retorne la media
3. Validar que notas estén entre 0-10 (si no, lanza excepción)
4. Calcular media: `(nota1 + nota2 + nota3) / 3`
5. En `main()`, prueba con diferentes valores

### Pistas:
```java
public double calcularMedia(String nombre, double n1, double n2, double n3) {
    // TODO: validar que cada nota sea >= 0 y <= 10
    // TODO: si no, throw new IllegalArgumentException("Nota inválida");
    // TODO: calcular media
    // TODO: return media
}
```

### Resultado esperado:
```
Media de Juan: 8.0
Media de María: 7.33
```

---

## 🎯 Ejercicio 3: Método Void vs Retorno

**Objetivo:** Entender cuándo usar `void` y cuándo retornar.

### Paso a Paso:

1. Crea una clase `Persona`
2. Crea 2 métodos:
   - **Método A (void):** Reciba nombre y edad, **imprima** la información
   - **Método B (String):** Reciba nombre y edad, **retorne** la información
3. En `main()`, llama ambos métodos
4. Compara: ¿cuál es más flexible?

### Pistas:
```java
// VOID - imprime directamente
public void mostrarInfo(String nombre, int edad) {
    // TODO: System.out.println(...)
}

// CON RETORNO - devuelve el valor
public String getInfo(String nombre, int edad) {
    // TODO: return nombre + ...
}
```

### Resultado esperado:
```
[Void] Hola, Juan, 25 años
[Retorno] La información es: Juan (25 años)
```

---

## 🎯 Ejercicio 4: Sobrecarga de Métodos

**Objetivo:** Crear múltiples versiones del mismo método.

### Paso a Paso:

1. Crea una clase `Descuento`
2. Crea 3 métodos llamados `calcular`, cada uno con:
   - **Versión 1:** Recibe precio (double), retorna precio sin descuento
   - **Versión 2:** Recibe precio (double) y porcentaje (double), retorna con descuento
   - **Versión 3:** Recibe cantidad (int) y precio unitario (double), calcula total con 10% de descuento
3. En `main()`, llama cada versión y compara resultados

### Pistas:
```java
// Versión 1: sin descuento
public double calcular(double precio) {
    // TODO: return precio;
}

// Versión 2: con descuento personalizado
public double calcular(double precio, double porcentaje) {
    // TODO: return precio - (precio * porcentaje / 100);
}

// Versión 3: cantidad × precio unitario - 10%
public double calcular(int cantidad, double precioUnitario) {
    // TODO: double total = cantidad * precioUnitario;
    // TODO: return total - (total * 0.10);
}
```

### Resultado esperado:
```
Precio sin descuento: 100.0
Precio con 20% descuento: 80.0
Total 5 × 20€ con 10% = 90.0
```

---

## 🎯 Ejercicio 5: Métodos Estáticos (Integración)

**Objetivo:** Crear métodos que NO necesiten instancia.

### Paso a Paso:

1. Crea una clase `Utilidades`
2. Crea métodos estáticos para:
   - **Verificar edades:** reciba edad, retorne true si es adulto
   - **Convertir temperatura:** reciba Celsius, retorne Fahrenheit
   - **Validar email:** reciba email, retorne true si contiene "@"
3. En `main()`, llama todos sin crear instancia (ej: `Utilidades.esAdulto(25)`)
4. Prueba con diferentes valores

### Pistas:
```java
public static boolean esAdulto(int edad) {
    // TODO: return edad >= 18;
}

public static double celsiusAFahrenheit(double celsius) {
    // TODO: return (celsius * 9/5) + 32;
}

public static boolean emailValido(String email) {
    // TODO: return email.contains("@");
}
```

### Resultado esperado:
```
¿25 es adulto? true
¿15 es adulto? false
10°C = 50.0°F
¿juan@mail.com es válido? true
¿juanmail.com es válido? false
```

---

## 📋 Resumen de Conceptos

| Ejercicio | Concepto | Aprenderás |
|-----------|----------|-----------|
| 1 | Retorno simple | `return` y guardar resultado |
| 2 | Múltiples parámetros | Validar entrada, trabajar con varios tipos |
| 3 | Void vs Retorno | Cuándo usar cada uno |
| 4 | Sobrecarga | Mismo nombre, diferente comportamiento |
| 5 | Métodos estáticos | Sin instancia, utilidades |

---

## ✅ Checklist de Aprendizaje

- [ ] Ejercicio 1: Retorno simple funcionando
- [ ] Ejercicio 2: Validación de parámetros funcionando
- [ ] Ejercicio 3: Void vs Retorno claro
- [ ] Ejercicio 4: Sobrecarga reconocida por Java
- [ ] Ejercicio 5: Métodos estáticos sin instancia

**Cuando completes todo, habrás dominado métodos avanzados en Java ✨**
