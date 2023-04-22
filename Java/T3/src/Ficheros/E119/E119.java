package Ficheros.E119;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class E119 {
    
    public static void main(String[] args) {
        
        String ruta = "src/Ficheros/E119/fichero.txt";
        
        try ( BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            
            
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
