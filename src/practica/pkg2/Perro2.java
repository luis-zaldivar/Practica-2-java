package practica.pkg2;

public class Perro2 extends Perro {

    String alimento;
    String año;

    public Perro2(int edad, String nombre, String alimento, String año) {
        super(edad, nombre);
        this.alimento = alimento;
        this.año = año;
    }

    public void accion3() {
        System.out.println(nombre + " come  " + alimento);
    }

    public void Datos() {
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("su alimento es: " + alimento);
        System.out.println("nacio: " + año);

    }

    public void acciones() {
        accion3();
        accion1();
        accion2();
    }
}
