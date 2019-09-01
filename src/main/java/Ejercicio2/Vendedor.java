package Ejercicio2;

public abstract class Vendedor extends Empleado {

    float porcentajeComision;
    float totalVentas;

    public Vendedor(String dni, String nombre, String apellido, String email, float sueldoBase, float porcentajeComision, float totalVentas) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcentajeComision = porcentajeComision;
        this.totalVentas = totalVentas;
    }

    @Override
    public double getSueldo() {
        return sueldoBase + (porcentajeComision*totalVentas/100);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "porcentajeComision=" + porcentajeComision +
                ", totalVentas=" + totalVentas +
                '}';
    }
}

