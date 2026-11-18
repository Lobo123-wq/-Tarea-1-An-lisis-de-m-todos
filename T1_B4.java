public class T1_B4 {
    static int total = 0;

    static void sumar(int x) {
        int parcial = x * 2;
        total += parcial;
        System.out.println("Parcial de " + x + " = " + parcial);
    }

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 3; i++) {
            sumar(i);
        }

        System.out.println("i = " + i);
        // parcial es una variable local de sumar(), por eso no se imprime aquí.
        System.out.println("total acumulado = " + total);

        int totalLocal = 5;
        System.out.println("total local = " + totalLocal);
    }
}