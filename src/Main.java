public class Main {
    public static void main(String[] args) {
        Kniha k1 = new Kniha();
        k1.setNazov("Kniha1");
        k1.setAutor("Rastislav Biba");
        k1.setAktualnaStrana(10);
        k1.setPocetStran(40);

        Kniha k2 = new Kniha();
        k2.setNazov("Kniha2");
        k2.setAutor("Rastislav Biba");
        k2.setAktualnaStrana(4);
        k2.setPocetStran(30);

        Kniha []kniha = new Kniha[10];
        kniha[0] = new Kniha();
        kniha[0].setNazov("Kniha 01");
        kniha[0].setAutor("Autor01");
        kniha[0].setAktualnaStrana(3);
        kniha[0].setPocetStran(20);

        kniha[1] = new Kniha();
        kniha[1].setNazov("Kniha 02");
        kniha[1].setAutor("Autor02");
        kniha[1].setAktualnaStrana(3);
        kniha[1].setPocetStran(20);

        kniha[3] = new Kniha();
        kniha[3].setNazov("Kniha 03");
        kniha[3].setAutor("Autor03");
        kniha[3].setAktualnaStrana(3);
        kniha[3].setPocetStran(20);

    }
}
