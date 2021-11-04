import java.io.IOException;
import java.util.ArrayList;

public class Convertir {

    public static ArrayList<String> convertion(String [] lignes, ArrayList<Lettre> katagana, ArrayList<Lettre> hiragana) throws IOException {

        ArrayList<String> c;
        ArrayList<String> d = new ArrayList<>();

        for (int i = 0; i < lignes.length; i++) {
            int j = 0;
            c = LectureFichier.lectureFichier(lignes[i]);
            if (c.get(i).charAt(0) >= 'A' && c.get(i).charAt(0) <= 'Z') {
                d = convertirUnicode(katagana, c, d, i);
            }else if(c.get(i).charAt(0) >= 'a' && c.get(i).charAt(0) <= 'z') {
                d = convertirUnicode(hiragana, c, d, i);
            }
            }
        return d;
    }

    private static ArrayList<String> convertirUnicode(ArrayList<Lettre> e, ArrayList<String> c, ArrayList<String> d, int i){
        Lettre valeur;
        int j = 0;

        while (j < e.size()) {
            valeur = e.get(j);
            switch(c.get(i).length()) {
                case 1:
                    if (c.get(i).charAt(0) == valeur.a.charAt(0)) {
                        d.add(valeur.unicode);
                        j = 0;
                        i++;
                    } else {
                        j++;
                    }
                break;
                        case 2:
                            if (c.get(i).charAt(0) == valeur.a.charAt(0)) {
                                if (c.get(i).charAt(1) == valeur.a.charAt(1)) {
                                    d.add(valeur.unicode);
                                    j = 0;
                                    i++;
                                }else{
                                    j++;
                                }
                            } else {
                                j++;
                            }
                                break;
                                default:
                                    j++;
                            }


            }
        return d;
    }
}
