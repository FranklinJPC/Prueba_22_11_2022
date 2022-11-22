import java.util.Scanner;

public class Metodos_main
{
    public Scanner scn = new Scanner(System.in);
    public int menu_inicio()
    {
        int opcion;
        System.out.println(">-------ATM BANCO XXXXX----------<");
        System.out.println("1. Ingreso de tarjeta");
        System.out.println("0. SALIR");
        System.out.print("\nEscoga una opcion: ");
        opcion = scn.nextInt();
        return opcion;
    }
    public int menu_ingreso()
    {
        int retorno;
        System.out.println(">-------BIENVENIDO USER-------<");
        System.out.println("1. Retiro");
        System.out.println("2. Estado de cuenta");
        System.out.print("\nEscoga: ");
        retorno = scn.nextInt();
        return retorno;
    }
    public int menu_cuentas()
    {
        int retorno;
        System.out.println(">-------BIENVENIDO USER-------<");
        System.out.println("**Por que medio desea hacer su retiro?");
        System.out.println("1. Cuenta de ahorros");
        System.out.println("2. Cuenta corriente");
        System.out.print("\nEscoga: ");
        retorno = scn.nextInt();
        return retorno;
    }
}
