public class Main {
    public static void main(String[] args) {
        ArrayReales lista1 = new ArrayReales(new double[]{0.0, 2.3, 5.5});
        System.out.println("Lista1 mínimo: " + lista1.minimo());
        System.out.println("Lista1 máximo: " + lista1.maximo());
        System.out.println("Lista1 sumatorio: " + lista1.sumatorio());

        ArrayReales lista2 = new ArrayReales(new double[]{-13.69, -16.30, 32.35, -23.58, -34.90, -24.01, -15.57, 16.44, -12.67, -0.15});
        System.out.println("\nLista2 mínimo: " + lista2.minimo());
        System.out.println("Lista2 máximo: " + lista2.maximo());
        System.out.println("Lista2 sumatorio: " + lista2.sumatorio());
    }
}