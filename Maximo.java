public class Maximo{
    public class MaximoEntreDos {
        public static int max(int x, int y) {
            return (x >= y) ? x : y;
        }
    
        public static void main(String[] args) {
            int resultado = max(7, 4);
            System.out.println("Máximo entre 7 y 4: " + resultado);
        }
    }
    
}