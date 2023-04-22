package Colecciones.E131;

import java.util.HashMap;

public class ARAS {

    HashMap<String, String> diccionario;

    public ARAS() {
        diccionario = new HashMap<>();
    }

    public void borrar(String clave) {
        diccionario.remove(clave);
    }

    public void meter(String clave, String valor) {

        System.out.println(diccionario.containsKey(clave) ? "Ya existe una celda con esa clave" : diccionario.remove(clave));
    }
    
    public void actualizar(String clave, String valor) {
        System.out.println(diccionario.containsKey(clave) ? diccionario.put(clave, valor) : "No existe");
    }
    
    public boolean existeClave(String clave) {
        return diccionario.containsKey(clave);
    }
    
    public boolean existeValor(String valor) {
        return diccionario.containsValue(valor);
    }
    
   /* public String primerValor(String valor) {
        return (diccionario.containsValue(valor) ? diccionario)
    }


    public HashMap<String, String> mostrar(ARAS diccionario) {
        return this.diccionario.();
    }*/

}
