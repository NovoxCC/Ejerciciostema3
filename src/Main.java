import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // primera parte del ejercicio
        System.out.print("Ingrese el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese el tercero numero: ");
        int n3 = sc.nextInt();
        suma(n1, n2, n3);
        // segunda parte del ejercicio
        Coche miCoche = new Coche();
        System.out.println("Puertas iniciales: " + miCoche.puertas);
        miCoche.aumentarPuertas();
        System.out.println("Puertas finales: " + miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        System.out.println("La suma de los numeros es: " + (a + b + c));
    }
    static class Coche {
        public int puertas = 0;
        public void aumentarPuertas() {
            puertas++;
        }
    }
}

