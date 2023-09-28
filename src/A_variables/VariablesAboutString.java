package A_variables;

public class VariablesAboutString {
    public static void main(String[] args) {
        System.out.println("-------CADENAS-------");
        String abc = "abcdeFGHIJKLMNOPQRSTUVwxyz";
        System.out.println("Longitud de abc: " + abc.length());
        System.out.println("todo minuscula de abc: " + abc.toLowerCase());
        System.out.println("todo mayuscula de abc: " + abc.toUpperCase());
        System.out.println("encontrar letra L en abc: " + abc.indexOf("L"));
        System.out.println("-------CADENAS-------");
        System.out.println();
        System.out.println();
        System.out.println("-------CARACTERES ESPECIALES-------");
        String txt = "We are the so-called \"Vikings\" from the north.";
        String txt2 = "It\'s alright.";
        String txt3 = "The character \\ is called backslash.";
        System.out.println("SINGLE QUOTE");
        System.out.println(txt);
        System.out.println();
        System.out.println("DOUBLE QUOTE");
        System.out.println(txt2);
        System.out.println();
        System.out.println("BLACKSLASH");
        System.out.println(txt3);
        System.out.println("-------CARACTERES ESPECIALES-------");
    }
}

/**
 * length() -> longitud
 * toUpperCase() -> convertir txdo a mayuscula
 * toLowerCase() -> convertir txdo a minuscula
 * indexOf() -> encontrar carácter en una cadena
 * */
