import java.util.ArrayList;

public class Hiragana {

    /**
     * Cree un Arraylist contenant les syllables ainsi que leurs convertions en Hiragana.
     * @return un Arraylist contenant les syllables et leurs unicodes de coversion Hiragana.
     */
    public static ArrayList<Lettre> hiragana(){

        ArrayList<Lettre> hiragana = new ArrayList<>();

        hiragana.add(new Lettre("a", "&#12354;"));
        hiragana.add(new Lettre("i", "&#12356;"));
        hiragana.add(new Lettre("u", "&#12358;"));
        hiragana.add(new Lettre("e", "&#12360;"));
        hiragana.add(new Lettre("o", "&#12362;"));

        hiragana.add(new Lettre("ka", "&#12363;"));
        hiragana.add(new Lettre("ki", "&#12365;"));
        hiragana.add(new Lettre("ku", "&#12367;"));
        hiragana.add(new Lettre("ke", "&#12369;"));
        hiragana.add(new Lettre("ko", "&#12371;"));

        hiragana.add(new Lettre("sa", "&#12373;"));
        hiragana.add(new Lettre("shi", "&#12375;"));
        hiragana.add(new Lettre("su", "&#12377;"));
        hiragana.add(new Lettre("se", "&#12379;"));
        hiragana.add(new Lettre("so", "&#12381;"));

        hiragana.add(new Lettre("ta", "&#12383;"));
        hiragana.add(new Lettre("chi", "&#12385;"));
        hiragana.add(new Lettre("tsu", "&#12388;"));
        hiragana.add(new Lettre("te", "&#12390;"));
        hiragana.add(new Lettre("to", "&#12392;"));

        hiragana.add(new Lettre("na", "&#12394;"));
        hiragana.add(new Lettre("ni", "&#12395;"));
        hiragana.add(new Lettre("nu", "&#12396;"));
        hiragana.add(new Lettre("ne", "&#12397;"));
        hiragana.add(new Lettre("no", "&#12398;"));

        hiragana.add(new Lettre("ha", "&#12399;"));
        hiragana.add(new Lettre("hi", "&#12402;"));
        hiragana.add(new Lettre("fu", "&#12405;"));
        hiragana.add(new Lettre("he", "&#12408;"));
        hiragana.add(new Lettre("ho", "&#12411;"));

        hiragana.add(new Lettre("ma", "&#12414;"));
        hiragana.add(new Lettre("mi", "&#12415;"));
        hiragana.add(new Lettre("mu", "&#12416;"));
        hiragana.add(new Lettre("me", "&#12417;"));
        hiragana.add(new Lettre("mo", "&#12418;"));

        hiragana.add(new Lettre("ya", "&#12420;"));
        hiragana.add(new Lettre("yu", "&#12422;"));
        hiragana.add(new Lettre("yo", "&#12424;"));

        hiragana.add(new Lettre("ra", "&#12425;"));
        hiragana.add(new Lettre("ri", "&#12426;"));
        hiragana.add(new Lettre("ru", "&#12427;"));
        hiragana.add(new Lettre("re", "&#12428;"));
        hiragana.add(new Lettre("ro", "&#12429;"));

        hiragana.add(new Lettre("wa", "&#12431;"));
        hiragana.add(new Lettre("wi", "&#12432;"));
        hiragana.add(new Lettre("we", "&#12433;"));
        hiragana.add(new Lettre("wo", "&#12434;"));

        hiragana.add(new Lettre("ga", "&#12364;"));
        hiragana.add(new Lettre("gi", "&#12366;"));
        hiragana.add(new Lettre("gu", "&#12368;"));
        hiragana.add(new Lettre("ge", "&#12370;"));
        hiragana.add(new Lettre("go", "&#12372;"));

        hiragana.add(new Lettre("za", "&#12374;"));
        hiragana.add(new Lettre("ji", "&#12376;"));
        hiragana.add(new Lettre("zu", "&#12378;"));
        hiragana.add(new Lettre("ze", "&#12380;"));
        hiragana.add(new Lettre("zo", "&#12382;"));

        hiragana.add(new Lettre("da", "&#12384;"));
        hiragana.add(new Lettre("dji", "&#12386;"));
        hiragana.add(new Lettre("dzu", "&#12389;"));
        hiragana.add(new Lettre("de", "&#12391;"));
        hiragana.add(new Lettre("do", "&#12393;"));

        hiragana.add(new Lettre("ba", "&#12400;"));
        hiragana.add(new Lettre("bi", "&#12403;"));
        hiragana.add(new Lettre("bu", "&#12406;"));
        hiragana.add(new Lettre("be", "&#12409;"));
        hiragana.add(new Lettre("bo", "&#12412;"));

        hiragana.add(new Lettre("pa", "&#12401;"));
        hiragana.add(new Lettre("pi", "&#12404;"));
        hiragana.add(new Lettre("pu", "&#12407;"));
        hiragana.add(new Lettre("pe", "&#12410;"));
        hiragana.add(new Lettre("po", "&#12413;"));

        hiragana.add(new Lettre("kya", "&#12365;&#12419;"));
        hiragana.add(new Lettre("kyu", "&#12365;&#12421;"));
        hiragana.add(new Lettre("kyo", "&#12365;&#12423;"));

        hiragana.add(new Lettre("nya", "&#12395;&#12419;"));
        hiragana.add(new Lettre("nyu", "&#12395;&#12421;"));
        hiragana.add(new Lettre("nyo", "&#12395;&#12423;"));

        hiragana.add(new Lettre("hya", "&#12402;&#12419;"));
        hiragana.add(new Lettre("hyu", "&#12402;&#12421;"));
        hiragana.add(new Lettre("hyo", "&#12402;&#12423;"));

        hiragana.add(new Lettre("mya", "&#12415;&#12419;"));
        hiragana.add(new Lettre("myu", "&#12415;&#12421;"));
        hiragana.add(new Lettre("myo", "&#12415;&#12423;"));

        hiragana.add(new Lettre("rya", "&#12426;&#12419;"));
        hiragana.add(new Lettre("ryu", "&#12426;&#12421;"));
        hiragana.add(new Lettre("ryo", "&#12426;&#12423;"));

        hiragana.add(new Lettre("gya", "&#12366;&#12419;"));
        hiragana.add(new Lettre("gyu", "&#12366;&#12421;"));
        hiragana.add(new Lettre("gyo", "&#12366;&#12423;"));

        hiragana.add(new Lettre("bya", "&#12403;&#12419;"));
        hiragana.add(new Lettre("byu", "&#12403;&#12421;"));
        hiragana.add(new Lettre("byo", "&#12403;&#12423;"));

        hiragana.add(new Lettre("pya", "&#12404;&#12419;"));
        hiragana.add(new Lettre("pyu", "&#12404;&#12421;"));
        hiragana.add(new Lettre("pyo", "&#12404;&#12423;"));

        hiragana.add(new Lettre("n'", "&#12435;"));

        return hiragana;
    }
}
