package practica.pkg2;

public class Perro1 extends Perro {

    public String algo;
    public String lugar;

    public Perro1(int edad, String nombre, String algo, String lugar) {
        super(edad, nombre);
        this.algo = algo;
        this.lugar = lugar;
    }

    public void accion3() {
        System.out.println(nombre + " hace " + algo);
    }

    public void Datos() {
        System.out.print("nombre: " + nombre + "\nedad: " + edad + "\nhace el truco: " + algo + "\n viene de: " + lugar);
    }

    public void Acciones() {
        accion3();
        accion1();
        accion2();

    }

}
