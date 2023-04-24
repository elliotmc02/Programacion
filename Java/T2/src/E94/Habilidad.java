package E94;

public class Habilidad {

    String nombre;
    private double costeMana;
    int nivel;
    char tecla;
    private double daño;

    public Habilidad(String nombre, char tecla) {
        this.nombre = nombre;
        this.tecla = tecla;
        this.nivel = 1;
        this.costeMana = (Math.random() * 10 + 1) + (this.nivel / 2);
        this.daño = (Math.random() * 16 + 5) + (this.costeMana / 3);
    }

    public void subirNivel() {
        this.nivel++;
        this.costeMana = ((Math.random() * 10 + 1)) + (this.nivel / 2);
        this.daño = (Math.random() * 16 + 5) + (this.costeMana / 3);
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nNivel: " + this.nivel + "\nCoste de mana: " + this.costeMana +
                "\nDaño: " + this.daño + "\nTecla: " + this.tecla;
    }

}
