import java.util.Scanner;

public class T1_C3_Lalangui {

    // Calcula el volumen de un cubo.
    static double volumen(double lado) {
        return lado * lado * lado;
    }

    // Calcula el volumen de un cilindro.
    static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    // Calcula el volumen de un prisma rectangular.
    static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\\n--- MENU DE VOLUMENES ---");
            System.out.println("1. Cubo");
            System.out.println("2. Cilindro");
            System.out.println("3. Prisma rectangular");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            while (!sc.hasNextInt()) {
                System.out.print("Ingrese una opción numérica: ");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado: ");
                    double lado = sc.nextDouble();
                    if (lado <= 0) {
                        System.out.println("La medida debe ser positiva.");
                    } else {
                        System.out.printf("Volumen del cubo: %.2f%n", volumen(lado));
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el radio: ");
                    double radio = sc.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double altura = sc.nextDouble();
                    if (radio <= 0 || altura <= 0) {
                        System.out.println("Las medidas deben ser positivas.");
                    } else {
                        System.out.printf("Volumen del cilindro: %.2f%n", volumen(radio, altura));
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el largo: ");
                    double largo = sc.nextDouble();
                    System.out.print("Ingrese el ancho: ");
                    double ancho = sc.nextDouble();
                    System.out.print("Ingrese el alto: ");
                    double alto = sc.nextDouble();
                    if (largo <= 0 || ancho <= 0 || alto <= 0) {
                        System.out.println("Las medidas deben ser positivas.");
                    } else {
                        System.out.printf("Volumen del prisma: %.2f%n", volumen(largo, ancho, alto));
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}