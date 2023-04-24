package E90;


public class testMultimedia {

    public static void main(String[] args) {

        Multimedia M = new Multimedia("Test", "mp3", 50);
        Pelicula P = new Pelicula("TestPeli", "mp4", 120, "rulas", "lana");
        Cancion C = new Cancion("testcancion", "mov", 300, "el trancas", "morales", "hiphop");
        
        M.equals(P);
        M.equals(C);
        
        M.getDuracion();
        M.getFormato();
        M.getTitulo();
        System.out.println(M);
        
        P.equals(M);
        P.getActor();
        P.getActriz();
        System.out.println(P);
        
        C.getArtista();
        C.getEditor();
        C.getFormato();
        System.out.println(C);

    }

}
