package Colecciones.BadajozE3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionEventos {

    ArrayList<Evento> eventos;

    public GestionEventos() {
        this.eventos = new ArrayList<>();
    }

    public void nuevoElemento(Evento e) {
        this.eventos.add(e);
    }

    public String listaEventos() {
        String str = "";
        for (Evento e : this.eventos) {
            str += e.toString() + System.lineSeparator();
        }
        return str;
    }

    public String listaEventos(int ano) {
        String str = "";
        for (Evento e : this.eventos) {
            if (e.getFecha().getYear() == ano) {
                str += e.toString() + System.lineSeparator();
            }
        }
        return str;
    }

    public String listaEventos(int ano, int mes) {
        String str = "";
        for (Evento e : this.eventos) {
            if (e.getFecha().getYear() == ano && e.getFecha().getMonthValue() == mes) {
                str += e.toString() + System.lineSeparator();
            }
        }
        return str;
    }

    public String listaEventos(int ano, int mes, int dia) {
        String str = "";
        for (Evento e : this.eventos) {
            if (e.getFecha().getYear() == ano && e.getFecha().getMonthValue() == mes && e.getFecha().getDayOfMonth() == dia) {
                str += e.toString() + System.lineSeparator();
            }
        }
        return str;
    }

    public String listaEventos(LocalDate date) {
        String str = "";
        for (Evento e : this.eventos) {
            if (e.getFecha().isEqual(date)) {
                str += e.toString() + System.lineSeparator();
            }
        }
        return str;
    }

    public String mostrarEventos() {
        String str = "";

        return str;
    }

    public void eliminarEvento(int ano, int mes) {
        Iterator<Evento> iterator = this.eventos.iterator();
        while (iterator.hasNext()) {
            Evento e = (Evento) iterator.next();
            if (e.getFecha().getYear() == ano && e.getFecha().getMonthValue() == mes) {
                iterator.remove();
                System.out.println("Evento eliminado");
            }
        }
    }
}
