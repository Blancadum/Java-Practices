/**
 * EJERCICIO 4: Vehiculo, Coche, Bicicleta, Moto - Polimorfismo (PLANTILLA)
 *
 * Usa referencias del padre para diferentes hijas
 */

// PASO 1: Crear clase PADRE Vehiculo (puede ser abstracta)
// PISTA: atributo: marca (String)
// PISTA: constructor que reciba marca
// PISTA: método abstracto: acelerar()
// TODO: public abstract class VehiculoPlantilla {
// TODO:     protected String marca;
// TODO:
// TODO:     public VehiculoPlantilla(String marca) {
// TODO:         this.marca = marca;
// TODO:     }
// TODO:
// TODO:     public abstract void acelerar();
// TODO: }

// PASO 2: Crear clase HIJA Coche
// PISTA: extends Vehiculo
// PISTA: constructor que llame super
// PISTA: OVERRIDE acelerar() con "Vroooom"
// TODO: public class CochePlantilla extends VehiculoPlantilla {
// TODO:     public CochePlantilla(String marca) {
// TODO:         super(marca);
// TODO:     }
// TODO:
// TODO:     @Override
// TODO:     public void acelerar() {
// TODO:         System.out.println("Vroooom");
// TODO:     }
// TODO: }

// PASO 3: Crear clase HIJA Bicicleta
// PISTA: extends Vehiculo
// PISTA: OVERRIDE acelerar() con "Pedalea rápido"
// TODO: public class BicicletaPlantilla extends VehiculoPlantilla { ... }

// PASO 4: Crear clase HIJA Moto
// PISTA: extends Vehiculo
// PISTA: OVERRIDE acelerar() con "Brrrr"
// TODO: public class MotoPlantilla extends VehiculoPlantilla { ... }

// PASO 5: Main - polimorfismo
// PISTA: array de tipo Vehiculo: Vehiculo[] vehiculos
// PISTA: inicializa con 3 objetos: new Coche(...), new Bicicleta(...), new Moto(...)
// PISTA: recorre array: for (Vehiculo v : vehiculos)
// PISTA: llama v.acelerar() en cada uno
// PISTA: nota cómo cada uno hace su acción diferente
// TODO: public static void main(String[] args) {
// TODO:     VehiculoPlantilla[] vehiculos = {
// TODO:         new CochePlantilla("Toyota"),
// TODO:         new BicicletaPlantilla("Trek"),
// TODO:         new MotoPlantilla("Harley")
// TODO:     };
// TODO:
// TODO:     for (VehiculoPlantilla v : vehiculos) {
// TODO:         v.acelerar();
// TODO:     }
// TODO: }
