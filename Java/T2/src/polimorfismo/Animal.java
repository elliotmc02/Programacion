package polimorfismo;

public class Animal {

    public String nombre;
    double peso;

    public Animal(String nombre) {
        super();
        this.nombre = nombre;
    }

    public void dormir() {
        System.out.println("ZZZ");
    }

    @Override
    public String toString() {
        return "Animal llamado " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        boolean iguales = true;

        if (o == null) {
            return false;
        }

        if (this == o) {
            return true;
        }

        if (o instanceof Animal) {
            Animal otroAnimal = (Animal) o;
            iguales = iguales && this.nombre.equals(otroAnimal.nombre);
            iguales = iguales && this.peso == otroAnimal.peso;
        }

        return iguales;
    }
}
