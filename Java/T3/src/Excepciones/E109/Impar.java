

package Excepciones.E109;


public class Impar {

    int numero;
    
    public Impar(int numero) throws Exception {
        if (numero%2 == 0) throw new Exception("El numero no es impar");
        
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Numero: " + this.numero;
    }
    
}
