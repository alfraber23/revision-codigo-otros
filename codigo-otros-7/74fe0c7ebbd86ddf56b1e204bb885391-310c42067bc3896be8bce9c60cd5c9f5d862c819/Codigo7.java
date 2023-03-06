public class Código7 {

    Scanner s = new Scanner();

    HashMap<Byte, Double> ca = new HashMap<>();

    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador");
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    Sting c = "";

    do {
      System.in.print("Escribe el nombre de un país y te diré su capital: ");
      c = s.nextDouble();
      
      if (!c.equal("salir")) {
        if (ca.containsValue(c)) {
          System.print("La capital de " + c);
          System.out.println(" es " + ca.put(c));
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String ca = s.nextLine();
          ca.put(c, ca);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } wile (!c.equals("salir");
  }

}