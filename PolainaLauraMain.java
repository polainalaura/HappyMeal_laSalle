import java.util.Scanner;

public class PolainaLauraMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("Bienvenido a LaSalleKidsHappyMeal");

        String[] platos = {"Hamburguesa", "Nuggets", "Chicken Burger"};
        double[] preciosPlatos = {2.50, 2.00, 3.10};

        System.out.println("Elige plato:");
        int opcionPlato = sc.nextInt(); 

        menu.setPlatoPrincipal(platos[opcionPlato], preciosPlatos[opcionPlato]);

        String[] complementos = {"Patatas fritas", "Ensalda", "Tomates cherry"}; 
        double[] preciosComplementos = {1.50, 1.80, 1.40};
        int opcionComple = 1;

        menu.setComplemento(complementos[opcionComple], preciosComplementos[opcionComple]);

        String[] postres = {"Manzana", "Piña", "Brocheta de fruta"};
        double[] preciosPostres = {1.00, 1.20, 1.50};

        int opcionPostre = 2;
        menu.setPostre(postres[opcionPostre], preciosPostres[opcionPostre]);

        String[] bebidas = {"Agua", "Zumo naranja", "Zumo piña"};
        double[] preciosBebidas = {1.00, 1.20, 1.30}; 

        int opcionBebida = 0;
        menu.setBebida(bebidas[opcionBebida], preciosBebidas[opcionBebida]);

        menu.seleccionarSorpresa();
        System.out.println("\n=== RESUMEN DEL PEDIDO ===");
        menu.mostrarResumen();

        System.out.println("\n¡Gracias por usar LaSalleKidsHappyMeal!");
    }
}
