import java.util.Scanner;

public class PolainaLauraMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("Bienvenido a LaSalleKidsHappyMeal\n");

        // PLATO PRINCIPAL
        String[] platos = {"Hamburguesa", "Nuggets", "Chicken Burger"};
        double[] preciosPlatos = {2.50, 2.00, 2.80};
        int opcionPlato = pedirOpcion(sc, platos);
        menu.setPlatoPrincipal(platos[opcionPlato], preciosPlatos[opcionPlato]);

        // COMPLEMENTO
        String[] complementos = {"Patatas fritas", "Ensalada", "Tomates cherry"};
        double[] preciosComplementos = {2.00, 1.80, 1.40};
        int opcionComple = pedirOpcion(sc, complementos);
        menu.setComplemento(complementos[opcionComple], preciosComplementos[opcionComple]);

        // POSTRE
        String[] postres = {"Manzana", "Piña", "Brocheta de fruta"};
        double[] preciosPostres = {1.00, 1.20, 1.50};
        int opcionPostre = pedirOpcion(sc, postres);
        menu.setPostre(postres[opcionPostre], preciosPostres[opcionPostre]);

        // BEBIDA
        String[] bebidas = {"Agua", "Zumo de naranja", "Zumo de piña"};
        double[] preciosBebidas = {1.00, 1.30, 1.30};
        int opcionBebida = pedirOpcion(sc, bebidas);
        menu.setBebida(bebidas[opcionBebida], preciosBebidas[opcionBebida]);

        // SORPRESA + RESUMEN
        menu.seleccionarSorpresa();

        System.out.println("\n=== RESUMEN DEL PEDIDO ===");
        menu.mostrarResumen();

        System.out.println("\n¡Gracias por usar LaSalleKidsHappyMeal!");
    }

    private static int pedirOpcion(Scanner sc, String[] opciones) {
        int seleccion = -1;

        while (true) {
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }

            System.out.print("Selecciona una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("Debes introducir un número.\n");
                sc.next();
                continue;
            }

            seleccion = sc.nextInt() - 1;
            sc.nextLine();

            if (seleccion >= 0 && seleccion < opciones.length) {
                return seleccion;
            }

            System.out.println("Opción fuera de rango.\n");
        }
    }
}
