package Colecciones.BadajozE3;

import java.time.LocalDate;


public class E2 {

    public static void main(String[] args) {
        
        GestionEventos gE = new GestionEventos();
        
        gE.nuevoElemento(new Evento(LocalDate.now(), "Jarfaiter", 10, "Malaga"));
        gE.nuevoElemento(new Evento(LocalDate.of(2019, 2, 7), "Prok", 13, "Paris 15"));
        gE.nuevoElemento(new Evento(LocalDate.of(2020, 3, 7), "Fernando costa", 15, "Malaga"));
        gE.nuevoElemento(new Evento(LocalDate.of(2020, 5, 26), "Hard Gz", 12, "Malaga"));
        gE.nuevoElemento(new Evento(LocalDate.of(2021, 8, 17), "El Fary", 200, "Malaga"));
        
        System.out.println(gE.listaEventos());
        System.out.println(gE.listaEventos(LocalDate.now()));
        System.out.println(gE.listaEventos(2019));
        System.out.println(gE.listaEventos(2020, 5));
        System.out.println(gE.listaEventos(2020, 3, 7));
        
        gE.eliminarEvento(2021, 8);
        
        System.out.println(gE.listaEventos());
        
    }

}
