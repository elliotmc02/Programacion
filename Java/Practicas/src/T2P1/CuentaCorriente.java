package T2P1;

//Elliot Moyano Cutler
// He hecho todos los apartados
public class CuentaCorriente {

    // Apartado A
    // Apartado C private
    private double saldo;
    private double limite;
    final String nombre;
    private final String DNI;
    private final String banco = "Sr Hormiga Bank";

    public CuentaCorriente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = 0;
        this.limite = -100;
    }

    //Apartado B constructor
    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        this.limite = 0;
        this.nombre = "Sin datos";
        this.DNI = "Sin datos";
    }

    public CuentaCorriente(double saldo, double limite, String DNI) {
        this.saldo = saldo;
        this.limite = limite;
        this.DNI = DNI;
        this.nombre = "Sin datos";
    }
    
    // Apartado D constructor copia
    public CuentaCorriente(CuentaCorriente copia) {
        this.nombre = copia.nombre;
        this.limite = copia.limite;
        this.saldo = copia.saldo;
        this.DNI = copia.DNI;
    }
    

    // Metodo privado para confirmar si se puede retirar
    private boolean confirmarRetirada(double cantidad) {
        if (cantidad > 0) { // no puedes sacar dinero negativo
            return this.saldo - cantidad >= this.limite;
        }
        else {
            return false;
        }
    }

    // Metodo para sacar dinero
    public void sacarDinero(double cantidad) {
        this.confirmarRetirada(cantidad); // Llamo al metodo para comprobar si puedo
        if (this.confirmarRetirada(cantidad)) { //Si es true,
            this.saldo -= cantidad;//Saco el dinero
        }
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    // Apartado C
    public void setSaldo(double cantidad) {
        this.saldo = cantidad;
    }

    public void setLimite(double cantidad) {
        this.limite = cantidad;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public String getDNI() {
        return this.DNI;
    }

    @Override
    public String toString() {
        return "Banco " + this.banco + "\nTitular: " + this.nombre + " DNI: " + this.DNI + "\nSaldo: " + this.saldo
                + "\nLimite: " + this.limite;
    }
}
