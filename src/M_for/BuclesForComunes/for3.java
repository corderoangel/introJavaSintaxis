package M_for.BuclesForComunes;
/*
* Bucle for con múltiples variables de control:
Puedes usar múltiples variables de control en un bucle for para realizar
* iteraciones más complejas.
* */
public class for3 {
    public static void main(String[] args) {
        for (int i = 0, j = 10; i < 5 && j > 5; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
    }
}
