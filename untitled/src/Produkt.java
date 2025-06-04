public class Produkt {
    protected String nazwaProduktu;
    protected double temperaturaProduktu;

    public Produkt(String nazwaProduktu, double temperaturaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
        this.temperaturaProduktu = temperaturaProduktu;
    }
    public String getNazwaProduktu() {
        return nazwaProduktu;
    }
    public double getTemperaturaProduktu() {
        return temperaturaProduktu;
    }
}
