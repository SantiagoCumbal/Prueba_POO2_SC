package org.example.Viajes;

public class VIP extends Servicio{
    String adicional;
    double PrecioVIP;
    double PrecioMaleta;

    public VIP() {}


    public VIP(String nombre, String cedula, double precio, int tipo_ruta, String fecha_ruta, boolean retorno, int n_ticket, int n_asiento, int seleccion_tipo, int cantidad_maleta, String adicional, double PrecioVIP, double PrecioMaleta) {
        super(nombre, cedula, precio, tipo_ruta, fecha_ruta, retorno, n_ticket, n_asiento, seleccion_tipo, cantidad_maleta);
        this.adicional = adicional;
        this.PrecioVIP = PrecioVIP;
        this.PrecioMaleta = PrecioMaleta;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public double getPrecioVIP() {
        return PrecioVIP;
    }

    public void setPrecioVIP(double precioVIP) {
        PrecioVIP = precioVIP;
    }

    //Mostrar datos

    public void PrecioVIP(double precioVIP) {
        PrecioVIP = precio * (30/100);
        precio = precio + PrecioVIP;
    }

    public void PrecioMaleta(double precioMaleta) {
        PrecioMaleta = 3* cantidad_maleta;
        precio = precio + PrecioMaleta;
    }

    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        System.out.println("Precio total: " + precio);
    }

}
