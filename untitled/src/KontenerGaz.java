public class KontenerGaz extends Kontenery implements IHazardNotifier{
    public KontenerGaz(double masaLadunku, double wysokosc, double wagaSamegoKontenera, double glebokosc, String numerSeryjny, double maxLadunku) {
        super(masaLadunku, wysokosc, wagaSamegoKontenera, glebokosc, numerSeryjny, maxLadunku);
    }

    @Override
    public void orpoznienieLadunku() {
    masaLadunku = masaLadunku * 0.05;
    }

    @Override
    public void notifyHazard() {
        if(masaLadunku > maxLadunku){
            System.out.println("NIEBEZPIECZNE ZDARZENIE W KONTENERZE NR: " + numerSeryjny);
        }
    }
}
