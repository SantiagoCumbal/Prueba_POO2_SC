package org.example;

public class Ruta extends Pasajero{
    int tipo_ruta;
    double precio;
    String fecha_ruta;
    boolean retorno;

    public Ruta() {}

    public Ruta(String nombre, String cedula, int tipo_ruta, double precio, String fecha_ruta, boolean retorno) {
        super(nombre, cedula);
        this.tipo_ruta = tipo_ruta;
        this.precio = precio;
        this.fecha_ruta = fecha_ruta;
        this.retorno = retorno;
    }

    public int getTipo_ruta() {
        return tipo_ruta;
    }

    public void setTipo_ruta(int tipo_ruta) {
        this.tipo_ruta = tipo_ruta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha_ruta() {
        return fecha_ruta;
    }

    public void setFecha_ruta(String fecha_ruta) {
        this.fecha_ruta = fecha_ruta;
    }

    public boolean isRetorno() {
        return retorno;
    }

    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }

    //Metodo Personalizado
    public void precio_ruta(){
        if (tipo_ruta == 1 ){
            System.out.println("Su ruta es de Quito-Guayaquil");
            precio=20;
            System.out.println("Su precio es:"+precio);
        }else if (tipo_ruta == 2 ){
            System.out.println("Su ruta es de Quito-Puyo");
            precio=15;
            System.out.println("Su precio es:"+precio);
        }else if (tipo_ruta == 3 ){
            System.out.println("Su ruta es de Quito-Tulcan");
            precio=17.50;
            System.out.println("Su precio es:"+precio);
        }else if (tipo_ruta == 4 ){
            System.out.println("Su ruta es de Quito-Riobamba");
            precio=17.50;
            System.out.println("Su precio es:"+precio);
        }
    }
    public double retorno(){
        if (retorno == true ){
            System.out.println("Existe retorno");
            precio=precio+precio;
        }else(retorno == false) {
            System.out.println("No existe retorno");
        }
        return precio;
    }

    @Override
    public void mostrar_datos() {
        super.mostrar_datos();
        precio_ruta();
        System.out.println("Fecha de Ruta: "+fecha_ruta);
        System.out.println("Viaje retornable: "+retorno);
        }
    }
}
