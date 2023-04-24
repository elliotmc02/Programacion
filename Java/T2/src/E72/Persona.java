package E72;


public class Persona {

    String nombre;
    int edad;
    char sexo;
    String pais;
    boolean mayor;
    
    public Persona (String nombre, int edad, char sexo, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.pais = pais;
    }
    
    public void saludar() {
        String saludo = "Hola! Me llamo " + this.nombre + " y soy de " + this.pais;
        return;
    }
    
    public void saludar(int tipo) {
        String saludo = "Hola! Me llamo " + this.nombre + " y soy de " + this.pais;
        switch (tipo) {
            case 1: saludo = "hijo de puta";
            break;
            case 2: saludo = "bonjour";
            break;
            case 3: saludo = "hello";
            break;
        }
        return;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nSexo: " + this.sexo + "\nPais: " + this.pais);
    }
    
    public void esMayorEdad() {
        if (this.edad >= 18) {
            mayor = true;
            System.out.println("Es mayor de edad");
        }
        else {
            mayor = false;
            System.out.println("Es menor de edad");
        }
    }
    
    public String toString() {
        String res = "";
        res += "Se llama " + this.nombre + ", tiene " + this.edad + " años";
        if (this.sexo == 'M') {
            res += ", es hombre";
        }
        else {
            res += ", es mujer";
        }
        res += " y es de " + this.pais;
        return res;
    }
}
