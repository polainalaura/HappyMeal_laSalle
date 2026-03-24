import java.util.Random;

public class Menu {

    // Partes del menú
    private String platoPrincipal;
    private String complemento;
    private String postre;
    private String bebida;
    private String sorpresa;

    // Precios asociados
    private double precioPlato;
    private double precioComplemento;
    private double precioPostre;
    private double precioBebida;

    // Opciones posibles de sorpresa
    private final String[] sorpresas = {
            "Chuches", "Libro", "Juguete", "Pegatina", "Muñeco"
    };


    public Menu() {}

    public void setPlatoPrincipal(String platoPrincipal, double precio) {
        this.platoPrincipal = platoPrincipal;
        this.precioPlato = precio;
    }

    public void setComplemento(String complemento, double precio) {
        this.complemento = complemento;
        this.precioComplemento = precio;
    }

    public void setPostre(String postre, double precio) {
        this.postre = postre;
        this.precioPostre = precio;
    }

    public void setBebida(String bebida, double precio) {
        this.bebida = bebida;
        this.precioBebida = precio;
    }

    public void seleccionarSorpresa() {
        Random random = new Random();
        int index = random.nextInt(sorpresas.length);
        this.sorpresa = sorpresas[index];
    }

    public double calcularTotal() {
        return precioPlato + precioComplemento + precioPostre + precioBebida;
    }

    //parte final

    public void mostrarResumen() {
        System.out.println("Plato principal: " + platoPrincipal + " - " + String.format("%.2f€", precioPlato));
        System.out.println("Complemento: " + complemento + " - " + String.format("%.2f€", precioComplemento));
        System.out.println("Postre: " + postre + " - " + String.format("%.2f€", precioPostre));
        System.out.println("Bebida: " + bebida + " - " + String.format("%.2f€", precioBebida));
        System.out.println("Sorpresa: " + sorpresa);
        System.out.println("------------------------------------");
        System.out.println("TOTAL: " + String.format("%.2f€", calcularTotal()));
    }
}
