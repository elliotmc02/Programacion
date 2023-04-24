

package E90;


public class Multimedia {

    private String titulo;
    private String formato;
    private int duracion;
    private final String formatos[] = {"mp3","wav","aac","mp4","mkv","mov","flv"};
    
    public Multimedia(String titulo, String formato, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        
        for (int i = 0; i < formatos.length; i++) {
            if (formato.equalsIgnoreCase(formatos[i])) {
                this.formato = formato;
            }
            else {
                this.formato = "mp3";
            }
        }
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getFormato() {
        return this.formato;
    }
    
    public int getDuracion() {
        return this.duracion;
    }
    
    public boolean equals(Multimedia archivo) {
        return this.formato.equals(archivo.formato) && this.duracion == archivo.duracion;
    }
    @Override
    public String toString() {
        return "Titulo: " + this.titulo + "\nFormato: " + this.formato + "\nDuracion: " + this.duracion;
    }
    
}
