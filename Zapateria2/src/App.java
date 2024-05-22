import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Elegante elegante1 = new Elegante("Louboutin", "Lb1", "cuero", 41, 100.00, true);
        Elegante elegante2 = new Elegante("Jimmi Choo","JC2", "cuero", 38, 110.00, false);
        Casual casual1 = new Casual("Ambitious", "Am1", "lona", 42, 65);
        Casual casual2 = new Casual("Callaghan", "Cal2", "polipiel", 44, 109.95);
        Deporte deporte1 = new Deporte("Adidas", "Ad1", "Mixto", 39, 80.10);
        Deporte deporte2 = new Deporte("Nike", "Nik2", "Mixto", 40, 85.00);

        ArrayList<Zapato> zapateria = new ArrayList<>();
        zapateria.add(elegante1);
        zapateria.add(elegante2);
        zapateria.add(casual1);
        zapateria.add(casual2);
        zapateria.add(deporte1);
        zapateria.add(deporte2);
      

        System.out.println("Los zapatos disponibles son: ");
        for (Zapato zapato : zapateria) {
            System.out.println(zapatoToString(zapato));
            
        } 

        


        Scanner teclado = new Scanner(System.in);
        double gastoTotal = 0;
        
        while (true) {
            System.out.println("Que tipo de zapatos vas a comprar?");
            System.out.println("1.- ELEGANTE");
            System.out.println("2.- CASUAL");
            System.out.println("3.- DEPORTIVOS");
            System.out.println("Si deseas finalizar tu compra,  escribe 'salir'.");


            String opcion = teclado.nextLine().toLowerCase();

            if (opcion.equals("salir")){
                break;
            }

            switch (opcion){
                case "1":
                    gastoTotal += comprarZapatos(elegante1, elegante2, teclado);
                    break;

                case "2":
                    gastoTotal += comprarZapatos(casual1, casual2, teclado);
                    break;

                case "3":
                    gastoTotal +=comprarZapatos(deporte1, deporte2, teclado);
                    break;
                default:
                System.out.println("Opción inválida, por favor elige una opción válida.");

            }
        } 

        mostrarDespedida(gastoTotal);
        
        /* System.out.println("el total serían: " + gastoTotal + " euros.");
        System.out.println("hasta la próxima!"); */
 
       // teclado.close();
    }
    private static double comprarZapatos(Zapato zapato1, Zapato zapato2, Scanner teclado) {
        double gasto = 0;

        while(true){
            System.out.println("que modelo quieres comprar? ('salir' para volver al menú principal.)");
            System.out.println("1.-" + zapatoToString(zapato1));
            System.out.println("2.-" + zapatoToString(zapato2));

            String modelo = teclado.nextLine().toLowerCase();

            if (modelo.equals("salir")){
                break;
            }

            switch (modelo) {
                case "1":
                    gasto += zapato1.getPrecio();
                    break;

                case "2":
                    gasto += zapato2.getPrecio();
                    break;

                default:
                    System.out.println("opción inválida, elige una opción válida.");

            }

        }
        return gasto;
    }

    private static void mostrarDespedida(double gastoTotal) {
        System.out.println("El total sería: " + gastoTotal + " euros");
        System.out.println("Gracias por confiar en nosotros, hasta la próxima!");
    }

    private static String zapatoToString(Zapato zapato) {
        return "Marca: " + zapato.getMarca() +
                ", Modelo: " + zapato.getModelo() +
                ", Material: " + zapato.getMaterial() + 
                ", Talla: " + zapato.getTalla() +
                ", Precio: " + zapato.getPrecio(); 
    }
}
