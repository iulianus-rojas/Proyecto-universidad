public class App5 {
    public static void main(String[] args) {
        int n = 10; // Número de términos de la serie de Fibonacci que deseas mostrar
        int primero = 0;
        int segundo = 1;

        System.out.println("Serie de Fibonacci de " + n + " términos:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primero + " ");

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}
