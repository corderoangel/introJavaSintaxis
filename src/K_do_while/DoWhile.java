package K_do_while;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response = 0;
        int pelicula = 0;
        int serie = 0;

        do{

            System.out.println("----------PELISFAN----------");
            System.out.println();
            System.out.println("Bienvenido, seleccione qué desea ver");
            System.out.println("1. Peliculas");
            System.out.println("2. Series");
            System.out.println("0. Salir");
            System.out.println();
            System.out.println("----------PELISFAN----------");
            System.out.println();
            System.out.println();

            //instancia Scanner que nos permite anotar en consola
            //en response almacenamos el dato anotado en consola
            //viene siendo lo que está en nextLine()
            //se convierte a numero con Integer.valueOf
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("-------SECCIÓN DE PELICULAS-------");
                    System.out.println();
                    System.out.println("1. Vengadores 2");
                    System.out.println("2. Volver al futuro 3");
                    System.out.println("3. Terminator 1");
                    System.out.println();
                    System.out.println("-------SECCIÓN DE PELICULAS-------");

                    Scanner sp = new Scanner(System.in);
                    pelicula = Integer.valueOf(sp.nextLine());
                    switch (pelicula){

                        case 1:
                            System.out.println("Haz decidido ver los vengadores 2");
                            response = 0;
                            break;
                        case 2:
                            System.out.println("Haz decidido ver volver al futuro");
                            response = 0;
                            break;
                        case 3:
                            System.out.println("Haz decidido ver terminator 1");
                            response = 0;
                            break;
                        default:
                            System.out.println("No escogiste una opción valida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("-------SECCIÓN DE SERIES-------");
                    System.out.println();
                    System.out.println("1. The chosen");
                    System.out.println("2. Stranger things");
                    System.out.println("3. Dark");
                    System.out.println();
                    System.out.println("-------SECCIÓN DE SERIES-------");

                    Scanner ss = new Scanner(System.in);
                    serie = Integer.valueOf(ss.nextLine());

                    switch (serie){
                        case 1:
                            System.out.println("Haz decidido ver the chosen");
                            response = 0;
                            break;
                        case 2:
                            System.out.println("Haz decidido ver stranger things");
                            response = 0;
                            break;
                        case 3:
                            System.out.println("Haz decidido ver dark");
                            response = 0;
                            break;
                        default:
                            System.out.println("No escogiste una opción valida");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }
        }while (response != 0);
    }
}
