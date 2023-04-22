package E82;

public class Estrella {

    int x;
    int y;
    char forma;

    public Estrella(int x, int y) {
        this.x = x;
        this.y = y;

        if ((int)(Math.random() * 3)+1 == 1) {
            forma = '*';
        }
        else {
            forma = '.';
        }
    }

    @Override
    public String toString() {
        //return Character.toString(forma);
        return this.forma+"";
    }

}
