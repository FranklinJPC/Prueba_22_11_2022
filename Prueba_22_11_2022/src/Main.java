import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        Metodos_main metodo = new Metodos_main();
        Cuenta_Bancaria cuenta = new Cuenta_Bancaria();
        String sino;
        try {
            do
            {
                switch (metodo.menu_inicio()) {
                    case 1:
                        switch (metodo.menu_ingreso())
                        {
                            case 1:
                                switch (metodo.menu_cuentas())
                                {
                                    case 1:
                                        double dinero;
                                        System.out.println("<---Retiro Ahorros---->");
                                        System.out.print("Dinero: ");
                                        dinero = scn.nextDouble();
                                        cuenta.retiro_ahorros(dinero);
                                        if (cuenta.retiro_ahorros(dinero) == -1)
                                            System.out.println("Error en el retiro");
                                        else
                                            cuenta.setCantidad_ahorros(cuenta.retiro_ahorros(dinero));
                                        break;
                                    case 2:
                                        double diner;
                                        System.out.println("<---Retiro Corriente---->");
                                        System.out.print("Dinero: ");
                                        diner = scn.nextDouble();
                                        cuenta.retiro_corriente(diner);
                                        if (cuenta.retiro_corriente(diner) == -1)
                                            System.out.println("Error en el retiro");
                                        else
                                            cuenta.setCantidad_corriente(cuenta.retiro_corriente(diner));
                                        break;
                                }
                                break;
                            case 2:
                                cuenta.estado_de_cuenta();
                                break;
                        }
                        break;
                    default:
                        System.out.println("Error");
                }
                System.out.print("Continuar(s/n): ");
                sino = scn.next();
            } while("s".equals(sino));
        }
        catch (Exception exc)
        {
            System.out.println("Error de " + exc);
        }
    }
}