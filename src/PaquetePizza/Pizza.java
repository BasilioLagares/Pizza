package PaquetePizza;

public class Pizza {
    private static int pedidas=0;
    private static int servidas=0;
    private String nombre;
    private String tamaño;
    private boolean servida;

    public Pizza(String nombre, String tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.servida = false;
        pedidas++;
    }

    public void sirve() {
        if (servida){
            System.out.println("Esa pizza ya se ha servido.");
        }else {
            servida=true;
            servidas++;
        }
    }

    @Override
    public String toString() {
        return "PaquetePizza.Pizza "+nombre+" "+tamaño+", "+(servida? "servida":"pedida");
    }
    /////////////////////////////////////////////////////////////////////////////////////////

    public static int getPedidas() {
        return pedidas;
    }

    public static int getServidas() {
        return servidas;
    }
}
