package practica.pkg2;

public class Corral1 extends Corral {

    public String nombre;
    public float peso;

    public Corral1(String sexo, int edad, String nombre, float peso) {
        super(sexo, edad);
        this.nombre = nombre;
        this.peso = peso;
    }

    public void datos() {
        System.out.println("nombre: " + nombre + "\nsu sexo es: " + sexo + "\tinen " + edad + " años" + "\npeso: " + peso);
    }

    public void animal3() {
        System.out.println(nombre + " topea ");
    }

    public void AccionesVaca() {
        animal3();
        animal1();
        animal2();
    }

}
