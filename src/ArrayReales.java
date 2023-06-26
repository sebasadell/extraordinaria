public class ArrayReales implements Estadisticas{
    private double[] lista;

    public ArrayReales(double ... lista){
        this.lista = lista;
    }
    @Override
    public double minimo() {
        double minimo = lista[0];
        for (int i = 1; i < lista.length; i++){
            if(lista[i] < minimo){
                minimo = lista[i];
            }
        }
        return minimo;
    }

    @Override
    public double maximo() {
        double maximo = lista[0];
        for (int i = 1; i < lista.length; i++){
            if(lista[i] > maximo){
                maximo = lista[i];
            }
        }
        return maximo;
    }

    @Override
    public double sumatorio() {
        double suma = 0;
        for (int i = 0; i < lista.length; i++){
            suma += lista[i];
        }
        return suma;
    }
}
