import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ejercicio5 {
    public static void main(String[] args) {
        List<String> listaUno = new ArrayList<>();
        listaUno.add("Lunes");
        listaUno.add("Martes");
        listaUno.add("Miércoles");
        listaUno.add("Jueves");
        listaUno.add("Viernes");
        listaUno.add("Sábado");
        listaUno.add("Domingo");
        System.out.println(listaUno);

        listaUno.set(4, "Juernes");
        System.out.println(listaUno);

        List<String> listaDos = new ArrayList<>();
        listaDos.addAll(listaUno);
        System.out.println(listaDos);

        System.out.println(listaUno.get(3));
        System.out.println(listaUno.get(4));

        System.out.println(listaUno.get(0));
        System.out.println(listaUno.get(listaUno.size() - 1));

        listaUno.remove("Juernes");
        System.out.println(listaUno);

        Iterator<String> it = listaUno.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(listaUno.contains("Lunes"));

        for(String s: listaUno){
            if(s.compareToIgnoreCase("LUNES") == 0){
                System.out.println(true);
            }
        }

        Collections.sort(listaUno);
        for(String s: listaUno){
            System.out.println(s);
        }

        listaUno.clear();
        System.out.println(listaUno);
    }
}