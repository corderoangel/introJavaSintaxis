package C_convencion;

//Upper Camel Case
public class NamingJava {
    public static void main(String[] args) {

        int cellphone = 123123;
        int cellPhone = 234533; //<- tiende a ser el más común(lowerCamelCase)
        String $countryName = "Canadá";
        String _backgroundColor = "Red";
        String currency$ = "COL";
        String background_color = "BLUE";

        //constantes
        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;

        //Lower Camel Case
        String fullName = "Ángel Manuel Cordero Falco";
        int sizeInCentimeters = 26;

        System.out.println("-------CONVENCIONES-------");
        System.out.println("cellphone: " + cellphone);
        System.out.println("cellPhone: " + cellPhone);
        System.out.println("$countryName: " + $countryName);
        System.out.println("_backgroundColor: " + _backgroundColor);
        System.out.println("currency$: " + currency$);
        System.out.println("background_color: " + background_color);
        System.out.println("POSITION: " + POSITION);
        System.out.println("MAX_WIDTH: " + MAX_WIDTH);
        System.out.println("MIN_WIDTH: " + MIN_WIDTH);
        System.out.println("fullname: " + fullName);
        System.out.println("sizeInCentimeters: " + sizeInCentimeters);
    }
}
