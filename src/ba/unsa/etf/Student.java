package ba.unsa.etf;

public class Student extends Semestar {

    String imePrezimeStudenta = " ";
    int index = 0;
    String semestar;

    public Student(Student novi) {
        super(novi.imePrezimeStudenta, novi.index);
    }

    String ispisi() {
        return null;
    }

    void izborni(IzborniPredmet novi) {}

    int getIndex() {return index;}

    String getImePrezime() {return imePrezimeStudenta;}

    String getSemestar() {return semestar;}

    void setIndex(int index) {
        this.index = index;
    }

    void setImePrezime(String imePrezimeSutdenta) {
        this.imePrezimeStudenta = imePrezimeSutdenta;
    }

    void setSemestar(String s) {
        this.semestar = s;
    }

}
