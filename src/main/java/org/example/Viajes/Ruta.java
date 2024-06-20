package org.example.Viajes;

public class Ruta extends Pasajero{
    double precio;
    int tipo_ruta;
    String fecha_ruta;
    boolean retorno;

    public Ruta() {}

    public Ruta(String nombre, String cedula, double precio, int tipo_ruta, String fecha_ruta, boolean retorno) {
        super(nombre, cedula);
        this.precio = precio;
        this.tipo_ruta = tipo_ruta;
        this.fecha_ruta = fecha_ruta;
        this.retorno = retorno;
    }

    //Metodo Personalizado
    public void precio_ruta(){
        if (tipo_ruta == 1 ){
            System.out.println("Su ruta es de Quito-Guayaquil");
            precio=20;
        }else if (tipo_ruta == 2 ){
            System.out.println("Su ruta es de Quito-Puyo");
            precio=15;
        }else if (tipo_ruta == 3 ){
            System.out.println("Su ruta es de Quito-Tulcan");
            precio=17.50;
        }else if (tipo_ruta == 4 ){
            System.out.println("Su ruta es de Quito-Riobamba");
            precio=17.50;
        }
    }
    public void retorno_v(){
        if (retorno == true ){
            precio=precio+precio;
        }
    }

    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        precio_ruta();
        retorno_v();
        System.out.println("Su precio es:"+ precio);
        System.out.println("Fecha de Ruta: "+ fecha_ruta);
        System.out.println("Viaje retornable: "+ retorno);
    }

}
