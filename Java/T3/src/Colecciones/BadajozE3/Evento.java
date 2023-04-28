package Colecciones.BadajozE3;

import java.time.LocalDate;

public class Evento {

    private LocalDate fecha;
    private String descripcion;
    private double precio;
    private String lugar;

    public Evento(LocalDate fecha, String descripcion, double precio, String lugar) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.precio = precio;
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Evento{" + "fecha=" + fecha + ", descripcion=" + descripcion + ", precio=" + precio + ", lugar=" + lugar + '}';
    }
    
    
    
}
