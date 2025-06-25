import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
   try{
        Kontenerowiec statek1 = new Kontenerowiec(25, 10, 1000);
   KontenerNaPlyny kon1 = new KontenerNaPlyny(20, 15, 45, 22, "2242", 25, true);
   KontenerGaz kon2 = new KontenerGaz(40, 21, 900, 22, "2156", 50);
   KontenerChlodniczy kon3 = new KontenerChlodniczy(25, 22, 150, 22, "2125", 60, "banany", 13.3, 20);
Kontenerowiec statek2 = new Kontenerowiec(25, 10, 1000);
   kon1.zaladowanieKontener();
   kon2.zaladowanieKontener();
   kon3.zaladowanieKontener();

   statek1.zaladowanieKonteneraNaStatek(kon1);
   statek1.zaladowanieKonteneraNaStatek(kon2);
   statek1.zaladowanieKonteneraNaStatek(kon3);


   statek1.wyswietlInformacjeOStatku();
    }catch (Exception e){
       System.out.println("Błąd: " + e.getMessage());}

        }
    }
