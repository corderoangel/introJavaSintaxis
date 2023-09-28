package O_scope;

public class scope {
        public static void main(String[] args) {

            // Aquí el codigo no puede usar x

            {//<-Esto es un bloque

                //acá arriba tampoco se puede llamar x
                //System.out.println(x); <- no funciona

                int x = 100;

                //Aquí es donde se puede usar x
                System.out.println(x);

            } //El bloque termina aquí

            //Acá tampoco se puede utilizar x
            //System.out.println(x); <- no funciona

        }

}
