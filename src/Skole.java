import java.util.ArrayList;

public class Skole {

    ArrayList<Studerende> studerendeListe = new ArrayList<>();
    ArrayList<Fag> fagListe = new ArrayList<>();
    ArrayList<Laerer> laererListe = new ArrayList<>();

    public Skole() {
    }

    public Skole(ArrayList<Studerende> studerendeListe, ArrayList<Fag> fagListe, ArrayList<Laerer> laererListe) {
        this.studerendeListe = studerendeListe;
        this.fagListe = fagListe;
        this.laererListe = laererListe;
    }

    public ArrayList<Studerende> getStuderendeListe() {
        return studerendeListe;
    }

    public void setStuderendeListe(ArrayList<Studerende> studerendeListe) {
        this.studerendeListe = studerendeListe;
    }

    public ArrayList<Fag> getFagListe() {
        return fagListe;
    }

    public ArrayList<Fag> getFagListeStuderende(Studerende s) {
        ArrayList<Fag> liste = new ArrayList<>();
        int index = studerendeListe.indexOf(s);
        liste = studerendeListe.get(index).getTilmeldteFag();
        return liste;
    }

    public void setFagListe(ArrayList<Fag> fagListe) {
        this.fagListe = fagListe;
    }

    public ArrayList<Laerer> getLaererListe() {
        return laererListe;
    }

    public void setLaererListe(ArrayList<Laerer> laererListe) {
        this.laererListe = laererListe;
    }

    @Override
    public String toString() {
        return "Skole{" +
                "studerendeListe=" + studerendeListe +
                ", fagListe=" + fagListe +
                ", laererListe=" + laererListe +
                '}';
    }

    public Studerende getStuderende(int stdNr){
            return studerendeListe.get(stdNr);
    }

    public Fag getFag(int fagNr){
        return fagListe.get(fagNr);
    }

    public Laerer getLaerer(int laererNr){
        return laererListe.get(laererNr);
    }

    private int getStuderendeIndexNr(int stdNr){
    //returnerer indexpladsen i ArrayListen
        for (int i = 0; i < studerendeListe.size(); i++) {
            if (studerendeListe.get(i).getStdnr() == stdNr)
                return i;
        }
        return -1;
    }
    private int getStuderendeIndexNr(Studerende s){
    //returnerer indexpladsen i ArrayListen
        return studerendeListe.indexOf(s);
    }

    private int getFagIndexNr(int fagNr){
    //returnerer indexpladsen i ArrayListen
        for (int i = 0; i < fagListe.size(); i++){
            if (fagListe.get(i).getFagnr() == fagNr)
                return i;
        }
        return -1;
    }
    private int getFagIndexNr(Fag f){
    //returnerer indexpladsen i ArrayListen
        return fagListe.indexOf(f);
    }

    private int getLaererIndexNr(int laererNr) {
        //returnerer indexpladsen i ArrayListen
        for (int i = 0; i < laererListe.size(); i++) {
            if (laererListe.get(i).getLaerernr() == laererNr)
                return i;
        }
        return -1;
    }

    private int getLaererIndexNr(Laerer l){
    //returnerer indexpladsen i ArrayListen
        return laererListe.indexOf(l);
    }
    public void opretStuderende(Studerende s){
        studerendeListe.add(s);
    }

    public void opretStuderende(int stdNr,String f,String e, String a, String p, String m,
                                char k){
        Studerende s = new Studerende(stdNr,f,e,a,p,m,k);
        studerendeListe.add(s);
    }

    public void opretLaerer(Laerer l){
        laererListe.add(l);
    }

    public void opretLaerer(int lNr, String f, String e,String a,String p, String m){
        Laerer l = new Laerer(lNr,f,e,a,p,m);
        laererListe.add(l);
    }

    public void opretFag(Fag f){
        fagListe.add(f);
    }

    public void opretFag(int fagNr,String navn){
        Fag f = new Fag(fagNr,navn);
        fagListe.add(f);
    }
    public void tilmeldStuderendeFag(Studerende s, Fag f){
        int index = studerendeListe.indexOf(s);
        studerendeListe.get(index).tilmeldFag(f);
        index = fagListe.indexOf(f);
        fagListe.get(index).tilmeldStuderende(s);
    }
    public void frameldStuderendeFag(Studerende s, Fag f){
        int index = studerendeListe.indexOf(s);
        studerendeListe.get(index).frameldFag(f);
        index = fagListe.indexOf(f);
        fagListe.get(index).frameldStuderende(s);
    }
}
