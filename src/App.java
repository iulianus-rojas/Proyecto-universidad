import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero=sc.nextInt();
        //Comprobamos si es divisible entre 2, es decir, si el resto de la divis
        if (numero%2==0){ 
            System.out.println("El numero "+numero+" es divisible entre 2");
        }else{ 
            System.out.println("El numero "+numero+" no es divisible entre 2");
        }
    }
}