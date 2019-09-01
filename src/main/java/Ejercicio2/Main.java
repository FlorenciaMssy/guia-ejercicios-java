package Ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main (String[]args){

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        boolean seguir = true;
        Scanner entrada = new Scanner(System.in);
        int numero;

        while(seguir) {
            System.out.println("Acá puede ingresar empleados");
            System.out.println("Ingrese 1 si es un administrativo");
            System.out.println("Ingrese 2 si es un vendedor");
            numero = entrada.nextInt();
           if(numero == 1){
                empleados.add(agregarAdministrativo());
            }
            else if (numero == 2) {
                empleados.add(agregarVendedor());
            }
        }

        public void agregarAdministrativo(){



        }


    }
}
