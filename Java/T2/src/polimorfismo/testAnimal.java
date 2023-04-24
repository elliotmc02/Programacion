package polimorfismo;

public class testAnimal {

    public static void main(String[] args) {
        String nombre = "ejemplo";

        Animal a1 = new Animal(nombre + "1");

        Animal a2 = new Perro(nombre + "2", "Bulldog");
        Animal a3 = new Gato(nombre + "3");

        if (a2 instanceof Perro) {
            Perro hola = (Perro) a2;
            hola.perrear();
        }

        //System.out.println(a2);
        //System.out.println(a3);
        Perro a4 = new Perro(nombre + "4", "Beagle");
        Gato a5 = new Gato(nombre + "5");

        //Perro a6 = new Animal(nombre+"6"); // NO funciona nunca
        //Gato a7 = new Animal(nombre+"7"); // NO funciona nunca
        
        Animal a8;
        Perro a9 = new Perro(nombre + "9", "Chihuahua");
        a8 = a9;

        //a8.perrear(); // No funciona nunca
        //a9.perrear(); // Si funciona siempre
        
        //Funciona siempre
        Animal a10 = (Animal) a4; // a4 = perro

        // Funciona a veces
        // recomendable usar instanceof
        //Perro a11 = (Perro) a1; //a1 = animal
        
        
        Animal[] arrayAnimales = new Animal[15];

        for (int i = 0; i < arrayAnimales.length; i++) {
            if (i % 3 == 0) {
                arrayAnimales[i] = new Animal("pepe");
            } else if (i % 3 == 1) {
                arrayAnimales[i] = new Perro("toby", "raza");
            } else {
                arrayAnimales[i] = new Gato("pepe");
            }
        }

        for (int i = 0; i < arrayAnimales.length; i++) {
            if (arrayAnimales[i] instanceof Perro) {
                Perro tmpPerro = (Perro) arrayAnimales[i];
                tmpPerro.perrear();
            }
        }
    }
}
