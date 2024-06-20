package org.example.Viajes;

public class Pasajero {
    String nombre;
    String cedula;

    public Pasajero() {}
    public Pasajero(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    //Metodo
    public void mostrar_datos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
    }
}
