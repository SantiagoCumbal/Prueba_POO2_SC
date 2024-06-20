package org.example.Viajes;

public class VIP extends Servicio{
    String adicional;

    public VIP() {}


    public VIP(String nombre, String cedula, double precio, int tipo_ruta, String fecha_ruta, boolean retorno, int n_ticket, int n_asiento, int seleccion_tipo, int cantidad_maleta, String adicional) {
        super(nombre, cedula, precio, tipo_ruta, fecha_ruta, retorno, n_ticket, n_asiento, seleccion_tipo, cantidad_maleta);
        this.adicional = adicional;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    //Mostrar datos


    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
    }
}
