package Colecciones.BadajozE1;

import java.util.ArrayList;

public class GestionDatosMeteo {

    private ArrayList<DatosMeteo> datosMeteo;

    public GestionDatosMeteo() {
        datosMeteo = new ArrayList<>();
    }

    public void anadirDatos(DatosMeteo datosMeteo) {
        this.datosMeteo.add(datosMeteo);
    }

    public double mediaTempMax() {
        double suma = 0;
        for (DatosMeteo list : this.datosMeteo) {
            suma += list.getMAX_TEMP();
        }
        return (suma / this.datosMeteo.size());
    }

    public double mediaTempMax(int mes, int ano) {
        double suma = 0;
        int contador = 0;
        for (DatosMeteo list : this.datosMeteo) {
            if (list.getFecha().getMonthValue() == mes && list.getFecha().getYear() == ano) {
                suma += list.getMAX_TEMP();
                contador++;
            }
        }
        return (suma / contador);
    }

    public int numeroRegistros() {
        return this.datosMeteo.size();
    }

}
