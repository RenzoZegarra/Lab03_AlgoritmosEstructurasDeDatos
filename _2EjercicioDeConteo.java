public class _2EjercicioDeConteo {
    public static int conteoRepeticiones(int[] v, int n) {
        int conteo = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (v[i] == v[j]) {
                    conteo++;
                }
            }
        }
        return conteo;
    }

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 2, 1};
        System.out.println("Cantidad de elementos repetidos: " + conteoRepeticiones(vector, vector.length));
    }
}
