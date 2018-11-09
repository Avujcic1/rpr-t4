package ba.unsa.etf;

public class IzborniPredmet extends Predmet {

    String imePredmeta = "";
    int brojECTS = 0;
    Student BrStudenataNaPr;

    public IzborniPredmet(IzborniPredmet ip) {
        this.imePredmeta = ip.imePredmeta;
        this.brojECTS = ip.brojECTS;
    }

    private IzborniPredmet() {};

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
        return "Na Izbornom predmetu " + imePredmeta + " ima " + BrStudenataNaPr + ".";
    }


}
