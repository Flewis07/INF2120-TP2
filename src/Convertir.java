import java.io.IOException;
import java.util.ArrayList;

public class Convertir {

    public static ArrayList<String> convertion(String [] lignes, ArrayList<Lettre> katagana, ArrayList<Lettre> hiragana) throws IOException {

        ArrayList<ArrayList<String>> c;
        ArrayList<String> d = new ArrayList<>();

        for (int i = 0; i < lignes.length; i++) {
            c = LectureFichier.lectureFichier(lignes[i]);
            for (int j = 0; j < c.get(i).size(); j++) {
                if (c.get(i).get(j).charAt(0) >= 'A' && c.get(i).get(j).charAt(0) <= 'Z') {
                    d = convertirUnicode(katagana, c, d, i);
                } else if (c.get(i).get(j).charAt(0) >= 'a' && c.get(i).get(j).charAt(0) <= 'z') {
                    d = convertirUnicode(hiragana, c, d, i);
                }
            }
        }
        return d;
    }

    private static ArrayList<String> convertirUnicode(ArrayList<Lettre> e, ArrayList<ArrayList<String>> c,
                                                      ArrayList<String> d, int i) {
        Lettre valeur;
        int j = 0;
        int k = 0;


            while (j < e.size() && i < c.size()) {
                valeur = e.get(j);
                if (c.get(i).get(k).charAt(0) == valeur.a.charAt(0) && valeur.a.length() == 1) {
                    d.add(valeur.unicode);
                    j = 0;
                    i++;
                } else if (c.get(i).get(k).charAt(0) == valeur.a.charAt(0) && c.get(i).get(k).charAt(1) == valeur.a.charAt(1)
                        && valeur.a.length() == 2) {
                    d.add(valeur.unicode);
                    j = 0;
                    i++;
                } else if (c.get(i).get(k).charAt(0) == valeur.a.charAt(0) && c.get(i).get(k).charAt(1) == valeur.a.charAt(1)
                        && c.get(i).get(k).charAt(2) == valeur.a.charAt(2) && valeur.a.length() == 3) {
                    d.add(valeur.unicode);
                    j = 0;
                    i++;
                } else {
                    j++;
                }
            }

        return d;
    }
}
