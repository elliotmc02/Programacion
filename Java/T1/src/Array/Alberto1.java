/*
- Crea un array de 100 cajones
- Mete valores aleatorios entre 1 y 100
- Crea otro array diferente que contenga
los números pares del primer array
- Muéstralo por pantalla
*/


package Array;

public class Alberto1 {

    public static void main(String[] args) {
        
        int lista[] = new int[100];
        int i, pares = 0;
        
        for(i = 0; i < lista.length; i++) {
            
            lista[i] = (int)((Math.random() * (100))+1);
            
            if (lista[i] % 2 == 0) {
                pares++;
            }
            
        }
        
        int listaPares[] = new int[pares];
        int cajonPar = 0;
        
        for(i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                listaPares[cajonPar] = lista[i];
                if (cajonPar == listaPares.length - 1) {
                    System.out.println(listaPares[cajonPar] + " ");
                }
                else {
                    System.out.print(listaPares[cajonPar] + ", ");
                }
                cajonPar++;
            }
            
        }
        
        
    }

}
