
package E101;


public class Bongos extends InstrumentoDePercusion {
    int cajasQueLoComponen;
    boolean pielNatural;//En caso de que este boolean sea falso, se trata de pien sintética
    
    public Bongos(int numeroCajas, boolean pielNatural, boolean usaBaquetas, String string, int entero, int entero2){
        super(usaBaquetas, string, entero, entero2);
        if(numeroCajas<2){
            numeroCajas=2;
        }
        this.cajasQueLoComponen=numeroCajas;
        this.pielNatural=pielNatural;
        
    }
    @Override
    public String afinarse(){
        return "Se han ajustado los "+this.cajasQueLoComponen+" pernos de los bongos";
    }
        public String tocarPartitura(){
        this.enUso=true;
        String cancion = "";//Creamos un string donde vamos a guardar la "cancion" que emitan los bongos
        
        Nota cancionATocar[] = this.partituraDelInstrumento.getListaNotas();//Nos traemos el array de notas a un array temporal para operar mas facil con él.
        
        for(int i = 0 ; i < cancionATocar.length; i++){//Recorremos ese array temporal que es la copia del array de notas
            if ( cancionATocar[i]!=null){//En el caso de que no sea null, osea que nos encontremos con una nota efectiva, hacemos lo siguiente:  
                    switch(cancionATocar[i].valor){//Dentro del bucle, creamos un switch para transformar el valor de la nota en el sonido propio de los bongos
                        case "do":
                            cancion+="tom";
                            break;
                        case "re":
                            cancion+="tem";
                            break;
                        case "mi":
                            cancion+="tim";
                            break;
                        case "fa":
                            cancion+="tam";
                            break;
                        case "sol":
                            cancion+="totom";
                            break;
                        case "la":
                            cancion+="tatam";
                            break;
                        case "si":
                            cancion+="tutim";
                            break;
                    }                   
                }  
            cancion+=" ";//A?adimos un espacio vacío al final de cada sonido para que estéticamente quede medio bien.
            }    
               
        return cancion;//Al final del todo devolveremos la canción que nos haya quedado
    }
        public void pararDeTocar(){
            this.enUso=false;
        }
    

}
