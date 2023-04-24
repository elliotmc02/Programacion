/*
74.- Crear una clase Libro que contenga los siguientes atributos: ISBN, Titulo, Autor,
Número de páginas (todos obligatorios y privados).
Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el
método  toString()  para mostrar la información relativa al libro con el siguiente
formato: “El libro TITULO con ISBN creado por AUTOR tiene NPAGINAS”
Para probar la clase, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por
pantalla. Por último, indicar cuál de los 2 tiene más páginas
*/

package E74;


public class E74 {

    public static void main(String[] args) {

        //Libro libro1 = new Libro(6356, "las aventuras de manolo", "Manolo", 4029);
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.setISBN(3535);
        libro1.setautor("Manolo");
        libro1.settitulo("Las aventuras de Manolo");
        libro1.setpaginas(4040);
        
        libro2.setISBN(2424);
        libro2.setautor("Rigoberto");
        libro2.settitulo("el morales y rigoberto");
        libro2.setpaginas(12);
        
        System.out.println("ISBN libro 1: " + libro1.getISBN());
        System.out.println("Autor libro 1: " + libro1.getautor());
        System.out.println("Titulo libro 1: " + libro1.gettitulo());
        System.out.println("Paginas libro 1: " + libro1.getpaginas());
        
        System.out.println("ISBN libro 2: " + libro2.getISBN());
        System.out.println("Autor libro 2: " + libro2.getautor());
        System.out.println("Titulo libro 2: " + libro2.gettitulo());
        System.out.println("Paginas libro 2: " + libro2.getpaginas());
        
        System.out.println(libro1);
        System.out.println(libro2);
        
    }

}
