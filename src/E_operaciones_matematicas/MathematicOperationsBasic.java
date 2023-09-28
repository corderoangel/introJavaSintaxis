package E_operaciones_matematicas;

public class MathematicOperationsBasic {
    public static void main(String[] args) {
        System.out.println("Maximo entre 5 y 10: " + Math.max(5, 10));
        System.out.println("Raiz cuadrada de 64: " + Math.sqrt(64));
        System.out.println("Valor absoluto de -4.7: " + Math.abs(-4.7));
        System.out.println("Valor random: " + Math.random());
        int randomNum = (int)(Math.random() * 101);
        System.out.println("random * 101: " + randomNum);
    }
}
