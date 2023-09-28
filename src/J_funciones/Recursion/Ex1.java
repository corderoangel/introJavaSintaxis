package J_funciones.Recursion;

public class Ex1 {
    public static void main(String[] args) {
        int result = suma(5);
        System.out.println(result);
    }

    public static int suma(int numero){
        if(numero > 0){ // 5 > 0? | 4 > 0? | 3 > 0? | 2 > 0? | 1 > 0?
            System.out.println("recursión n° " + numero);
            return numero + suma(numero - 1); // 5 | 4 | 3 | 2 | 1
            //result = 5 | 9 | 12 | 14 | 15
        }else {
            System.out.println("retorno de 0");
            return 0;
        }
    }
}

/**
 * 5 + suma(4) | 4 + ( 3 + suma(2) ) | 4 + ( 3 + ( 2 + suma(1))
 * 5 + (4 + suma(3))
 * 5 + (4 + (3 + suma(2)))
 * 5 + (4 + (3 + (2 + suma(1))))
 * 5 + 4 + 3 + 2 + 1
 * */

//EXPLICACIÓN MÁS PROFUNDA
/**
 * (1)
 * Dentro del método suma, se realizan llamadas recursivas hasta que numero
 * llega a 0. Cuando numero es igual a 0, se ejecuta la instrucción return 0;.
 * En este punto, el valor 0 se devuelve de la llamada recursiva más interna,
 * pero esto no afecta directamente a la variable result en el método main.
 *
 * (2)
 * El valor 0 se utiliza como parte del cálculo para llegar a la suma final
 * (por ejemplo, 5 + 4 + 3 + 2 + 1 + 0 = 15), pero este valor no se almacena
 * directamente en la variable result en el método main.
 * */
