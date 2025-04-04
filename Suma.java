public class Suma {
    public static int suma(int[] v, int tamaño) {
        int resultado = 0;
        for (int i = 0; i < tamaño; i++) {
            resultado += v[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};
        System.out.println("Suma del vector: " + suma(vector, vector.length));
    }
}
