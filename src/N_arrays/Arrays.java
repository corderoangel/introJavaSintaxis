package N_arrays;

public class Arrays {
    public static void main(String[] args) {
        /**
         * el número dentro del new String es el número de datos
         * que debe tener el array maximo, no es necesario llegar
         * a esa cantidad.
         * */
        String[] androidVersions = new String[17];

        /*Lista de versiones de android*/
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println("----------VERSIONES DE ANDROID----------");
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        System.out.println("----------VERSIONES DE ANDROID----------");

    }
}
