package polimorfismo;

public class Perro extends Animal{
    public String raza;
    
    public Perro(String nombre, String raza){
        super(nombre);
        this.raza = raza;
    }
    
    @Override
    public void dormir(){
        System.out.println("PPP");
    }
    
    public void perrear(){
        System.out.println("Perro perreando");
    }
    
    /*
    @Override
    public String toString() {
        return "Perro llamado " + super.nombre + " raza: " + raza;
    }
*/
}
