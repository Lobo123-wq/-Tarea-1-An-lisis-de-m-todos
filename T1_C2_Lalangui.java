import java.util.Scanner;

public class T1_C2_Lalangui {

    // Calcula el promedio de tres notas.
    static double promedio(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    // Determina si el estudiante está aprobado, va a supletorio o reprueba.
    static String estado(double nota) {
        if (nota >= 14) {
            return "Aprobado";
        } else if (nota >= 9) {
            return "Supletorio";
        }
        return "Reprobado";
    }

    // Devuelve la nota mínima del supletorio para alcanzar promedio 14.
    // Devuelve 0 si ya aprobó y -1 si no puede alcanzar 14 con una nota máxima de 20.
    static double necesitaEnSupletorio(double nota) {
        if (nota >= 14) {
            return 0;
        }
        if (nota < 8) {
            return -1;
        }
        return 28 - nota;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        double c = sc.nextDouble();

        double notaFinal = promedio(a, b, c);
        System.out.printf("Promedio: %.2f%n", notaFinal);
        System.out.println("Estado: " + estado(notaFinal));

        if (notaFinal >= 9 && notaFinal < 14) {
            double minima = necesitaEnSupletorio(notaFinal);
            System.out.printf("Nota mínima en supletorio para llegar a 14: %.2f%n", minima);
        } else if (notaFinal < 9) {
            System.out.println("No alcanza el requisito para supletorio.");
        } else {
            System.out.println("No necesita supletorio.");
        }
        sc.close();
    }
}