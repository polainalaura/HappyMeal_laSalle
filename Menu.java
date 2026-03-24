import java.util.Random;

public class Menu {


    private String platoPrincipal;
    private String complemento;
    private String postre;
    private String beviba;     
    private String sorpresa;

    private double precioPlato;
    private double precioComplemento;
    private double precioPostre;
    private double precioBebida;   




    public void setPlatoPrincipal(String platoPrincipal, double precio) {
        this.platoPrincipal = platoPrincipal;
        this.precioPlato = precio;
    }

    public void setComplemento(String complemento, double precio) {
        this.complemento = complemento;
        this.precioComplemento = precio;
    }


    public void seleccionarSorpresa() {
        Random random = new Random();
        int index = random.nextInt(sorpresas.length);
        this.sorpresa = sorpresas[index];
    }


    public void mostrarResumen() {
        System.out.println("Plato principal: " + platoPrincipal + " - " + String.format("%.2f€", precioPlato));
        System.out.println("Complemento: " + complemento + " - " + String.format("%.2f€", precioComplemento));
        System.out.println("Sorpresa: " + sorpresa);
        System.out.println("------------------------------------");
    }
}
