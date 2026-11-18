public class T1_Reto_Lalangui {

    // Cuenta la cantidad de dígitos de un número entero no negativo.
    static int contarDigitos(int n) {
        if (n == 0) {
            return 1;
        }
        int contador = 0;
        while (n > 0) {
            contador++;
            n /= 10;
        }
        return contador;
    }

    // Calcula una potencia entera sin utilizar Math.pow().
    static int potencia(int b, int e) {
        int resultado = 1;
        for (int i = 0; i < e; i++) {
            resultado *= b;
        }
        return resultado;
    }

    // Comprueba si el número es igual a la suma de sus dígitos elevados
    // a la cantidad de dígitos que tiene.
    static boolean esArmstrong(int n) {
        if (n < 0) {
            return false;
        }
        int cantidad = contarDigitos(n);
        int copia = n;
        int suma = 0;

        while (copia > 0) {
            int digito = copia % 10;
            suma += potencia(digito, cantidad);
            copia /= 10;
        }
        return suma == n;
    }

    public static void main(String[] args) {
        int[] pruebas = {153, 123};
        for (int numero : pruebas) {
            System.out.println(numero + " es Armstrong: " + esArmstrong(numero));
        }
    }
}