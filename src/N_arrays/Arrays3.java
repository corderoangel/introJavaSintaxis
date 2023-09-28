package N_arrays;

public class Arrays3 {
    public static void main(String[] args) {
        /*
         Array de 4 dimensiones
        */
        String[][][][] animals = new String[2][3][2][2];
        animals[0][0][0][0] = "Perro";
        animals[0][0][0][1] = "Gato";
        animals[1][0][0][0] = "Pato";
        animals[1][0][0][1] = "Monkey";

        System.out.println("---------MONKEY--------");
        for (int i = 0; i <= 1; i++){
            for (int j = 0; j <= 0; j++){
                for (int k = 0; k <= 0; k++){
                    for (int l = 0; l <= 1; l++){
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
        System.out.println("---------MONKEY--------");
    }
}
