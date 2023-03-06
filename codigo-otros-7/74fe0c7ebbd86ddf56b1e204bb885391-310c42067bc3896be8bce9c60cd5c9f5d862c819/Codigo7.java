
import java.util.Scanner;
import java.util.HashMap;

public class Codigo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> capitales = new HashMap<>();
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington D.C.");
        capitales.put("México", "Ciudad de México");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Ciudad de Panamá");

        String pais = "";

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = scanner.nextLine();

            if (!pais.equalsIgnoreCase("salir")) {
                if (capitales.containsKey(pais)) {
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais));
                } else {
                    System.out.print("No conozco la respuesta, ¿cuál es la capital de " + pais + "?: ");
                    String capital = scanner.nextLine();
                    capitales.put(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        } while (!pais.equalsIgnoreCase("salir"));

        scanner.close();
    }
}
