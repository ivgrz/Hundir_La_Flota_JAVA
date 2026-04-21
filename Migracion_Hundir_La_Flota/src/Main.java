import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Juego j = new Juego();
        Scanner s = new Scanner(System.in);
        boolean salir = false;

        while (!salir){
            System.out.println("========= HUNDIR LA FLOTA ======");
            System.out.println("1. Lanzar ataque");
            System.out.println("2. Salir");
            System.out.println("Elige una opcion: ");
            String opcion = s.nextLine();

            switch (opcion){
                case "1":
                    System.out.println("Elige una fila (0-9): ");
                    // Convertir String en Int
                    int x = Integer.parseInt(s.nextLine());
                    System.out.println("Elige una columna (0-9): ");
                    int y = Integer.parseInt(s.nextLine());
                    j.lanzar_ataque(x,y);
                    break;
                case "2":
                    System.out.println("saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Invalido");
            }
        }
        s.close();
    }

}