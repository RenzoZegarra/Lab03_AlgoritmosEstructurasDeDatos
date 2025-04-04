public class Intercambio {
    public static void intercambia(int[] valores) {
        int aux = valores[0];
        valores[0] = valores[1];
        valores[1] = aux;
    }

    public static void main(String[] args) {
        int[] valores = {5, 10};
        System.out.println("Antes del intercambio: " + valores[0] + ", " + valores[1]);
        intercambia(valores);
        System.out.println("Después del intercambio: " + valores[0] + ", " + valores[1]);
    }
}
