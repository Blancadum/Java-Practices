/**
 * EJERCICIO 4: Vehiculo, Coche, Bicicleta, Moto - Polimorfismo (SOLUCIÓN)
 */

abstract class VehiculoSol {
    protected String marca;

    public VehiculoSol(String marca) {
        this.marca = marca;
    }

    public abstract void acelerar();
}

class CocheSol extends VehiculoSol {
    public CocheSol(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("Vroooom");
    }
}

class BicicletaSol extends VehiculoSol {
    public BicicletaSol(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("Pedalea rápido");
    }
}

class MotoSol extends VehiculoSol {
    public MotoSol(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("Brrrr");
    }
}

public class VehiculoPolimorfismoSol {
    public static void main(String[] args) {
        VehiculoSol[] vehiculos = {
            new CocheSol("Toyota"),
            new BicicletaSol("Trek"),
            new MotoSol("Harley")
        };

        System.out.println("=== POLIMORFISMO ===");
        for (VehiculoSol v : vehiculos) {
            v.acelerar();
        }

        System.out.println("\n✅ Mismo método, diferente comportamiento");
    }
}
