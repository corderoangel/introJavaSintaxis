package N_arrays;

public class Arrays2 {
    public static void main(String[] args) {
            /*
             * +------------------------------+
             * |  Country    |  City          |
             * --------------------------------
             * | México      | CDMX           |
             * | México      | Guadalajara    |
             * | Colombia    | Bogotá         |
             * | Colombia    | Medellín       |
             * +------------------------------+
             * */

        /**
         * Array bidimensional
         * */
        String[][] CountryCities = new String[4][2]; //4 * 2 = 8

        CountryCities[0][0] = "México";
        CountryCities[0][1] = "CDMX";
        CountryCities[1][0] = "México";
        CountryCities[1][1] = "Guadalajara";
        CountryCities[2][0] = "Colombia";
        CountryCities[2][1] = "Bogotá";
        CountryCities[3][0] = "Colombia";
        CountryCities[3][1] = "Medellín";


        /*variable llamada pair almacena datos de CountryCities*/
        for (String[] pair : CountryCities){

            /*
             variable llamada CountryOrCity almacenando datos individualmente
             almacenados en la variable pair
            */
            for (String CountryOrCity : pair){
                System.out.println(CountryOrCity);
            }
        }
    }
}
