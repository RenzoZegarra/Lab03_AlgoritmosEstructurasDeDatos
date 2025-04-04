public class _1_MaxVector {
    public static int maximo(int[] v, int n) {
        int m = v[0];
        for (int i = 1; i < n; i++) {
            if (v[i] > m) {
                m = v[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] vector = {4, 9, 2, 10, 3};
        System.out.println("Máximo del vector: " + maximo(vector, vector.length));
    }
}
