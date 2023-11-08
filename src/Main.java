import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Studerende s1 = new Studerende(1, "Søren", "Hansen,", "Æblevej 2", "4700", "12345678", '1');
        //System.out.println(s1);

        Studerende s2 = new Studerende(2, "Morten", "Andersen", "Bananvej 4", "4700", "34561234", '1');
        //System.out.println(s2);

        Fag f1 = new Fag(1, "Programmering");
        //System.out.println(f1);

        Laerer l1 = new Laerer(1, "Susanne", "Jensen", "Vej 3", "4700", "87654321");

        Fag f2 = new Fag(2, "Systemudvikling", l1);
        l1.tilfoejFag(f2);
        //System.out.println(f2);

        Laerer l2 = new Laerer(2, "Mikkel", "Andersen", "Gade 1", "4700", "87651234");

        Fag f3 = new Fag(3, "Teknologi", l2);
        //System.out.println(f3);

        Skole skole = new Skole();
        skole.opretStuderende(s1);
        skole.opretStuderende(s2);
        skole.opretFag(f1);
        skole.opretFag(f2);
        skole.tilmeldStuderendeFag(s1, f1);
        skole.tilmeldStuderendeFag(s2, f1);
        skole.tilmeldStuderendeFag(s1, f2);
        skole.tilmeldStuderendeFag(s2, f2);
        //udskrivFagListe(skole);
        //System.out.println(s1.getTilmeldteFag());
        //udskrivFagListeStuderende(s1,skole);
        skole.frameldStuderendeFag(s2,f2);
        //udskrivFagListe(skole);
        //udskrivFagListeStuderende(s2,skole);
        //System.out.println(s2.getTilmeldteFag());
        System.out.println(l1.getFagListe());

    }

    public static void udskrivFagListe(Skole skole) {
        ArrayList<Fag> fagliste = skole.getFagListe();
        for (int i = 0; i < fagliste.size(); i++) {
            System.out.println("Faget " + fagliste.get(i).getFagnr() + " " + fagliste.get(i).getFagnavn());
            for (int j = 0; j < fagliste.get(i).getKlasseListe().size(); j++) {
                System.out.println(fagliste.get(i).getKlasseListe().get(j).getFnavn());
            }
        }
    }

    public static void udskrivFagListeStuderende(Studerende s, Skole skole){
        ArrayList<Fag> fagliste = skole.getFagListeStuderende(s);
        System.out.println(s.getFnavn() + " går til følgende fag:");
        for (int i = 0; i < fagliste.size(); i++){
            System.out.println(fagliste.get(i).getFagnavn());
        }
    }
}
