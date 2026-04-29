# 📝 Ejercicios: Excepciones - Paso a Paso

Aprende a **manejar errores** de forma profesional.

---

## 🎯 Ejercicio 1: Try-Catch Básico

**Objetivo:** Atrapar un error simple y continuar.

### Paso a Paso:

1. Crea una clase `Calculadora`
2. Crea un método `dividir` que:
   - Reciba 2 números (int)
   - Intente dividir en un bloque `try`
   - Atrape `ArithmeticException` en `catch`
   - Muestre mensaje de error si falla
   - Retorne el resultado (o -1 si error)
3. En `main()`, prueba con números que causen error (división por 0)

### Pistas:
```java
try {
    // TODO: int resultado = a / b;
} catch (ArithmeticException e) {
    // TODO: System.out.println("❌ No se puede dividir entre 0");
}
```

### Resultado esperado:
```
Dividir 10 / 2 = 5
Dividir 10 / 0 = ❌ No se puede dividir entre 0
```

---

## 🎯 Ejercicio 2: Multiple Catch

**Objetivo:** Atrapar diferentes tipos de excepciones.

### Paso a Paso:

1. Crea una clase `Conversor`
2. Crea un método `convertirNumero` que:
   - Reciba un String
   - Intente convertir a int con `Integer.parseInt()`
   - Intente dividir por un número aleatorio (puede ser 0)
   - Atrape `NumberFormatException` (si no es número)
   - Atrape `ArithmeticException` (si divide por 0)
   - Retorne el resultado o -1 si hay error
3. En `main()`, prueba con:
   - Un número válido: "25"
   - Un número inválido: "abc"

### Pistas:
```java
try {
    // TODO: int numero = Integer.parseInt(texto);
    // TODO: int resultado = numero / (new Random().nextInt(5) - 2);
} catch (NumberFormatException e) {
    // TODO: System.out.println("❌ No es un número");
} catch (ArithmeticException e) {
    // TODO: System.out.println("❌ División por 0");
}
```

### Resultado esperado:
```
Convertir "25" = OK
Convertir "abc" = ❌ No es un número
```

---

## 🎯 Ejercicio 3: Try-Catch-Finally

**Objetivo:** Ejecutar código que siempre debe ocurrir.

### Paso a Paso:

1. Crea una clase `Sesion`
2. Crea un método `login` que:
   - Reciba usuario y contraseña (String)
   - En `try`: validar que no estén vacíos
   - Si están vacíos: `throw new IllegalArgumentException(...)`
   - En `catch`: mostrar error
   - En `finally`: mostrar "Sesión finalizada"
3. En `main()`, llama con datos válidos e inválidos

### Pistas:
```java
try {
    // TODO: if (usuario.isEmpty() || password.isEmpty()) {
    // TODO:     throw new IllegalArgumentException("Campos vacíos");
    // TODO: }
    System.out.println("✅ Login exitoso");
} catch (IllegalArgumentException e) {
    // TODO: System.out.println("❌ " + e.getMessage());
} finally {
    // TODO: System.out.println("Sesión finalizada");
}
```

### Resultado esperado:
```
Login con "juan" / "1234"
✅ Login exitoso
Sesión finalizada

Login con "" / ""
❌ Campos vacíos
Sesión finalizada
```

---

## 🎯 Ejercicio 4: Excepciones Personalizadas

**Objetivo:** Crear y usar tu propia excepción.

### Paso a Paso:

1. Crea una clase `EdadInvalidaException` que herede de `Exception`
   - Constructor que reciba un String (mensaje)
   - Pasa el mensaje al constructor padre con `super()`

2. Crea una clase `Persona`
   - Método `setEdad` que:
     - Reciba edad (int)
     - Si edad < 0 o > 150: `throw new EdadInvalidaException(...)`
     - Si es válida: guardar y mostrar "✅ Edad establecida"

3. En `main()`, usa try-catch para:
   - Establecer edad válida: 25
   - Establecer edad inválida: -5 (capturar excepción)

### Pistas:
```java
// EdadInvalidaException
public class EdadInvalidaException extends Exception {
    // TODO: public EdadInvalidaException(String mensaje) {
    // TODO:     super(mensaje);
    // TODO: }
}

// En Persona
public void setEdad(int edad) throws EdadInvalidaException {
    // TODO: if (edad < 0 || edad > 150) {
    // TODO:     throw new EdadInvalidaException("Edad debe estar entre 0 y 150");
    // TODO: }
}
```

### Resultado esperado:
```
Establecer edad 25: ✅ Edad establecida
Establecer edad -5: ❌ Edad debe estar entre 0 y 150
```

---

## 🎯 Ejercicio 5: Integración - Sistema de Registro

**Objetivo:** Usar excepciones en un sistema completo.

### Paso a Paso:

1. Crea excepciones personalizadas:
   - `EmailInvalidoException` - si no contiene "@"
   - `ContraseñaDebilException` - si tiene < 6 caracteres
   - `NombreVacioException` - si nombre está vacío

2. Crea clase `Usuario`
   - Método `registrar` que reciba: nombre, email, contraseña
   - Valide cada campo y lance la excepción correspondiente
   - Si todo OK: guarde datos y muestre "✅ Usuario registrado"

3. En `main()`, prueba:
   - Registro válido: "Juan", "juan@mail.com", "123456"
   - Registro con email inválido: "Juan", "juanmail", "123456"
   - Registro con contraseña débil: "Juan", "juan@mail.com", "123"

### Pistas:
```java
try {
    usuario.registrar("Juan", "juan@mail.com", "123456");
} catch (NombreVacioException e) {
    System.out.println("❌ " + e.getMessage());
} catch (EmailInvalidoException e) {
    System.out.println("❌ " + e.getMessage());
} catch (ContraseñaDebilException e) {
    System.out.println("❌ " + e.getMessage());
}
```

### Resultado esperado:
```
Registrar Juan / juan@mail.com / 123456
✅ Usuario registrado

Registrar Juan / juanmail / 123456
❌ Email debe contener @

Registrar Juan / juan@mail.com / 123
❌ Contraseña debe tener mínimo 6 caracteres
```

---

## 📋 Resumen de Conceptos

| Ejercicio | Concepto | Aprenderás |
|-----------|----------|-----------|
| 1 | Try-Catch básico | Atrapar ArithmeticException |
| 2 | Multiple Catch | Atrapar diferentes excepciones |
| 3 | Try-Catch-Finally | Ejecutar código siempre |
| 4 | Excepciones personalizadas | Crear tu propia excepción |
| 5 | Integración | Sistema completo con validación |

---

## ✅ Checklist de Aprendizaje

- [ ] Ejercicio 1: Try-Catch funcionando
- [ ] Ejercicio 2: Multiple Catch reconociendo excepciones
- [ ] Ejercicio 3: Finally ejecutándose siempre
- [ ] Ejercicio 4: Excepciones personalizadas funcionando
- [ ] Ejercicio 5: Sistema de registro con validación completa

**Cuando completes todo, habrás dominado el manejo de excepciones ✨**
