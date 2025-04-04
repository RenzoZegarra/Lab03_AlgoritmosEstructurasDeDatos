import java.util.HashMap;
import java.util.Map;

public class _3EjercicioDeModa {
    public static int moda(int[] v) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        int maxFrecuencia = 0;
        int moda = v[0];

        for (int num : v) {
            int f = frecuencia.getOrDefault(num, 0) + 1;
            frecuencia.put(num, f);
            if (f > maxFrecuencia) {
                maxFrecuencia = f;
                moda = num;
            }
        }

        return moda;
    }

    public static void main(String[] args) {
        int[] vector = {4, 2, 4, 4, 3, 2};
        System.out.println("Moda del vector: " + moda(vector));
    }
}
