package J_funciones.MetodoDeInstancia;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodo de instancia
    public void imprimirDetalles(){
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }
}
