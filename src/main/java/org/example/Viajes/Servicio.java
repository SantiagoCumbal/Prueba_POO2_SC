package org.example.Viajes;

public class Servicio extends Ticket{
    int seleccion_tipo;
    int cantidad_maleta;
    public Servicio() {}


    public Servicio(String nombre, String cedula, double precio, int tipo_ruta, String fecha_ruta, boolean retorno, int n_ticket, int n_asiento, int seleccion_tipo, int cantidad_maleta) {
        super(nombre, cedula, precio, tipo_ruta, fecha_ruta, retorno, n_ticket, n_asiento);
        this.seleccion_tipo = seleccion_tipo;
        this.cantidad_maleta = cantidad_maleta;
    }

    public int getSeleccion_tipo() {
        return seleccion_tipo;
    }

    public void setSeleccion_tipo(int seleccion_tipo) {
        this.seleccion_tipo = seleccion_tipo;
    }

    public int getCantidad_maleta() {
        return cantidad_maleta;
    }

    public void setCantidad_maleta(int cantidad_maleta) {
        this.cantidad_maleta = cantidad_maleta;
    }
    //Metodo
    public void normal_vip(){
        if (seleccion_tipo == 1 ){
            System.out.println("Tipo: Normal");
        }else if (seleccion_tipo == 2 ){
            System.out.println("Tipo: Vip");
        }
    }
    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        normal_vip();
        System.out.println("Cantidad maleta: " + cantidad_maleta);
    }
}
