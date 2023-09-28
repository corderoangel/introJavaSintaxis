package J_funciones;

public class FuncionesSobrecargaMetodos {

    public static void main(String[] args) {
        System.out.println(myMethod(1, 2));
        System.out.println(myMethod(1, 2, 3));
    }

    static int myMethod(int x, int y){
        return x + y;
    }

    static int myMethod(int x, int y, int z){
        return x + y + z;
    }

}

/*
* pueden haber más de un método con el mismo nombre, la diferencia de este
* rueda en el número de párametros. esto es lo que se conoce como sobrecarga
* de método
* */