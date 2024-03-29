public class Praks9 {
    public static void main(String[] args) {
        Tipp tipp1 = new Tipp(1);
        Tipp tipp2 = new Tipp(2);
        Tipp tipp3 = new Tipp(3);
        Tipp tipp4 = new Tipp(4);
        Tipp tipp5 = new Tipp(5);
        Tipp tipp6 = new Tipp(6);

        System.out.println("Juurtipu väärtus: " + tipp1.getVäärtus());

        tipp1.setVasakAlluv(tipp2);
        tipp1.setParemAlluv(tipp3);
        tipp4.setVasakAlluv(tipp5);
        tipp4.setParemAlluv(tipp6);
        tipp2.setParemAlluv(tipp4);

        System.out.println("Puu eesjärjestus: ");
        tipp1.eesjärjestus();

        System.out.println("algse Puu sulgesitus:");
        System.out.println(tipp1.sulgesitus());

        Tipp puu=Tipp.genereeri(4);
        System.out.println("auto gen Puu sulgesitus:");
        System.out.println(puu.sulgesitus());

        puu.täida(puu,1);
        System.out.println("auto gen Puu uus sulgesitus:");
        System.out.println(puu.sulgesitus());

        System.out.println("auto gen tippude arv: "+puu.tippudeArv());
        System.out.println("algse tippude arv: "+tipp1.tippudeArv());

        System.out.println("auto gen korgus: "+puu.kõrgus());
        System.out.println("algse korgus: "+tipp1.kõrgus());
    }
}
