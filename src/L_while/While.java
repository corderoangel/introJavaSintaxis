package L_while;

public class While {
    static boolean encender = true;
    static boolean apagar = false;
    static boolean linterna = apagar;

    public static void main(String[] args) {

        //botón para encender y apagar la luz
        //en este caso es solo para encender
        enciendeApaga();

        //inicializamos variable en 1
        int i = 1;
        /**
         * mientras la luz esté encendida y la variable
         * i sea menor o igual a 10, imprimir lo que está
         * en la función printSOS()
         * */
        while (linterna && i<=10){
            printSOS();
            i++; //centila o controlador
        }
    }

    /**
     * función SOS
     * */
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    /**
     * Encender y apagar la luz
     * retorna si la variable isTurnOnLight() es falsa o
     * verdadera
     *
     * Explicación del operador ternario
     * (si la lampara está encendida) entonces se convierte en false
     * si no, se convierte en verdadero
     * */
    public static boolean enciendeApaga(){
        /**
         * el operador ternario se utiliza sobre la misma variable a
         * preguntar su estado booleano
         * */
        linterna = (linterna) ? apagar : encender;
        return linterna;
    }

}
