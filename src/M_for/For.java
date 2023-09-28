package M_for;

public class For {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight(); //prende o apaga

        if(isTurnOnLight){
            for (int i = 1; i <= 10; i++){
                printSOS();
            }
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
    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }

}
