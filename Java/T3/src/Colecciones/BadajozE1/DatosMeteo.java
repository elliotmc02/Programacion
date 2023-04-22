package Colecciones.BadajozE1;

import java.time.LocalDate;

public class DatosMeteo {

    private LocalDate fecha;
    private double MAX_TEMP;
    private double MIN_TEMP;
    private double MAX_HUM;
    private double MIN_HUM;
    private double precip;

    public DatosMeteo(LocalDate fecha, double MAX_TEMP, double MIN_TEMP, double MAX_HUM, double MIN_HUM, double precip) {
        this.fecha = fecha;
        this.MAX_TEMP = MAX_TEMP;
        this.MIN_TEMP = MIN_TEMP;
        this.MAX_HUM = MAX_HUM;
        this.MIN_HUM = MIN_HUM;
        this.precip = precip;
    }

    public DatosMeteo(double MAX_TEMP, double MIN_TEMP, double MAX_HUM, double MIN_HUM, double precip) {
        this.MAX_TEMP = MAX_TEMP;
        this.MIN_TEMP = MIN_TEMP;
        this.MAX_HUM = MAX_HUM;
        this.MIN_HUM = MIN_HUM;
        this.precip = precip;
        fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMAX_TEMP() {
        return MAX_TEMP;
    }

    public void setMAX_TEMP(double MAX_TEMP) {
        this.MAX_TEMP = MAX_TEMP;
    }

    public double getMIN_TEMP() {
        return MIN_TEMP;
    }

    public void setMIN_TEMP(double MIN_TEMP) {
        this.MIN_TEMP = MIN_TEMP;
    }

    public double getMAX_HUM() {
        return MAX_HUM;
    }

    public void setMAX_HUM(double MAX_HUM) {
        this.MAX_HUM = MAX_HUM;
    }

    public double getMIN_HUM() {
        return MIN_HUM;
    }

    public void setMIN_HUM(double MIN_HUM) {
        this.MIN_HUM = MIN_HUM;
    }

    public double getPrecip() {
        return precip;
    }

    public void setPrecip(double precip) {
        this.precip = precip;
    }

    @Override
    public String toString() {
        return "Datos meteorologicos: \nFecha: " + this.fecha + "\nTemperatura maxima: " + this.MAX_TEMP + "\nTemperatura minima: " + this.MIN_TEMP + "\nHumedad maxima: " + this.MAX_HUM + "\nHumedad minima: " + this.MIN_HUM + "\nPrecipitaciones: " + this.precip;
    }

}
