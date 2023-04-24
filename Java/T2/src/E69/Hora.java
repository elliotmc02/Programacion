package E69;

/*
69.- Crear una clase llamada Hora, con los atributos horas, minutos y segundos. Dicha
clase podrá ser construida indicando los tres atributos, solo las horas y los minutos o
sólo las horas. La clase tendrá los métodos necesarios para modificar la hora en
cualquier momento de forma manual y para mostrar la hora que tiene en un momento
dado. Hay que mantener los atributos con valores correctos en todo momento.
*/


public class Hora {

    int horas;
    int minutos;
    int segundos = 00;
    
    public Hora (int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }
    
    public Hora (int horas) {
        this.horas = horas;
    }
    
    public void cambiarHora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public void mostrarHora() {
        System.out.println(this.horas + ":" + this.minutos + ":" + this.segundos);
    }
    
    
}
