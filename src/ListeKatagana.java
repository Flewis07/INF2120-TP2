import java.util.ArrayList;

/**
 * Cette classe permet de construire une liste d'unicode de type Katagana.
 */
public class ListeKatagana {

    /**
     * Cree un Arraylist contenant les syllables ainsi que leurs convertions en Katagana.
     * @return un Arraylist contenant les syllables et leurs unicodes de coversion Katagana.
     */
    public static ArrayList<Lettre> katagana() {

        ArrayList<Lettre> katagana = new ArrayList<>();

        katagana.add(new Lettre("A", "&#12450;"));
        katagana.add(new Lettre("I", "&#12452;"));
        katagana.add(new Lettre("U", "&#12454;"));
        katagana.add(new Lettre("E", "&#12456;"));
        katagana.add(new Lettre("O", "&#12458;"));

        katagana.add(new Lettre("Ka", "&#12459;"));
        katagana.add(new Lettre("Ki", "&#12461;"));
        katagana.add(new Lettre("Ku", "&#12463;"));
        katagana.add(new Lettre("Ke", "&#12465;"));
        katagana.add(new Lettre("Ko", "&#12467;"));

        katagana.add(new Lettre("Sa", "&#12469;"));
        katagana.add(new Lettre("Shi", "&#12471;"));
        katagana.add(new Lettre("Su", "&#12473;"));
        katagana.add(new Lettre("Se", "&#12475;"));
        katagana.add(new Lettre("So", "&#12477;"));

        katagana.add(new Lettre("Ta", "&#12479;"));
        katagana.add(new Lettre("Chi", "&#12481;"));
        katagana.add(new Lettre("Tsu", "&#12484;"));
        katagana.add(new Lettre("Te", "&#12486;"));
        katagana.add(new Lettre("To", "&#12488;"));

        katagana.add(new Lettre("Na", "&#12394;"));
        katagana.add(new Lettre("Ni", "&#12395;"));
        katagana.add(new Lettre("Nu", "&#12396;"));
        katagana.add(new Lettre("Ne", "&#12397;"));
        katagana.add(new Lettre("No", "&#12398;"));

        katagana.add(new Lettre("Ha", "&#12495;"));
        katagana.add(new Lettre("Hi", "&#12498;"));
        katagana.add(new Lettre("Fu", "&#12501;"));
        katagana.add(new Lettre("He", "&#12504;"));
        katagana.add(new Lettre("Ho", "&#12507;"));

        katagana.add(new Lettre("Ma", "&#12510;"));
        katagana.add(new Lettre("Mi", "&#12511;"));
        katagana.add(new Lettre("Mu", "&#12512;"));
        katagana.add(new Lettre("Me", "&#12513;"));
        katagana.add(new Lettre("Mo", "&#12514;"));

        katagana.add(new Lettre("Ya", "&#12516;"));
        katagana.add(new Lettre("Yu", "&#12518;"));
        katagana.add(new Lettre("Yo", "&#12520;"));

        katagana.add(new Lettre("Ra", "&#12521;"));
        katagana.add(new Lettre("Ri", "&#12522;"));
        katagana.add(new Lettre("Ru", "&#12523;"));
        katagana.add(new Lettre("Re", "&#12524;"));
        katagana.add(new Lettre("Ro", "&#12525;"));

        katagana.add(new Lettre("Wa", "&#12527;"));
        katagana.add(new Lettre("Wi", "&#12528;"));
        katagana.add(new Lettre("We", "&#12529;"));
        katagana.add(new Lettre("Wo", "&#12530;"));

        katagana.add(new Lettre("Ga", "&#12460;"));
        katagana.add(new Lettre("Gi", "&#12462;"));
        katagana.add(new Lettre("Gu", "&#12464;"));
        katagana.add(new Lettre("Ge", "&#12466;"));
        katagana.add(new Lettre("Go", "&#12468;"));

        katagana.add(new Lettre("Za", "&#12470;"));
        katagana.add(new Lettre("Ji", "&#12472;"));
        katagana.add(new Lettre("Zu", "&#12474;"));
        katagana.add(new Lettre("Ze", "&#12476;"));
        katagana.add(new Lettre("Zo", "&#12478;"));

        katagana.add(new Lettre("Da", "&#12480;"));
        katagana.add(new Lettre("Dji", "&#12482;"));
        katagana.add(new Lettre("Dzu", "&#12485;"));
        katagana.add(new Lettre("De", "&#12487;"));
        katagana.add(new Lettre("Do", "&#12489;"));

        katagana.add(new Lettre("Ba", "&#12496;"));
        katagana.add(new Lettre("Bi", "&#12499;"));
        katagana.add(new Lettre("Bu", "&#12502;"));
        katagana.add(new Lettre("Be", "&#12505;"));
        katagana.add(new Lettre("Bo", "&#12508;"));

        katagana.add(new Lettre("Pa", "&#12498;"));
        katagana.add(new Lettre("Pi", "&#12500;"));
        katagana.add(new Lettre("Pu", "&#12503;"));
        katagana.add(new Lettre("Pe", "&#12506;"));
        katagana.add(new Lettre("Po", "&#12509;"));

        katagana.add(new Lettre("Kya", "&#12461;&#12515;"));
        katagana.add(new Lettre("Kyu", "&#12461;&#12517;"));
        katagana.add(new Lettre("Kyo", "&#12461;&#12519;"));

        katagana.add(new Lettre("Nya", "&#12491;&#12515;"));
        katagana.add(new Lettre("Nyu", "&#12491;&#12517;"));
        katagana.add(new Lettre("Nyo", "&#12491;&#12519;"));

        katagana.add(new Lettre("Hya", "&#12498;&#12515;"));
        katagana.add(new Lettre("Hyu", "&#12498;&#12517;"));
        katagana.add(new Lettre("Hyo", "&#12498;&#12519;"));

        katagana.add(new Lettre("Mya", "&#12511;&#12515;"));
        katagana.add(new Lettre("Myu", "&#12511;&#12517;"));
        katagana.add(new Lettre("Myo", "&#12511;&#12519;"));

        katagana.add(new Lettre("Rya", "&#12522;&#12515;"));
        katagana.add(new Lettre("Ryu", "&#12522;&#12517;"));
        katagana.add(new Lettre("Ryo", "&#12522;&#12519;"));

        katagana.add(new Lettre("Gya", "&#12462;&#12515;"));
        katagana.add(new Lettre("Gyu", "&#12462;&#12517;"));
        katagana.add(new Lettre("Gyo", "&#12462;&#12519;"));

        katagana.add(new Lettre("Bya", "&#12499;&#12515;"));
        katagana.add(new Lettre("Byu", "&#12499;&#12517;"));
        katagana.add(new Lettre("Byo", "&#12499;&#12519;"));

        katagana.add(new Lettre("Pya", "&#12500;&#12515;"));
        katagana.add(new Lettre("Pyu", "&#12500;&#12517;"));
        katagana.add(new Lettre("Pyo", "&#12500;&#12519;"));

        katagana.add(new Lettre("N'", "&#12531;"));

        return katagana;
    }
}
