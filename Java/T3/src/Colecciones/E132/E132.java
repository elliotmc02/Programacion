package Colecciones.E132;

public class E132 {

    public static void main(String[] args) {

        Instituto i1 = new Instituto();
        
        i1.aniadirAlumno("Manolo", "Malaga");
        i1.aniadirAlumno("Paco", "Cadiz");
        i1.aniadirAlumno("Pepe", "Huelva");
        i1.aniadirAlumno("Carlitos", "Malaga");
        i1.aniadirAlumno("Gumersindo", "Cadiz");
        
        System.out.println("Cantidad de ciudades: " + i1.cantidadCiudades());
        
        System.out.println("Motrar ciudad: ");
        i1.mostrarCiudad("Malaga");
        
        System.out.println("Mostrar datos:" + i1.mostrarDatos());
        
        System.out.println("Resumen: \n" + i1.resumen());

        
        
    }

}
