
package E101;


public class Flauta extends InstrumentoDeViento {
    private boolean travesera; //Si travesera es false, se trata de una flauta dulce
    private String lengueta;

    
    
    public Flauta (boolean travesera, String materialLengueta,boolean metal,String string, int entero, int entero2){
        super(metal, string, entero, entero2);
        this.travesera=travesera;
                switch(materialLengueta){//Dice que el material de la lengüeta solo puede ser madera, metal o plástico, lo solucionamos con este switch.
            case "madera":
            case "metal":
                this.lengueta=materialLengueta;
                break;
            default:
                this.lengueta="plastico";
        }
    }
    
    public void cambiarLengueta(String nuevomaterial){
        switch(nuevomaterial){//Dice que el material de la lengüeta solo puede ser madera, metal o plástico, lo solucionamos con este switch.
            case "madera":
            case "metal":
                this.lengueta=nuevomaterial;
                break;
            default:
                this.lengueta="plastico";
        }
    }
    @Override
    public String afinarse(){//Devolvemos la cadena pedida
        String res="";
      res+="Se ha usado una baqueta para afinar correctamente la flauta ";
      if(travesera){//Tenemos que hacer un condicional para a?adir a la respuesta q es o travesera o dulce
          res+="travesera ";
      }else{
          res+="dulce ";//Igual es mejor almacenar el tipo en una variable String, mas que en boolean, pero bueno se me ocurrió así.
      }
     res+="con lengüeta de "+this.lengueta;
     return res;   
    }
    @Override
    public void pararDeTocar(){
        this.enUso=false;
    }
    @Override
    public String tocarPartitura(){
        this.enUso=true;
        String cancion = "";//Creamos un string donde vamos a guardar la "cancion" que emita la flauta
        
        Nota cancionATocar[] = this.partituraDelInstrumento.getListaNotas();//Nos traemos el array de notas a un array temporal para operar mas facil con él.
        
        for(int i = 0 ; i < cancionATocar.length; i++){//Recorremos ese array temporal que es la copia del array de notas
            if ( cancionATocar[i]!=null){//En el caso de que no sea null, osea que nos encontremos con una nota efectiva, hacemos lo siguiente:
                int repeticiones=cancionATocar[i].segundosDuracion;//Creamos una variable donde guardaremos los segundos de esa nota, recordemos q cada nota tiene un valor (tipo "la") y unos segundos (2,3,5...)
      
                    switch(cancionATocar[i].valor){//Dentro del bucle, creamos un switch para transformar el valor de la nota en el sonido propio de la flauta
                        case "do":
                            cancion+="flo";
                            break;
                        case "re":
                            cancion+="fle";
                            break;
                        case "mi":
                            cancion+="fli";
                            break;
                        case "fa":
                            cancion+="fla";
                            break;
                        case "sol":
                            cancion+="flon";
                            break;
                        case "la":
                            cancion+="flan";
                            break;
                        case "si":
                            cancion+="flin";
                            break;
                    }
                    while(repeticiones>0){//Mientras los segundos sean mas de cero, a?adimos al sonido un * por cada segundo.
                        cancion+="*";
                        repeticiones--;
                    }                   
                }  
            cancion+=" ";//A?adimos un espacio vacío al final de cada sonido para que estéticamente quede medio bien.
            }    
               
        return cancion;//Al final del todo devolveremos la canción que nos haya quedado
    }
    
    
    
}
