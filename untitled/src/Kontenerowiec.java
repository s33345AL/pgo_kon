import java.util.ArrayList;
import java.util.List;

public class Kontenerowiec {
    public double maxPredkosc;
    public int maxKontenerow;
    public double maxWaga;
    public List<Kontenery> kontenerowiec;

    public Kontenerowiec(double maxPredkosc, int maxKontenerow, double maxWaga) {
        this.kontenerowiec = new ArrayList<>();
        this.maxPredkosc = maxPredkosc;
        this.maxKontenerow = maxKontenerow;
        this.maxWaga = maxWaga;
    }

    public double lacznaWaga(Kontenery kontenery) {
        double lacznaWaga1 = 0;
        for (int i = 0; i < kontenerowiec.size(); i++) {
            lacznaWaga1 += kontenerowiec.get(i).wagaCalkowita();
        }
        return lacznaWaga1;
    }

    public void zaladowanieKonteneraNaStatek(Kontenery kontenery) throws Exception {
            if (lacznaWaga(kontenery) > maxWaga) {
                throw new OverfillException("Nie można załadować kontenera. Za duża waga");
        }
            if (kontenerowiec.size() > maxKontenerow) {
                throw new OverfillException("Za dużo kontenerów na statku");
            }
            if (kontenerowiec.contains(kontenery)) {
                throw new OverfillException("Ten kontener został dodany");
            }
        kontenerowiec.add(kontenery);
    }

    public void usuniecieKontenera(Kontenery kontenery) {
        if (kontenerowiec.contains(kontenery)) {
            kontenerowiec.remove(kontenery);
        } else {
            System.out.println("Na statku nie ma takiego konteneru");
        }
    }

    public void rozladowanieKontenerowca(Kontenery kontenery) {
        kontenerowiec.removeAll(List.of(kontenery));
    }

    public void zamienKontener(String numerSeryjny, Kontenery nowy) throws Exception {
        for (Kontenery kontenery : kontenerowiec) {
            if (kontenery.getNumerSeryjny().equals(numerSeryjny)) {
                usuniecieKontenera(kontenery);
                zaladowanieKonteneraNaStatek(nowy);
            }
        }
    }

    public void przeniesKontener(String numerSeryjny, Kontenerowiec drugi) throws Exception {
        for (int i = 0; i < kontenerowiec.size(); i++) {
            if (kontenerowiec.get(i).getNumerSeryjny().equals(numerSeryjny)) {
                drugi.zaladowanieKonteneraNaStatek(kontenerowiec.get(i));
                kontenerowiec.remove(i);
                break;
            }
        }
    }

    public void wyswietlInformacjeOStatku() {
        System.out.println("Statek: ");
        System.out.println("Maksymalna prędkość: " + maxPredkosc);
        System.out.println("Maksymalna waga: " + maxWaga);
        System.out.println("Lista załadunku: ");
        for (Kontenery kontenery : kontenerowiec) {
            System.out.println(kontenery.getNumerSeryjny());
        }
    }

    @Override
    public String toString() {
        return "Kontenerowiec{" +
                "maxPredkosc=" + maxPredkosc +
                ", maxKontenerow=" + maxKontenerow +
                ", maxWaga=" + maxWaga +
                '}';
    }
}
