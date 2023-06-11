package Cuentas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        Scanner sc = new Scanner(System.in);
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        System.out.println("Introduce el tipo de operacion");
        String tipo = sc.nextLine();
        System.out.println("Introduce la cantidad");
        float cantidad = sc.nextInt(); sc.nextLine();
        
        
        operativa_cuenta(cuenta1, cantidad, tipo);
        
        System.out.println("Saldo actual: " + cuenta1.estado());
    }
    
    /**
     * Este método llama a los metodos retirar o ingresar de la clase CCuenta dependiendo de la eleccón del usuario
     * @param cuenta hay que pasarle la cuenta sobre la que se quiere operar
     * @param cantidad cantidad de dinero
     * @param tipo tipo de operacion(retiro o ingreso)
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad, String tipo) {
        if (tipo.equalsIgnoreCase("retirar") || tipo.equalsIgnoreCase("retiro")) {
            try {
                System.out.println("Retiro en cuenta");
                cuenta.retirar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
        } else if (tipo.equalsIgnoreCase("ingresar") || tipo.equalsIgnoreCase("ingreso")) {
            try {
                System.out.println("Ingreso en cuenta");
                cuenta.ingresar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        }
    }
}
