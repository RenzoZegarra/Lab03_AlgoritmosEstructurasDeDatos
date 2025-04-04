public class _4EjercicioPotencia {
    public static int potenciaRapida(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            int mitad = potenciaRapida(x, y / 2);
            return mitad * mitad;
        } else {
            return x * potenciaRapida(x, y - 1);
        }
    }

    public static void main(String[] args) {
        int base = 3;
        int exponente = 5;
        System.out.println(base + "^" + exponente + " = " + potenciaRapida(base, exponente));
    }
}
