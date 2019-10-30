import java.util.Random;

public class Tipp {
    private int väärtus;
    private Tipp vasakAlluv;
    private Tipp paremAlluv;

    public Tipp(int väärtus, Tipp vasakAlluv, Tipp paremAlluv) {
        this.väärtus = väärtus;
        this.vasakAlluv = vasakAlluv;
        this.paremAlluv = paremAlluv;
    }

    public Tipp(int väärtus) {
        this.väärtus = väärtus;
    }

    public int getVäärtus() {
        return väärtus;
    }

    public void setVäärtus(int väärtus) {
        this.väärtus = väärtus;
    }

    public Tipp getVasakAlluv() {
        return vasakAlluv;
    }

    public Tipp getParemAlluv() {
        return paremAlluv;
    }

    public void setVasakAlluv(Tipp t) {
        this.vasakAlluv = t;
    }

    public void setParemAlluv(Tipp t) {
        this.paremAlluv = t;
    }

    public void eesjärjestus() {
        System.out.println(getVäärtus());
        if (vasakAlluv != null) vasakAlluv.eesjärjestus();
        if (paremAlluv != null) paremAlluv.eesjärjestus();
    }

    public void keskjärjestus() {
        // TODO: Keskjärjestus
        throw new UnsupportedOperationException();
    }

    public void lõppjärjestus() {
        // TODO: Lõppjärjestus
        throw new UnsupportedOperationException();
    }

    public String sulgesitus() {
        return getVäärtus() + "(" +
                (vasakAlluv != null ? vasakAlluv.sulgesitus() : "()") +
                (paremAlluv != null ? paremAlluv.sulgesitus() : "()") + ")";
    }

    // Koostada rekursiivne meetod, mis genereerib juhusliku AVL-puu etteantud kõrgusega
    public static Tipp genereeri(int kõrgus) {
        if(kõrgus==0)return null;
        if(kõrgus==1)return new Tipp(0);
        Integer arv=new Random().nextInt(3);
        switch (arv) {
            case 0:
                return new Tipp(0, genereeri(kõrgus - 1), genereeri(kõrgus - 1));
            case 1:
                return new Tipp(0, genereeri(kõrgus - 1), genereeri(kõrgus - 1));
            default:
                return new Tipp(0, genereeri(kõrgus - 2), genereeri(kõrgus - 2));
        }
    }

    // TODO: Ülesanne 2
    // Koostada meetod etteantud AVL-puu tippude arvu leidmiseks
    public int tippudeArv() {
        throw new UnsupportedOperationException();
    }

    // TODO: Ülesanne 2
    // Koostada meetod etteantud AVL-puu kõrguse leidmiseks
    public int kõrgus() {
        throw new UnsupportedOperationException();
    }

    // TODO: Ülesanne 3
    // Koostada meetod etteantud struktuuriga n-tipulise AVL-puu täitmiseks
    // täisarvudega 1, ..., n nii, et puu täidaks kahendotsimise puu tingimust
    public void täida(Tipp puu) {
        throw new UnsupportedOperationException();
    }

    // TODO: Ülesanne 4
    // Koostada meetod etteantud AVL-puu väljastamiseks ekraanile
    public void väljasta() {
        throw new UnsupportedOperationException();
    }

    // TODO: Ülesanne 5
    // Koostada meetod etteantud võtmeväärtusega kirje otsimiseks AVL-puust
    // Tagastada leitud tipp
    public Tipp otsi(int kirje) {
        throw new UnsupportedOperationException();
    }

    // TODO: Ülesanne 6 (iseseisev)
    // Koostada meetodid etteantud võtmeväärtusega kirje lisamiseks (koos tasakaalustamisega) AVL-puust
    // Tagastada uus juurtipp
    public Tipp lisa(int kirje) {
        throw new UnsupportedOperationException();
    }

    // TODO: Ülesanne 6 (iseseisev)
    // Koostada meetodid etteantud võtmeväärtusega kirje eemaldamiseks (koos tasakaalustamisega) AVL-puust
    // Tagastada uus juurtipp
    public Tipp eemalda(int kirje) {
        throw new UnsupportedOperationException();
    }
}