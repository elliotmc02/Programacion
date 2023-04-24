

package E101;


abstract class InstrumentoDeViento extends Instrumento {
    boolean metal;//Si no es de metal, se trata de madera.
    
    
    public InstrumentoDeViento(boolean metal,String string, int entero, int entero2){
        super(string, entero, entero2);
        this.metal=metal;
    }
    
    

}
