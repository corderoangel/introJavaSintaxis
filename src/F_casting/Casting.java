package F_casting;

public class Casting {
    public static void main(String[] args) {
        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        int a = 30;
        int b = 12;

        //EXACTITUD
        double c = (double) a/b;
        System.out.println("c = " + c);

        char n = '1';
        int nI = n;
        System.out.println("nI = " + nI);

        short nS = (short) n;
        System.out.println("nS = " + nS);
    }
}
/*
.::Conversión Automatica::.
utilice en caso de que esté seguro de que no habrá perdida de información, por
ejemplo, al convertir un entero pequeño a uno grande. También para que el código
sea más facil de leer.

byte -> short
short -> int
char -> int
int -> long
long -> float
float -> double


.::Cast Necesario::.
utilicese en caso de que haya riesgo de perder información valiosa, por ejemplo,
en caso de convertir un dato de tipo double a uno de tipo int. También cuando se
necesita control preciso de la conversión y para resolver ambiguedades o advertencias
del compilador.

double -> float
float -> long
long -> int
int -> short
short -> byte

char <-> byte
char <-> short
int -> char
*/