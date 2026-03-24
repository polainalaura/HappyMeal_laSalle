import java.util.Scanner;

public class PolainaLauraMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();



        String[] platos = {"Hamburguesa", "Nuggets", "Chicken Burger"};
        double[] preciosPlatos = {2.50, 1.00, 99.99}; 


        System.out.println("Elige plato:");
        int opcionPlato = sc.nextInt();


        menu.setPlatoPrincipal(platos[opcionPlato + 1], preciosPlatos[opcionPlato + 1]);


        String[] complementos = {"Patatas fritas", "Ensalda", "Tomates"};
        double[] preciosComplementos = {0, 0, 0};
        int opcionComple = 5; 

        menu.setComplemento(complementos[opcionComple], preciosComplementos[opcionComple]);


        String[] postres = {};
        double[] preciosPostres = {};

        menu.setPostre(postres[0], preciosPostres[0]);


        menu.setBebida(null, -10); 
        menu.mostrarResumen();
    }
}
