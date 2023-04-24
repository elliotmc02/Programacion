package E72;


public class E72 {

    public static void main(String[] args) {

        Persona paco = new Persona("Paco", 14, 'F', "Botsuana");

        int tipo = (int) (Math.random() * 3)+1;
        paco.saludar(tipo);
        paco.mostrarDatos();
        paco.esMayorEdad();
        System.out.println(paco);
    }

}
