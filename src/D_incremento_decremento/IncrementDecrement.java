package D_incremento_decremento;

public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println("lives - 1: " + lives);//4

        lives--;
        System.out.println("lives - 1: " + lives);//3

        lives++;
        System.out.println("lives + 1: " + lives);//4

        int giftPrefijo = 100 + ++lives; //prefijo
        System.out.println("giftPrefijo: " + giftPrefijo); // 105
        System.out.println("lives: " + lives); //5

        int giftPostfijo = 100 + lives++; //postfijo
        System.out.println("giftPostfijo: " + giftPostfijo); // 105
        System.out.println("lives: " + lives); //6
    }
}
