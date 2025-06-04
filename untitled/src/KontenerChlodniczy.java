public class KontenerChlodniczy extends Kontenery {
    protected String rodzajProduktu;
    protected double temperaturaWKontenerze;

    public KontenerChlodniczy(double masaLadunku, double wysokosc, double wagaSamegoKontenera, double glebokosc, String numerSeryjny, double maxLadunku, String rodzajProduktu, double temperaturaWKontenerze) {
        super(masaLadunku, wysokosc, wagaSamegoKontenera, glebokosc, numerSeryjny, maxLadunku);
        this.rodzajProduktu = rodzajProduktu;
        this.temperaturaWKontenerze = temperaturaWKontenerze;
    }

    public void czyProduktMozeByc(Produkt produkt) {
         if (produkt.getNazwaProduktu().equals(rodzajProduktu) && temperaturaWKontenerze >= produkt.getTemperaturaProduktu()){
             System.out.println("Produkt może zostać załadowany");
         } else if (produkt.getNazwaProduktu().equals(rodzajProduktu) && temperaturaWKontenerze < produkt.getTemperaturaProduktu()){
            System.out.println("Produkt nie może być załadowany ze względu na niższą temperature w kontenerze");
        } {

         }
    }

    @Override
    public void orpoznienieLadunku() {
    }

    public String getRodzajProduktu() {
        return rodzajProduktu;
    }

    public double getTemperaturaWKontenerze() {
        return temperaturaWKontenerze;
    }
}
