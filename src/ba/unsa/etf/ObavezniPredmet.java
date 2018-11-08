package ba.unsa.etf;

public class ObavezniPredmet extends Predmet {

    String imePredmeta = " ";
    int brojECTS = 0;
    Student BrStudenataNaPr;

    public ObavezniPredmet(IzborniPredmet op) {
        super();
    }

    private ObavezniPredmet() {

    }

    String getImePredmeta() {
        return imePredmeta;
    }

    int getBrojECTS() {
        return brojECTS;
    }

    void setImePredmeta(String predmet) {
        this.imePredmeta = predmet;
    }

    void setBrojECTS(int broj) {
        this.brojECTS = broj;
    }

    void upisiStudenta(Student student) {}

    @Override
    public String ispisi() {
        return "Na obaveznom predmetu " + imePredmeta + " ima " + BrStudenataNaPr + ".";
    }
}
