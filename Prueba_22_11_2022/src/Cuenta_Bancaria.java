public class Cuenta_Bancaria
{
    /* **Atributos** */
    String id;
    String nombre;
    double cantidad_ahorros;
    double cantidad_corriente;
    String clave;

    public Cuenta_Bancaria()
    {
        id = "123456";
        nombre = "Carlos";
        cantidad_ahorros = 250;
        cantidad_corriente = 300;
        clave = "01234";
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad_ahorros() {
        return cantidad_ahorros;
    }

    public void setCantidad_ahorros(double cantidad_ahorros) {
        this.cantidad_ahorros = cantidad_ahorros;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getCantidad_corriente() {
        return cantidad_corriente;
    }

    public void setCantidad_corriente(double cantidad_corriente) {
        this.cantidad_corriente = cantidad_corriente;
    }

    /* ***Metodos*** */
    public double retiro_ahorros(double dinero) //Retiro de dinero ahorros
    {
        double salida;
        if (dinero > cantidad_ahorros)
            return -1;
        salida = cantidad_ahorros - dinero;
        return salida;
    }
    public double retiro_corriente(double dinero) //Retiro de dinero corriente
    {
        double salida;
        if (dinero > cantidad_corriente)
            return -1;
        salida = cantidad_corriente - dinero;
        return salida;
    }
    public void estado_de_cuenta()  //Ver el estado de la cuenta en el ATM
    {
        System.out.println(">-----USER " + getId() + "--------<");
        System.out.println("**" + getNombre());
        System.out.println("**Cuentas**");
        System.out.println("Ahorros: " + getCantidad_ahorros());
        System.out.println("Corriente: " + getCantidad_corriente());
    }


}
