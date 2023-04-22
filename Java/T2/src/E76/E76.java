/*
•Mientras quede más de una bola en la urna, se sacan dos bolas:
◦Si ambas son del mismo color, se mete una bola blanca en la urna.
◦Si son de diferente color, metemos una bola negra.
•Por último, cuando quede una sola bola, se saca y se indica su color,
Hay que analizar si, partiendo del número de bolas iniciales, la última bola que indica el
test es correcta. Para ello recomiendo implementar un modo verbose, es decir, un modo
que vaya indicando qué va pasando
*/

package E76;


public class E76 {

    public static void main(String[] args) {

        int bNegras = (int)((Math.random() * 10) +1);
        int bBlancas = (int)((Math.random() * 10) +1);
        char b1, b2;
        Urna uni = new Urna(bNegras, bBlancas);
        
        System.out.println("Urna creada con " + bBlancas + " bolas blancas y "
        + bNegras + " bolas negras");
        
        if ((uni.mostrarBolas()) > 1) {
            uni.extraerBola(2);
        }
        else {
            uni.extraerBola(1);
        }

    }

}
