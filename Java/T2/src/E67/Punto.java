/*
67.- Crear la clase Punto, la cual tendrá dos atributos: X e Y. También son necesarios
los siguientes métodos:
•moverHorizontal:   recibe   un   numero   entero   con   signo   y   desplaza
horizontalmente el punto con ese valor.
•moverVertical: igual que el anterior pero verticalmente.
•mostrar: muestra el punto de la siguiente forma: Punto (X,Y)
*/

package E67;


public class Punto {

    int X;
    int Y;
    
    public void moverHorizontal(int num) {
        this.X = num;
    }
    public void moverVertical(int num) {
        this.Y = num;
    }
    public void mostrar() {
        System.out.println("Punto (" + X + "," + Y + ")");
    }
}
