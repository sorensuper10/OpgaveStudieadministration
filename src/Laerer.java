import java.util.ArrayList;

public class Laerer {

    private int laerernr;

    private String fnavn;

    private String enavn;

    private String adresse;

    private String postnr;

    private String mobil;

    ArrayList<Fag> fagListe = new ArrayList<>();

    public Laerer() {
    }

    public Laerer(int laerernr, String fnavn, String enavn, String adresse, String postnr, String mobil) {
        this.laerernr = laerernr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.postnr = postnr;
        this.mobil = mobil;
    }

    public Laerer(int laerernr, String fnavn, String enavn, String adresse, String postnr, String mobil, ArrayList<Fag> fagListe) {
        this.laerernr = laerernr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.postnr = postnr;
        this.mobil = mobil;
        this.fagListe = fagListe;
    }

    public int getLaerernr() {
        return laerernr;
    }

    public void setLaerernr(int laerernr) {
        this.laerernr = laerernr;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPostnr() {
        return postnr;
    }

    public void setPostnr(String postnr) {
        this.postnr = postnr;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public ArrayList<Fag> getFagListe() {
        return fagListe;
    }

    public void setFagListe(ArrayList<Fag> fagListe) {
        this.fagListe = fagListe;
    }

    public void tilfoejFag(Fag f){
        fagListe.add(f);
    }

    @Override
    public String toString() {
        return "Laerer{" +
                "laerernr=" + laerernr +
                ", fnavn='" + fnavn + '\'' +
                '}';
    }
}
