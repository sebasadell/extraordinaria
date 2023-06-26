import java.io.*;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        int caracteres = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la ruta al archivo:");
        String ruta = input.next();
        try (BufferedReader in = new BufferedReader(new FileReader(ruta))){
            System.out.print("El fichero existe");
            String texto = in.readLine();
            while(texto != null){
                String[] substrings = texto.split(" ");
                for (int i = 0; i < substrings.length; i++){
                    for (int j = 0; j < substrings[i].length(); j++){
                        caracteres++;
                    }
                }
                texto = in.readLine();
            }
            System.out.print("y tiene " + caracteres + " carcteres.");
        } catch (IOException ex) {
            System.out.println("El fichero no existe.");
            System.out.println(ex);
        }
    }
}
