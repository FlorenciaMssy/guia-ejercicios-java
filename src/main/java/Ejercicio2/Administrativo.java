package Ejercicio2;

public abstract class Administrativo extends Empleado {

    float hsExtras;
    float hsMes;

    public Administrativo(String dni, String nombre, String apellido, String email, float sueldoBase, float hsExtras, float hsMes) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.hsExtras = hsExtras;
        this.hsMes = hsMes;
    }

    @Override
    public double getSueldo() {
        return sueldoBase * ((hsExtras * 1.5)+hsMes) / hsMes;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "hsExtras=" + hsExtras +
                ", hsMes=" + hsMes +
                '}';
    }
}

