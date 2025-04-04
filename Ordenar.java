import java.util.Arrays;

public class Ordenar {
    public static void ordenar(int[] v, int tamaño) {
        for (int i = 0; i < tamaño - 1; i++) {
            for (int j = 0; j < tamaño - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] vector = {5, 3, 8, 2, 4};
        ordenar(vector, vector.length);
        System.out.println("Vector ordenado: " + Arrays.toString(vector));
    }
}
