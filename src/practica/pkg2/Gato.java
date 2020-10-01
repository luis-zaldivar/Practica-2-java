package practica.pkg2;

public class Gato {

    public String nombre;
    public String pais;

    public Gato(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;

    }

    public static void AccionGato1() {
        System.out.println("el gato maullar todas las noches ");
    }

    public static void AccionGato2() {
        System.out.println("en las noches se va a pelear al techo");
    }
}
