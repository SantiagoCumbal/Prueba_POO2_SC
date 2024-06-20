package org.example.Viajes;

public class Normal extends Servicio{
    String puesto;

    public Normal() {}

    public Normal(String nombre, String cedula, double precio, int tipo_ruta, String fecha_ruta, boolean retorno, int n_ticket, int n_asiento, int seleccion_tipo, int cantidad_maleta, String puesto) {
        super(nombre, cedula, precio, tipo_ruta, fecha_ruta, retorno, n_ticket, n_asiento, seleccion_tipo, cantidad_maleta);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    //Metodo



    public void cargo_maleta() {
        if (cantidad_maleta>1){
            int cargo=cantidad_maleta*3;
            precio=precio+cargo;
        }
    }

    @Override
    public void mostrar_datos() {

        super.mostrar_datos();
        cargo_maleta();
        System.out.println("Precio total: " + precio);
    }


}
