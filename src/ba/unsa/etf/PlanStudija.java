package ba.unsa.etf;

public class PlanStudija extends Semestar{

    private String ime = "";
    private Semestar studiji;

    public PlanStudija(String ime, int broj, ObavezniPredmet obavezni) {
        super(ime, broj, obavezni);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String ispisi() {
        return "";
    }
}
