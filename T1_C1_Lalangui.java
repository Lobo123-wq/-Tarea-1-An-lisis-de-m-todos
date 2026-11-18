import java.util.Scanner;

public class T1_C1_Lalangui {

    // Lee el consumo y valida que sea un número mayor o igual que cero.
    static double leerConsumo(Scanner sc) {
        double m3;
        do {
            System.out.print("Ingrese el consumo de agua en m3 (>= 0): ");
            while (!sc.hasNextDouble()) {
                System.out.println("Dato inválido. Ingrese un número.");
                sc.next();
                System.out.print("Ingrese el consumo de agua en m3 (>= 0): ");
            }
            m3 = sc.nextDouble();
            if (m3 < 0) {
                System.out.println("El consumo no puede ser negativo.");
            }
        } while (m3 < 0);
        return m3;
    }

    // Calcula el valor: primeros 15 m3 a $0,40; exceso a $0,75 y cargo fijo de $2,50.
    static double calcularValor(double m3) {
        if (m3 <= 15) {
            return m3 * 0.40 + 2.50;
        }
        return 15 * 0.40 + (m3 - 15) * 0.75 + 2.50;
    }

    // Muestra el consumo y el total que debe pagar el usuario.
    static void mostrarPlanilla(double m3, double valor) {
        System.out.println("\\n--- PLANILLA DE AGUA ---");
        System.out.printf("Consumo: %.2f m3%n", m3);
        System.out.printf("Total a pagar: $%.2f%n", valor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double consumo = leerConsumo(sc);
        double valor = calcularValor(consumo);
        mostrarPlanilla(consumo, valor);
        sc.close();
    }
}