public class KontenerChlodniczy extends Kontenery {
    protected String rodzajProduktu;
    protected double temperaturaWKontenerze;
    protected double temperaturaProduktu;

    public KontenerChlodniczy(double masaLadunku, double wysokosc, double wagaSamegoKontenera, double glebokosc, String numerSeryjny, double maxLadunku, String rodzajProduktu, double temperaturaProduktu, double temperaturaWKontenerze) {
        super(masaLadunku, wysokosc, wagaSamegoKontenera, glebokosc, numerSeryjny, maxLadunku);
        this.numerSeryjny = "KON-C-" + numerSeryjny;
        this.rodzajProduktu = rodzajProduktu;
        this.temperaturaWKontenerze = temperaturaWKontenerze;
        this.temperaturaProduktu = temperaturaProduktu;
    }

    @Override
    public void orpoznienieLadunku() {
    }

    @Override
    public void zaladowanieKontener() throws OverfillException {
        if (temperaturaWKontenerze < temperaturaProduktu) {
            throw new OverfillException("Produkt nie może zostać załadowany do kontenera ze względu na temperature");
        }
        super.zaladowanieKontener();
    }

    public String getRodzajProduktu() {
        return rodzajProduktu;
    }

    public double getTemperaturaWKontenerze() {
        return temperaturaWKontenerze;
    }
}
