package E101;

abstract class Instrumento {

    String marca;
    int mesDeFabricacion;
    int yearDeFabricacion;
    Partitura partituraDelInstrumento;//Este atributo puede venir por par�metro o no (Traducci�n = dos constructores)
    boolean enUso;

    public Instrumento(String marca, int mes, int year, Partitura partitura) {//Constructor uno con todos los datos
        this.marca = marca;
        this.mesDeFabricacion = mes;
        this.yearDeFabricacion = year;
        this.partituraDelInstrumento = partitura;
        this.enUso = false;//Desde el principio est�n sin uso

    }

    public Instrumento(String marca, int mes, int year) {

        String valor = "";//En esta variable vamos a meter el valor de la nota, do, re, ...
        int valorAleatorio;//Este es el "dado" q vamos a tirar y que convertiremos en el valor de la nota a traves de switch
        int notasAleatorias;//Esta va a decirnos el n�mero de notas que va a tener nuestra partitura
        this.marca = marca;
        this.mesDeFabricacion = mes;
        this.yearDeFabricacion = year;
        this.partituraDelInstrumento = new Partitura("Desconocido", "Desconocido");//Si no nos dan la partitura, tanto el nombre como el autor son desconocidos
        notasAleatorias = (int) ((Math.random() * (100 - 10 + 1)) + 10);//Creamos un aleatorio entre 100 y 10 para ver el n�mero de notas que vamos a meter.
        for (int i = 0; i < notasAleatorias; i++) {//Recorremos el for para a�adir las notas calculadas aleatoriamente.
            valorAleatorio = (int) ((Math.random() * (7 - 1 + 1)) + 1);
            switch (valorAleatorio) {//Transformamos el valor aleatorio en el string que sea.
                case 1:
                    valor = "do";
                    break;
                case 2:
                    valor = "re";
                    break;
                case 3:
                    valor = "mi";
                    break;
                case 4:
                    valor = "fa";
                    break;
                case 5:
                    valor = "sol";
                    break;
                case 6:
                    valor = "la";
                    break;
            }
            this.partituraDelInstrumento.addNota(new Nota(valor, ((int) ((Math.random() * (5 - 1 + 1)) + 1)))); //Por cada vuelta del for, agregamos una nota nueva.         
        }//Esta parte es INCREIBLE... no sab�a que por par�metro directamente se podia invocar el constructor new...
        this.enUso = false;//Por defecto sale que no se est�n usando
    }

    public boolean aniadirNota() {
        boolean conseguido = false;
        String valor = "";
        int valorAleatorio;
        valorAleatorio = (int) ((Math.random() * (7 - 1 + 1)) + 1);
        switch (valorAleatorio) {//Transformamos el valor aleatorio en el string que sea.
            case 1:
                valor = "do";
                break;
            case 2:
                valor = "re";
                break;
            case 3:
                valor = "mi";
                break;
            case 4:
                valor = "fa";
                break;
            case 5:
                valor = "sol";
                break;
            case 6:
                valor = "la";
                break;
        }
        Nota nueva = new Nota(valor, ((int) ((Math.random() * (5 - 1 + 1)) + 1)));
        conseguido = this.partituraDelInstrumento.addNota(nueva);//El m�todo add nota nos va a devolver true o false, lo guardamos en conseguido.
        return conseguido;//Devolvemos si ha sido posible.
    }

    abstract String tocarPartitura();//Ya editaremos este m�todo dependiendo del instrumento que sea

    abstract void pararDeTocar();//Ya editaremos este m�todo dependiendo del instrumento que sea    

    public Nota[] getPartitura() {//M�todo para devolver el array de notas, que es privado, para ejecutarlo en otras clases.

        return this.partituraDelInstrumento.getListaNotas();

    }

    abstract String afinarse();

}
