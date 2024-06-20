package org.example.Viajes;

public class Ticket extends Ruta {
    int n_ticket;
    int n_asiento;
    public Ticket() {}

    public Ticket(String nombre, String cedula, double precio, int tipo_ruta, String fecha_ruta, boolean retorno, int n_ticket, int n_asiento) {
        super(nombre, cedula, precio, tipo_ruta, fecha_ruta, retorno);
        this.n_ticket = n_ticket;
        this.n_asiento = n_asiento;
    }

    public int getN_ticket() {
        return n_ticket;
    }

    public void setN_ticket(int n_ticket) {
        this.n_ticket = n_ticket;
    }

    public int getN_asiento() {
        return n_asiento;
    }

    public void setN_asiento(int n_asiento) {
        this.n_asiento = n_asiento;
    }

    //Metodos

    @Override
    public void mostrar_datos() {
        System.out.println("Numero de Ticket: " + n_ticket);
        System.out.println("Numero de Asiento: " + n_asiento);
        super.mostrar_datos();
    }
}
