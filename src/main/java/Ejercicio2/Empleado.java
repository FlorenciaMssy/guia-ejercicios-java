package Ejercicio2;

import java.util.ArrayList;

public abstract class Empleado {

    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    public double sueldoBase;

    public Empleado(String dni, String nombre, String apellido, String email, float sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    public abstract double getSueldo();

}
