package J_funciones;

/*
* ALERTA
* En Java, los bloques de código que realizan una acción se definen dentro de clases.
* Estos se llaman MÉTODOS y son parte de la programación orientada a objetos.
* Los métodos pueden ser estáticos o de instancia.
*
* -Los métodos estáticos pertenecen a la clase en sí y no requieren una instancia de
* la clase para ser invocados
*
* -mientras que los métodos de instancia deben invocarse en una instancia específica
* de la clase.
* */

public class Funciones {

    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);

        System.out.println("area de " + y + " es " + area);
        System.out.println("conversión dolar: " + convertToDolar(50000, "COP"));
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción general de la función (FORMATO JAVADOC)
     *
     * @param quantity descripción del parametro quantity
     * @param currency descripción del parametro currency (MXN o COP)
     * @return descripción del valor que devolvemos en la función
     * */
    public static double convertToDolar(double quantity, String currency){
        switch (currency){
            case "COP":
                quantity = quantity * 0.00025;
                break;
            case "MXN":
                quantity = quantity * 0.057;
                break;
        }
        return quantity;
    }
}
/**
 * circleArea() es el nombre del método
 *
 * static significa que el método pertenece a la Clase principal y no un objeto de la clase
 * principal.
 *
 * void significa que este método no tiene un valor devuelto.
 * */