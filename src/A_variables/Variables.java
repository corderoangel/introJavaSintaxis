package A_variables;

public class Variables {
    public static void main(String[] args) {

        //ENTEROS
        byte byteVariable = 127;
        short shortVariable = 32000;
        int intVariable = 2123412;
        long longVariable = 2348129734812793278L;
        System.out.println("--------ENTEROS-------");
        System.out.println("byte byteVariable: " + byteVariable);
        System.out.println("short shortVariable: " + shortVariable);
        System.out.println("int intVariable: " + intVariable);
        System.out.println("long longVariable: " + longVariable);
        System.out.println();
        System.out.println();

        //FLOTANTES
        float floatVariable = 3.14f;
        double doubleVariable = 2.71828;
        System.out.println("--------FLOTANTES-------");
        System.out.println("float floatVariable: " + floatVariable);
        System.out.println("double doubleVariable: " + doubleVariable);
        System.out.println();
        System.out.println();

        //CARACTER
        char charVariable = 'A'; //solo se puede poner en comillas simples
        System.out.println("--------CARACTER-------");
        System.out.println("char charVariable: " + charVariable);
        System.out.println();
        System.out.println();

        //BOOLEANO
        boolean booleanVariable = true;
        System.out.println("--------BOOLEANO-------");
        System.out.println("boolean booleanVariable: " + booleanVariable);
        System.out.println();
        System.out.println();

        //ENVOLVENTES (WRAPPER CLASSES)
        Integer integerVariable = 42;
        Double doubleWrapper = 3.14159;
        Character charWrapper = 'X';
        Boolean booleanWrapper = false;
        System.out.println("--------ENVOLVENTES (WRAPPER CLASSES)-------");
        System.out.println("Integer integerVariable: " + integerVariable);
        System.out.println("Double doubleWrapper: " + doubleWrapper);
        System.out.println("Character charWrapper: " + charWrapper);
        System.out.println("Boolean booleanWrapper: " + booleanWrapper);
        System.out.println();
        System.out.println();


        //STRING
        String stringVariable = "Hola mundo";
        System.out.println("--------STRING-------");
        System.out.println("String stringVariable: " + stringVariable);
        System.out.println();
        System.out.println();

        //ARRAY
        int[] arregloEnteros = {1,2,3,4,5};
        String[] arregloCadenas = {"perro", "gato", "pato"};
        System.out.println("--------ARRAY-------");
        System.out.println("int[] arregloEnteros: " + arregloEnteros);
        System.out.println("String[] arregloCadenas: " + arregloCadenas);
        System.out.println();
        System.out.println();

        //ENUM
        //no soportado en java 8
        /*enum Dia {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo}
        Dia diaActual = Dia.Miercoles;*/


        //también puedes declarar variables así
        int speed, salary;
        //y asignares el valor después
        speed = 10;
        salary = 1000;

    }
}
/**
 * Cuando se habla de Variable en Java se hace referencia a un contenedor de
 * datos que almacena los valores durante la ejecución del programa Java.
 * Dentro de este contenedor se le asigna a cada variable un tipo de dato que
 * funciona para designar el tipo y la cantidad de valor que cada variable
 * puede contener.
 *
 * -Los nombres pueden contener letras, dígitos, guiones bajos
 * y signos de dólar
 *
 * -Los nombres deben comenzar con una letra
 *
 * -Los nombres deben comenzar con una letra minúscula y no puede
 * contener espacios en blanco
 *
 * -Los nombres también pueden comenzar con $ y _
 *
 * -Los nombres distinguen entre mayúsculas y minúsculas ("myVar" y
 * "myvar" son variables diferentes)
 *
 * -Las palabras reservadas (como las palabras clave de Java no se pueden
 * utilizar como int, boolean
 *
 * CONSIDERACIONES
 * -Una clase siempre debe comenzar con una primera letra mayúscula.
 * -El nombre del archivo java debe coincidir con el nombre de la clase.
 * -cada programa Java tiene un nombre que debe coincidir con el nombre
 * de archivo y que cada programa debe contener el método.classmain()
 * */