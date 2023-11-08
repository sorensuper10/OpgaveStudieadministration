import java.util.ArrayList;

public class Fag {

    private int fagnr;
    private String fagnavn;

    private Laerer laerer;
    ArrayList<Studerende> klasseListe = new ArrayList<>();

    public Fag() {
    }

    public Fag(int fagnr, String fagnavn) {
        this.fagnr = fagnr;
        this.fagnavn = fagnavn;
    }

    public Fag(int fagnr, String fagnavn, Laerer laerer) {
        this.fagnr = fagnr;
        this.fagnavn = fagnavn;
        this.laerer = laerer;
    }

    public Fag(int fagnr, String fagnavn, Laerer laerer, ArrayList<Studerende> klasseListe) {
        this.fagnr = fagnr;
        this.fagnavn = fagnavn;
        this.laerer = laerer;
        this.klasseListe = klasseListe;
    }

    public int getFagnr() {
        return fagnr;
    }

    public void setFagnr(int fagnr) {
        this.fagnr = fagnr;
    }

    public String getFagnavn() {
        return fagnavn;
    }

    public void setFagnavn(String fagnavn) {
        this.fagnavn = fagnavn;
    }

    public Laerer getLaerer() {
        return laerer;
    }

    public void setLaerer(Laerer laerer) {
        this.laerer = laerer;
    }

    public ArrayList<Studerende> getKlasseListe() {
        return klasseListe;
    }

    public void setKlasseListe(ArrayList<Studerende> klasseListe) {
        this.klasseListe = klasseListe;
    }

    public void tilmeldStuderende(Studerende s) {
        klasseListe.add(s);
    }

    public void frameldStuderende(Studerende s){
        klasseListe.remove(s);
    }

    @Override
    public String toString() {
        return "Fag{" +
                "fagnr=" + fagnr +
                ", fagnavn='" + fagnavn + '\'' +
                ", laerer=" + laerer +
                '}';
    }
}
