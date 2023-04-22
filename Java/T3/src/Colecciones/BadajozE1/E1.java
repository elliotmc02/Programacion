package Colecciones.BadajozE1;

import java.time.LocalDate;

public class E1 {

    public static void main(String[] args) {

        GestionDatosMeteo gestion = new GestionDatosMeteo();
        
        gestion.anadirDatos(new DatosMeteo(LocalDate.now(), 45.4, 20.6, 70.1, 45.5, 13.1));
        gestion.anadirDatos(new DatosMeteo(LocalDate.of(2020, 12, 31), 25.9, 6.3, 35.8, 12.4, 6.9));
        gestion.anadirDatos(new DatosMeteo(25, 6, 35, 12, 6));
        System.out.println(gestion.mediaTempMax());
        System.out.println(gestion.mediaTempMax(4, 2023));
        System.out.println(gestion.numeroRegistros());
        
    }

}
