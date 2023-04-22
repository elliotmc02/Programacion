package T2P1;

//Elliot Moyano Cutler
public class testCuentaCorriente {

    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Jaime Hormiga", "23567897F");

        cuenta1.setLimite(-50);
        cuenta1.ingresarDinero(1000);
        cuenta1.sacarDinero(300);
        System.out.println(cuenta1);
        cuenta1.sacarDinero(700);
        cuenta1.sacarDinero(200);
        CuentaCorriente cuenta2 = new CuentaCorriente(9000);
        cuenta2 = cuenta1;
        cuenta2.sacarDinero(500);
        System.out.println(cuenta2);

    }

}

/*
- Te puedo admitir que el banco sea una constante (final), pero ni el nombre, ni el DNI deben serlo. Esos datos de una cuenta corriente pueden cambiar

Apartado A

* El método sacarDinero debe devolver algo (lo pone el enunciado). Me da lo mismo como lo hagas siempre y cuando hagas lo que se indique.

Apartado E

* La copia que haces de las cuentas (linea 16) no es correcta ¿no recuerdas que pasaba si hacías eso?
 */
