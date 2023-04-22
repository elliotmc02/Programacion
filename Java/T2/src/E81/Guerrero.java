package E81;

public class Guerrero {

    private String nombre;
    private int saludMax;
    private int saludActual;
    private int ataque;
    private int escudo;
    private boolean muerto;
    private Arma arma1;
    private int nivel;
    private int experienciaActual;
    private int siguienteNivel;
    private boolean victoria = false;

    public Guerrero(String nombre, int saludMax, int ataque, int escudo, Arma arma1) {
        this.nombre = nombre;
        this.saludMax = saludMax;
        this.saludActual = this.saludMax;
        this.ataque = ataque;
        this.escudo = escudo;
        this.muerto = false;
        this.arma1 = arma1;
        this.nivel = 1;
        this.experienciaActual = 0;
        this.siguienteNivel = (int) (Math.ceil(this.nivel * 10 + this.nivel * 1.5));

    }

    public void atacar(Guerrero defensor) {
        int ataqueTotal; // Ataque total del atacante
        if (!defensor.victoria) {
            this.comprobarEstado(defensor); // Comprobamos si el defensor esta muerto o vivo
            if (this.saludActual > 0) { // Comprobamos si el atacante esta muerto o vivo
                this.muerto = false;
            } else {
                this.muerto = true;
                System.out.println(this.nombre + " está muerto");
            }
            if (!this.muerto && !defensor.muerto) { // Si estan vivo los dos..
                System.out.println(this.nombre + " ataca a " + defensor.nombre);
                if (this.arma1.getResistencia() > 0) { // Si el arma no esta rota
                    System.out.println(this.nombre + " le ataca con " + this.arma1.getNombre());
                    ataqueTotal = this.ataque + this.arma1.getPoder();
                    this.experienciaActual += 3;
                    this.mejorarArma(this.arma1.getNombre());
                } else {
                    System.out.println(this.nombre + " le ataca con las manos");
                    ataqueTotal = this.ataque;
                    this.experienciaActual += 5;
                }
                if (defensor.escudo > 0) { // Si el defensor tiene escudo
                    if (defensor.escudo < ataqueTotal) { // Si el ataque es superior al escudo
                        int ataqueRestante = ataqueTotal - defensor.escudo;
                        System.out.println(this.nombre + " le ha quitado todo el escudo");
                        defensor.escudo = 0;
                        defensor.saludActual -= ataqueRestante; // le quitamos el escudo entero, y el ataque que sobra se lo quitamos a la vida

                    } else {
                        defensor.escudo -= ataqueTotal; // si el escudo es superior al ataque
                    }

                } else { // si no tiene escudo
                    defensor.saludActual -= ataqueTotal;
                }
                if (defensor.saludActual < 0) {
                    defensor.saludActual = 0;
                }
                System.out.println(defensor.nombre + " ha recibido " + ataqueTotal + " de daño, le quedan " + defensor.saludActual + " puntos de vida y " + defensor.escudo + " de escudo");

                this.comprobarEstado(defensor); // comprobamos de nuevo el estado del defensor
                this.subidaNivel(); // sube de nivel el atacante
                this.arma1.setResistencia(this.arma1.getResistencia() - 1); // pierde 1 de resistencia
                if (this.arma1.getResistencia() == 0) { // si llega a 0 se rompe y le avisa
                    System.out.println("Se ha roto el arma");
                }
                if (this.arma1.getResistencia() >= 0) { // si el arma tiene mayor que 0 de resitencia
                    System.out.println(this.arma1.getNombre() + " ha perdido 1 de resistencia, ahora le queda " + this.arma1.getResistencia() + " de resistencia");
                }
            } else {
                if (this.muerto) {
                    System.out.println(this.nombre + " está muerto");
                }
                if (defensor.muerto) {
                    System.out.println(defensor.nombre + " está muerto");
                }
            }
        }
    }

    public void mejorarArma(String nombreArma) {
        if (this.arma1.getNombre().equals(nombreArma)) { // si tiene el mismo nombre
            this.arma1.setNivel(this.arma1.getNivel() + 1);
            System.out.println("Se ha mejorado el arma");
        } else {
            System.out.println("No está usando ese arma");
        }
    }

    private boolean subir() {
        return this.experienciaActual == siguienteNivel;
    }

    public void subidaNivel() {
        this.subir();
        if (this.subir()) {
            this.nivel++;
            this.experienciaActual = 0;
            this.ataque++;
            this.escudo++;
            this.saludMax += 10;
            this.subir();
            System.out.println("Has subido al nivel " + this.nivel);
        } else {
            System.out.println("A " + this.nombre + " le faltan " + this.siguienteNivel + " puntos de experiencia para subir de nivel");
        }
    }

    private void comprobarEstado(Guerrero defensor) {
        if (defensor.saludActual <= 0) {
            defensor.muerto = true;
            System.out.println(this.nombre + " ha matado a " + defensor.nombre);
            defensor.victoria = true;
        } else {
            defensor.muerto = false;
        }
    }
    
    public void cambiarArma(Arma armaNueva) {
        this.arma1 = armaNueva;
    }
    
    public String toString() {
        String res = "\nDatos del guerrero";

        res += "\nNombre: " + this.nombre + "\nSalud máxima: " + this.saludMax
                + "\nSalud actual: " + this.saludActual + "\nAtaque: " + this.ataque
                + "\nEscudo: " + this.escudo + "\nNivel: " + this.nivel
                + "\nExperiencia: " + this.experienciaActual
                + "\nExperiencia para el siguiente nivel: " + this.siguienteNivel
                + this.arma1.toString();
        if (this.muerto) {
            res += "\nEstá muerto";
        } else {
            res += "\nEstá vivo";
        }
        return res;
    }

}
