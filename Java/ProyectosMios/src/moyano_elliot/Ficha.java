/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moyano_elliot;

public class Ficha {

    private int fila;
    private int columna;
    private int color;

    public Ficha(int color) {
        this.fila = 1;
        this.columna = 1;
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }
    
    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String toString() {
        return "[" + (this.color == 1 ? "rojo" : "azul") + ":(" + this.fila + "," + this.columna;
    }

}
