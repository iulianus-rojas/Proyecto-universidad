public class App4 {
    public static void main(String[] args) {
        int suma1to100 = 0;
        int suma100to500 = 0;

        // Bucle para sumar los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            suma1to100 += i;
        }

        // Bucle para sumar los números del 100 al 500
        for (int i = 100; i <= 500; i++) {
            suma100to500 += i;
        }

        System.out.println("La suma de los números del 1 al 100 es: " + suma1to100);
        System.out.println("La suma de los números del 100 al 500 es: " + suma100to500);
    }
}
