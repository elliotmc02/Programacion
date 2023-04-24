/*
71.- Crea una clase Aritmética, la cual tendrá dos valores numéricos decimales como
propiedades de clase y los métodos necesarios para calcular (que no mostrar), la suma,
resta, multiplicación, división y potencia de esos valores. 
*/

package E71;


public class E71 {

    public static void main(String[] args) {

        Aritmetica payo = new Aritmetica(12, 32);
        
        payo.cSuma();
        payo.cResta();
        payo.cMulti();
        payo.cDivision();
        payo.cPotencia();
        
        System.out.println(payo);

    }

}
