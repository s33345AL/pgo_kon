public abstract class Kontenery {
    protected double masaLadunku;
    protected double wysokosc;
    protected double wagaSamegoKontenera;
    protected double glebokosc;
    protected String numerSeryjny;
    protected double maxLadunku;

    public Kontenery(double masaLadunku, double wysokosc, double wagaSamegoKontenera, double glebokosc, String numerSeryjny, double maxLadunku) {
        this.masaLadunku = masaLadunku;
        this.wysokosc = wysokosc;
        this.wagaSamegoKontenera = wagaSamegoKontenera;
        this.glebokosc = glebokosc;
        this.numerSeryjny = numerSeryjny;
        this.maxLadunku = maxLadunku;
    }

    public abstract void orpoznienieLadunku();

    public void zaladowanieKontener() throws OverfillException {
        if (masaLadunku > maxLadunku) {
            throw new OverfillException("Za duży ładunek");
        }
    }

    public double wagaCalkowita() {
        double wagaCalowita = 0;
         wagaCalowita = getMasaLadunku() + getWagaSamegoKontenera();
         return wagaCalowita;
    }

    public double getMasaLadunku() {
        return masaLadunku;
    }

    public void setMasaLadunku(double masaLadunku) {
        this.masaLadunku = masaLadunku;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getWagaSamegoKontenera() {
        return wagaSamegoKontenera;
    }

    public void setWagaSamegoKontenera(double wagaSamegoKontenera) {
        this.wagaSamegoKontenera = wagaSamegoKontenera;
    }

    public double getGlebokosc() {
        return glebokosc;
    }

    public void setGlebokosc(double glebokosc) {
        this.glebokosc = glebokosc;
    }

    public String getNumerSeryjny() {
        return numerSeryjny;
    }

    public void setNumerSeryjny(String numerSeryjny) {
        this.numerSeryjny = numerSeryjny;
    }

    public double getMaxLadunku() {
        return maxLadunku;
    }

    public void setMaxLadunku(double maxLadunku) {
        this.maxLadunku = maxLadunku;
    }
}
