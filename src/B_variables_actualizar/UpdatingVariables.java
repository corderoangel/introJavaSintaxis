package B_variables_actualizar;

public class UpdatingVariables {
    public static void main(String[] args) {
        /*-----------NÚMEROS----------------*/
        int salary = 1000;

        //bono
        salary = salary + 200;
        System.out.println(salary);

        //pensión
        salary = salary - 50;
        System.out.println(salary);

        //+2 horas extra
        //- comida
        salary = salary + (30*2) - 45;
        System.out.println(salary);
        /*---------------------------------------*/

        /*-----------NÚMEROS----------------*/
        String employeeName = "Manuel Cordero";
        employeeName = employeeName + " Falco";
        System.out.println(employeeName);
        employeeName = "Ángel " + employeeName;
        System.out.println(employeeName);
        /*-----------CADENA DE TEXTO----------------*/
    }
}
