
public class EjercicioIVA {


    public static void main(String[] args) {
        double sueldo=1300.154;
        final double iva=21;
        double deduc=(iva/100);
        double res=sueldo*deduc+sueldo;
        System.out.println("Sueldo total= "+res);
        
        double juan=25.8;
        int paco=7;
        double suma=juan+paco;
        double resta=juan-paco;
        double multi=juan*paco;
        double division=juan/paco;
        double resto=juan%paco;
        System.out.println("Suma= "+suma);
        System.out.println("Resta= "+resta);
        System.out.println("Multiplicación= "+multi);
        System.out.println("División= "+division);
        System.out.println("Resto= "+resto);
    }
    
}
