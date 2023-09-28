package J_funciones.Recursion;

/*
* En esta recursión anotamos un valor de control, es lo más
* común y es una buena práctica
* */
public class Ex2 {
    public static void main(String[] args) {
        int resultado = suma(0, 5);
        System.out.println(resultado);
    }
    public static int suma(int start, int end){
        //end = 5
        //start = 0
        if(end > start){
            return end + suma(start, end - 1);
        }else {
            return end;
        }
    }
}
