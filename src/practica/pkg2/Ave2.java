package practica.pkg2;

public class Ave2 extends Ave {

    public String sonido;
    public String engorda;

    public Ave2(String alimento, float peso, String sonido, String engorda) {
        super(alimento, peso);
        this.engorda = engorda;
        this.sonido = sonido;
    }

    public void accion3() {
        System.out.println("el ave vuela");
    }

    public void data1() {
        System.out.println("esta ave come: " + alimento + "\ny pesa: " + peso
                + "\nse va a engoradar en " + engorda + "\nel sonido que hace es: " + sonido);
    }

    public void acciones() {
        accion3();
        accion2();
        accion2();

    }

}
