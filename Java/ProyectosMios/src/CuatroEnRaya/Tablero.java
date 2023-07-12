/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuatroEnRaya;

public class Tablero {

    private Ficha tablero[][];

    public Tablero(int filas, int columnas) {
        this.tablero = new Ficha[filas][columnas];
    }

    public Tablero() {
        this.tablero = new Ficha[6][7];
    }

    public int meterFicha(int color, int columna) {
        Ficha ficha = new Ficha(color);
        if (columna > tablero[0].length) {
            throw new TableroException("Esa columna no existe");
        }
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][columna] == null) {
                ficha.setFila(i);
                ficha.setColumna(columna);
                tablero[i][columna] = ficha;
                return i;
            }
        }
        return -1;
    }

    public boolean cuatroEnRaya(int fila, int columna) {
        if (fila > tablero.length || columna > tablero[0].length) {
            throw new TableroException("Las coordenadas no son correctas");
        }
        if (tablero[fila][columna] == null) {
            return false;
        }
        int color = tablero[fila][columna].getColor();
        int contador = 0;

        //comprobar columnas
        for (int i = fila; i < tablero.length; i++) {
            for (int j = columna; j < tablero[i].length; j++) {
                if (tablero[i][j].getColor() == color) {
                    contador++;
                    if (contador == 4) {
                        return true;
                    }
                } else {
                    contador = 0;
                }
            }
        }
        // comprobar filas
        for (int i = fila; i < tablero.length; i++) {
            if (tablero[fila][columna].getColor() == tablero[i][0].getColor()) {
                contador++;
                if (contador == 4) {
                    return true;
                }
            } else {
                contador = 0;
            }
        }
        // comprobar diagonal
        for (int i = fila; i < tablero.length; i++) {
            for (int j = columna; j < tablero[i].length; j++) {
                if (i == j) {
                    if (tablero[i][j].getColor() == color) {
                        contador++;
                        if (contador == 4) {
                            return true;
                        }
                    } else {
                        contador = 0;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                str += "[" + (tablero[i][j] == null ? "null" : (tablero[i][j].getColor() == 1 ? "rojo" : "azul")) + "]";
            }
            str += System.lineSeparator();
        }
        return str;
    }

}
