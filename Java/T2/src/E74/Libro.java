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


public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int paginas;
    
    /*public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }*/
    
    public void setISBN (int nuevo) {
        this.ISBN = nuevo;
    }
    public void settitulo (String nuevo) {
        this.titulo = nuevo;
    }
    public void setautor (String nuevo) {
        this.autor = nuevo;
    }
    public void setpaginas (int nuevo) {
        this.paginas = nuevo;
    }
    
    public int getISBN () {
        return this.ISBN;
    }
    public String gettitulo () {
        return this.titulo;
    }
    public String getautor () {
        return this.autor;
    }
    public int getpaginas () {
        return this.paginas;
    }
    
    public String toString() {
        String res = "";
        
        res += "El libro " + this.titulo + " con " + this.ISBN + " creado por " + this.autor + " tiene " + this.paginas + " paginas";
        
        return res;
    }
}
