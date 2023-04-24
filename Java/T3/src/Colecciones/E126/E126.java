package Colecciones.E126;



public class E126 {

    public static void main(String[] args) {

        Persona raul = new Persona("534", "raul", "morales", "masculino", 13, 12);
        Persona rulas = new Persona("36", "rulas", "morales", "masculino", 14, 17);
        Persona rulon = new Persona("12", "rulon", "morales", "masculino", 13, 12);
        Persona rulilla = new Persona("85", "rulilla", "morales", "femenino", 1, 198);
        
        Cola mercapollas = new Cola();
        
        
        mercapollas.Entrar(raul);
        mercapollas.Entrar(rulas);
        mercapollas.Entrar(rulon);
        mercapollas.Entrar(rulilla);
        
        System.out.println((mercapollas.EstaVacia() ? "Esta vacia" : "No está vacia"));
        
        System.out.println("Personas: " + mercapollas.Cantidad());
        
        System.out.println("Sale: ");
        System.out.println(mercapollas.Salir());
        
        System.out.println("Primero en la cola: ");
        System.out.println(mercapollas.Primero());

    }

}
