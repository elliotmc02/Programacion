package T3P2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class pruebaGPT {

    public static void main(String[] args) {
        try {
            // Pedimos el nombre del archivo de entrada
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce el nombre del archivo a codificar: ");
            String nombreArchivo = br.readLine();
            // Creamos el archivo de salida
            String nombreArchivoSalida = nombreArchivo.substring(0, nombreArchivo.lastIndexOf(".")) + ".cod";
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivoSalida));
            // Leemos el archivo de entrada
            BufferedReader brArchivo = new BufferedReader(new FileReader(nombreArchivo));
            String linea = brArchivo.readLine();
            while (linea != null) {
                // Codificamos la línea y la escribimos en el archivo de salida
                String lineaCodificada = codificarLinea(linea);
                bw.write(lineaCodificada);
                bw.newLine();
                // Leemos la siguiente línea
                linea = brArchivo.readLine();
            }
            // Cerramos los ficheros
            brArchivo.close();
            bw.close();
            // Indicamos al usuario que todo ha ido bien
            System.out.println("Archivo codificado con éxito!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Función para codificar una línea según las reglas indicadas
    private static String codificarLinea(String linea) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            // Si es un salto de línea, lo mantenemos
            if (c == '\n') {
                sb.append(c);
            } else if (c == ' ') { // Si es un espacio, lo cambiamos por el carácter ']'
                sb.append(']');
            } else if (Character.isDigit(c)) { // Si es un dígito, lo cambiamos por la letra 'Ç'
                sb.append('Ç');
            } else if (Character.isLetter(c)) { // Si es una letra, la movemos un valor hacia adelante en la tabla Unicode
                char nuevaLetra = (char) (c + 1);
                if (nuevaLetra > 'z') { // Si se pasa de la 'z', volvemos a la 'a'
                    nuevaLetra = 'a';
                } else if (nuevaLetra > 'Z' && nuevaLetra < 'a') { // Si se pasa de la 'Z', volvemos a la 'A'
                    nuevaLetra = 'A';
                }
                sb.append(nuevaLetra);
            } else { // Si no es un espacio, un dígito o una letra, lo movemos 5 posiciones hacia atrás en la tabla Unicode
                char nuevoCaracter = (char) (c - 5);
                sb.append(nuevoCaracter);
            }
        }
        return sb.toString();
    }
}
