import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LectureFichier {

    /**
     * Permet de lire une ligne de String et de la separer en syllables.
     * @param contenu ligne de String a separer.
     * @return un Arraylist contenant un Arraylist de Syllables en String.
     * @throws IOException
     */
    public static ArrayList<ArrayList<String>> lectureFichier(String contenu) throws IOException {

        ArrayList<ArrayList<String>> a = new ArrayList<>();
        String syllable = "";
        int position = 0;

            for (int i = 0; i < contenu.length(); i++) {
                switch (contenu.charAt(i)) {
                    case '\n':
                        syllable = syllable + " ";
                        a.add(new ArrayList<>());
                        a.get(position).add(syllable);
                        position++;
                        break;
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        syllable = syllable + contenu.charAt(i);
                        a.add(new ArrayList<String>());
                        a.get(position).add(syllable);
                        syllable = "";
                        position++;
                        break;
                    default:
                        syllable = syllable + contenu.charAt(i);
                        break;
                }

            }
        return a;
    }

    /**
     * Permet de convertir un fichier text en String.
     * @param nom nom du fichier dont le contenu sera converti en String.
     * @return le contenu du fichier sous forme de String.
     * @throws IOException
     */
    public static String convertirString (String nom) throws IOException {

        Path filePath = Paths.get(nom);
        String contenu = Files.readString(filePath);

        return contenu;
    }

    /**
     * Retire les espace du tableau String.
     * @param tableau tableau de String dans lequel il faut retirer les espace blancs.
     * @return un tableau de String sans espaces blancs.
     */
    public static String [] trimerString (String [] tableau){

        String [] tableau2 = new String[tableau.length];

        for (int i = 0; i < tableau.length; i++){
            tableau2[i] = tableau[i].replaceAll("\\s", "");
        }
        return tableau2;
    }
}
