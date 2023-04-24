package polimorfismo;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    /*
    @Override
    public void dormir() {
        System.out.println("GGG");
    }*/

    @Override
    public String toString() {
        return "Gato llamado " + super.nombre;
    }
}
