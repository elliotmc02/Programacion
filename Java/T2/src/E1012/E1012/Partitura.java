package E101;

public class Partitura {

    String nombrePartitura;
    String autorPartitura;
    private Nota listaDeNotas[] = new Nota[100];//Declaramos la longitud del array al principio, pues siempre va a ser de tamaño 100 (y privada)

    public Partitura(String partitura, String autor) {
        this.nombrePartitura = partitura;
        this.autorPartitura = autor;
        for (int i = 0; i < listaDeNotas.length; i++) {
            listaDeNotas[i] = null;//Aunque el array vacío de java ya está lleno de "null", es buena práctica llenarlo de null igualmente, de cara a otros idiomas.
        }
    
    }

    public int numNotas() {//Método para devolver el número de notas efectivas que hay almacenadas.
        int contadorNotas = 0;
        for (int i = 0; i < this.listaDeNotas.length; i++) {//Recorremos el array de notas completo
            if (this.listaDeNotas[i] != null) {//Si en alguna posición hay algo diferente de "null", anotamos uno en el contador.
                contadorNotas++;
            }
        }

        return contadorNotas;//Devolvemos el int con la cantidad de notas efectivas encontradas.
    }
    public boolean addNota(Nota notaNueva) {//Método para añadir una nueva nota al array de notas (de 100 que trae por defecto)
        boolean conseguido = false;//Creamos un booleano para devolver si hemos conseguido añadirle, y también para salir del for en caso de que se consiga
        for (int i = 0; (i < this.listaDeNotas.length) && (!conseguido); i++) {//En la parte central del for tiene 2 condiciones, o lo recorre entero o lo recorre hasta que consiga meter la nota
            if (this.listaDeNotas[i] == null) {//Si encuentra una posición donde se podría meter...
                this.listaDeNotas[i] = notaNueva;//Introducimos la Nota pasada por parámetro a la posición con el null
                conseguido = true;//Y cambiamos el booleano conseguido a true, para devolver el true fuera, y también lo aprovechamos para dejar de recorrer el for.
            }

        }
        return conseguido;//Devolvemos true o false dependiendo de lo que haya ocurrido.
    }
    public String toString() {
        String res = this.nombrePartitura + " de " + this.autorPartitura + ":\n";
        for (int i = 0; i < this.listaDeNotas.length; i++) {
            if (this.listaDeNotas[i] != null) {//Si la nota no es null, osea que es una nota efectiva, la añadios a la respuesta.
                if((i>0)&&(i%10==0)){//Antes de imprimirlo, comprobamos que si es múltiplo de 10, de un salto de línea.
                    res+="\n";
                }
    
                res += this.listaDeNotas[i].toString();//Y sacamos la nota.
            }
        }
        return res;//Devolvemos la maqueta correcta.
        
    }
    public Nota[] getListaNotas(){
        return this.listaDeNotas;
    }

}
