package ba.unsa.etf;

public abstract class Semestar  {

    String imeSemestra = "";
    Predmet predmeti;
    int brojECTS = 0;

    public Semestar(String ime, int broj, ObavezniPredmet obavezni) {};

    String getStudent(Student s) {
        return s.imePrezimeStudenta;
    }

    public void upisiStudenta(Student s) {};

    public void dodajIzborni(IzborniPredmet iz) {};

    public String getImeSemestra() {
        return imeSemestra;
    }

    public void setImeSemestra(String ime) {
        this.imeSemestra = ime;
    }

    public int getECTS() {
        return brojECTS;
    }

    public void setECTS(int broj) {
        this.brojECTS = broj;
    }

    public String ispisi() {
        return "";
    }
}
