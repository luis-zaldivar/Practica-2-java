package practica.pkg2;

public class Ave {

    public String alimento;
    public float peso;

    public Ave(String alimento, float peso) {
        this.alimento = alimento;
        this.peso = peso;
    }

    public static void accion1() {
        System.out.println("el ave persige a los niños");
    }

    public static void accion2() {
        System.out.println("se enculeca y tiene crias");
    }
}
