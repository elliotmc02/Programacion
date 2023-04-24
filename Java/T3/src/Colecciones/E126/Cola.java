

package Colecciones.E126;

import java.util.ArrayList;

public class Cola {

    private ArrayList <Persona> personas;
    
    public Cola() {
        this.personas = new ArrayList<>();
    }
    
    public boolean EstaVacia() {
        return this.personas.isEmpty();
    }
    
    public void Entrar(Persona persona) {
        this.personas.add(persona);
    }
    
    public String Salir() {
        return this.personas.remove(0).toString();
    }
    
    public Persona Primero() {
        return this.personas.get(0);
    }
    
    public int Cantidad() {
        return personas.size();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    
}
