import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class ejercicio4 {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ejercicio4.dat")); ObjectInputStream in = new ObjectInputStream(new FileInputStream("ejercicio4.dat"))) {
            Scanner input = new Scanner(System.in);
            System.out.println("Elige una opción:");
            System.out.println("1. Introducir nombre, edad y ciudad de nacimiento en un fichero.");
            System.out.println("2. Mostrar el fichero.");
            System.out.println("3. Salir");
            int x = input.nextInt();
            while (x < 1 || x > 3) {

                if (x < 1 || x > 3) {
                    System.out.println("Error. No existe esa opción.");
                } else {


                    switch (x) {
                        case 1:
                            System.out.println("Introduce un nombre:");
                            StringBuilder cadena = new StringBuilder(input.next());
                            int edad = -1;
                            while (edad < 0) {
                                System.out.println("Introduce una edad:");
                                edad = input.nextInt();
                                if (edad < 0) {
                                    System.out.println("Edad incorrecta, menor que 0.");
                                } else {
                                    cadena.append(String.valueOf(edad));
                                }
                            }
                            System.out.println("Introduce una ciudad de nacimiento:");
                            String ciudad = input.next();
                            cadena.append(ciudad);
                            out.writeObject(cadena.toString());
                            break;
                        case 2:
                            String[] list = (String[]) in.readObject();
                            System.out.println(Arrays.toString(list));
                            break;
                        case 3:
                            in.close();
                            out.close();
                            break;
                    }
                }
                System.out.println("Elige una opción:");
                System.out.println("1. Introducir nombre, edad y ciudad de nacimiento en un fichero.");
                System.out.println("2. Mostrar el fichero.");
                System.out.println("3. Salir");
                x = input.nextInt();
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}