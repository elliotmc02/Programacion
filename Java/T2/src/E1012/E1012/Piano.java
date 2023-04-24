

package E101;


public class Piano extends InstrumentoDeCuerda{
    private int cuerdas;
    private String tipo;
    
    public Piano(int numeroDeCuerdas, String tipo, String string, int entero1, int entero2){
        super(false, string, entero1, entero2);
        this.cuerdas=numeroDeCuerdas;
        this.tipo=tipo;
    }
    
    @Override
    public String afinarse(){//Subreescribimos el método, esta vez ya de manera específica con la cadena que nos pide.
        return "Se han tendaso correctamente las "+this.cuerdas+" del piano.";      
    }
    
    @Override
    public String tocarPartitura(){
        this.enUso=true;
        String cancion = "";//Creamos un string donde vamos a guardar la "cancion" que emita el piano
        
        Nota cancionATocar[] = this.partituraDelInstrumento.getListaNotas();//Nos traemos el array de notas a un array temporal para operar mas facil con él.
        
        for(int i = 0 ; i < cancionATocar.length; i++){//Recorremos ese array temporal que es la copia del array de notas
            if ( cancionATocar[i]!=null){//En el caso de que no sea null, osea que nos encontremos con una nota efectiva, hacemos lo siguiente:
                int repeticiones=cancionATocar[i].segundosDuracion;//Creamos una variable donde guardaremos los segundos de esa nota, recordemos q cada nota tiene un valor (tipo "la") y unos segundos (2,3,5...)
                while(repeticiones>0){//Mientras esos segundos de duracion sean mayores que cero daremos vueltas en este bucle para sacar el valor tantas veces como nos indiquen esos segundos
                    switch(cancionATocar[i].valor){//Dentro del bucle, creamos un switch para transformar el valor de la nota en el sonido propio del piano (por ejemplo si la nota es do, queremos q en la cancion entre ton.
                        case "do":
                            cancion+="ton ";
                            break;
                        case "re":
                            cancion+="ten ";
                            break;
                        case "mi":
                            cancion+="tin ";
                            break;
                        case "fa":
                            cancion+="tan ";
                            break;
                        case "sol":
                            cancion+="tun ";
                            break;
                        case "la":
                            cancion+="tean ";
                            break;
                        case "si":
                            cancion+="tain ";
                            break;
                    }
                    repeticiones--;//Cuando acabamos de traducir el valor, si los segundos eran mas de uno le restanos 1 y volvemos a dar otra vuelta.
                }                            
            }    
        }       
        return cancion;//Al final del todo devolveremos la canción que nos haya quedado
    }
    
    @Override
    public void pararDeTocar(){
        this.enUso=false;
        
    }
    

}
