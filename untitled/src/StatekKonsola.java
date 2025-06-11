import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StatekKonsola {
    private List<Kontenerowiec> statki = new ArrayList<Kontenerowiec>();

    public void dodajStatek(Scanner scanner) {
        System.out.println("Podaj maksymalną wagę: ");
        double maxWaga = Double.parseDouble(scanner.nextLine());
        System.out.println("Podaj maksymalną liczbę kontenerów: ");
        int maxLiczbaKontenerow = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj maksymalną prędkość: ");
        double maxPredkosc = Double.parseDouble(scanner.nextLine());

        Kontenerowiec statek = new Kontenerowiec(maxWaga, maxLiczbaKontenerow, maxPredkosc);
        statki.add(statek);
        System.out.println("Udało się dodać statek");
    }

    public void pokazStatki() {
        if (statki.isEmpty()) {
            System.out.println("Lista kontenerowców: \nBrak kontenerowcow");
        }else {
            System.out.println("Lista kontenerowców: ");
            for (int i = 0; i < statki.size(); i++) {
                System.out.println("Statek " + (i + 1) + ": " + statki.get(i));
            }
        }
    }
}
