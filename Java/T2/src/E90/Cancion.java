package E90;

public class Cancion extends Multimedia {

    private String artista;
    private String editor;
    private String genero;
    private final String generos[] = {"pop", "rock", "flamenco", "hiphop", "R&B", "reggaeton"};

    public Cancion(String titulo, String formato, int duracion, String artista, String editor, String genero) {
        super(titulo, formato, duracion);
        this.artista = artista;
        this.editor = editor;

        for (int i = 0; i < generos.length; i++) {
            if (genero.equalsIgnoreCase(generos[i])) {
                this.genero = genero;
            } else {
                this.genero = "rock";
            }
        }
    }

    public String getArtista() {
        return this.artista;
    }
    public String getEditor() {
        return this.editor;
    }
    public String getGenero() {
        return this.genero;
    }
    @Override
    public String toString() {
        return super.toString() + "\nArtista: " + this.artista + "\nEditor: " + this.editor + "\nGenero: " + this.genero;
    }

}
