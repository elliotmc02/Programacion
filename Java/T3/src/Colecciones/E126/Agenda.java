

package Colecciones.E126;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> agenda;
    
    public Agenda() {
        agenda = new ArrayList<>();
    }
    
    public void AniadirPersona(Persona p) {
        this.agenda.add(p);
    }
    
    public void BorrarPersona(String DNI) {
       for (Persona x: this.agenda) {
           if (DNI.equals(x.getDNI()))
           this.agenda.remove(this.agenda.indexOf(x));
       }
    }
    public void BuscarPersona(String DNI) {
       for (Persona x: this.agenda) {
           this.agenda.get(this.agenda.indexOf(x.getDNI()));
       }
    }
    
}
