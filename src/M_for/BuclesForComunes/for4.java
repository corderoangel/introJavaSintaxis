package M_for.BuclesForComunes;
/*
* Bucle for con saltos (break y continue):
* Puedes usar break para salir de un bucle for antes de que la condición de
* finalización se cumpla y continue para saltar a la siguiente iteración sin
* ejecutar el código restante en la iteración actual.
* */
public class for4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // Salta la iteración cuando i es igual a 2
            }
            if (i == 4) {
                break; // Sale del bucle cuando i es igual a 4
            }
            System.out.println("Iteración " + i);
        }

    }
}
