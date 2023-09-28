package I_switch;

public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Light";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Blue");
                break;
            default:
                System.out.println("Selecciona una opción");
        }

    }
}
