
package E75;


public class E75 {

    public static void main(String[] args) {

        Cuenta caixa = new Cuenta("felipe");
        
        caixa.setCantidad(4032.63);
        caixa.setTitular("Paco");
        
        caixa.ingresar(1000);
        caixa.retirar(6000);
        
        System.out.println(caixa.getCantidad());
        System.out.println(caixa.getTitular());
        
        System.out.println(caixa);

    }

}
