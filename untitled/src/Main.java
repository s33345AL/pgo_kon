
public class Main {
    public static void main(String[] args) throws OverfillException {
    KontenerNaPlyny kon1 = new KontenerNaPlyny(30, 4, 5, 5, "gg",40, true);
    //kon1.zaladowanieKontener();
    Produkt banany = new Produkt("Banany", 26);
    KontenerChlodniczy konNaBanany = new KontenerChlodniczy(50, 2, 211, 22, "ggreg", 333, "Banany", 20);
    konNaBanany.czyProduktMozeByc(banany);
    }
}