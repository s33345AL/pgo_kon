public class KontenerNaPlyny extends Kontenery implements IHazardNotifier{
    protected boolean czyBezpieczny;
    public KontenerNaPlyny(double masaLadunku, double wysokosc, double wagaSamegoKontenera, double glebokosc, String numerSeryjny, double maxLadunku, boolean czyBezpieczny) {
        super(masaLadunku, wysokosc, wagaSamegoKontenera, glebokosc, numerSeryjny, maxLadunku);
        this.czyBezpieczny = czyBezpieczny;
    }

    @Override
    public void orpoznienieLadunku() {

    }

    @Override
    public void zaladowanieKontener() throws OverfillException {
        super.zaladowanieKontener();
        if(czyBezpieczny == false && masaLadunku > getMaxLadunku() * 0.5) {
            notifyHazard();
        }else{
            masaLadunku = getMaxLadunku() * 0.9;
        }
    }

    @Override
    public void notifyHazard() {
        System.out.println("PRÓBA WYKONANIA NIEBEZPIECZNEJ OPERACJI");
    }

    public boolean isCzyBezpieczny() {
        return czyBezpieczny;
    }

    public void setCzyBezpieczny(boolean czyBezpieczny) {
        this.czyBezpieczny = czyBezpieczny;
    }
}
