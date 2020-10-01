package practica.pkg2;

public class Ave1 extends Ave {

    public String color;
    public int huevos;

    public Ave1(String alimento, float peso, String colorn, int huevos) {
        super(alimento, peso);
        this.color = color;
        this.huevos = huevos;
    }

    public void accion3() {
        System.out.println("el ave pone huevos ");
    }

    public void data() {
        System.out.println("el alimento que como es de: " + alimento + "\npesa: " + peso
                + "\nel color de sus huevos es: " + color + "\npone una cantidad de huevos de: " + huevos);
    }

    public void acciones() {
        accion3();
        accion1();
        accion2();
    }

}
