package H_operadores;

public class LogicOperations {
    public static void main(String[] args) {
        //asignación
        int a = 8;
        int b = 5;

        //comparación
        if(a == b){
            System.out.println("a es igual a b");
            //comparación y logico
        } else if ((a != b) && (a > b)) {
            System.out.println("a es diferente y mayor de b");
        } else if (a > b) {
            System.out.println("a es mayor a b");
        } else if (a < b) {
            System.out.println("a es menor a b");
        } else if (a >= b) {
            System.out.println("a es mayor o igual a b");
        } else if (a <= b) {
            System.out.println("a es menor o igual a b");
        }
    }

}
