package org.example;


import org.example.Viajes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pasajero pa1 = new Pasajero("Juan","11111");
        Ruta obj1 = new Ruta(pa1.getNombre(), pa1.getCedula(),0,2,"Enero",true);
        //obj1.mostrar_datos();
        Ticket obj2 = new Ticket("Luisa", "1232343",0,4,"11/05/2021",true,1111,3);
        //obj2.mostrar_datos();
        Servicio obj3 = new Servicio("Carlos","111233",0,3,"14/05/2222",false,1111,23,2,3);
        //obj3.mostrar_datos();
        Pasajero pa2 = new Pasajero("Juan","11111");
        //pa2.mostrar_datos();

    }
}