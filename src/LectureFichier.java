import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class LectureFichier {

    public static ArrayList<String> lectureFichier(String contenu) throws IOException {

        ArrayList<String> a = new ArrayList<>();
        String syllable = "";

            for (int i = 0; i < contenu.length(); i++) {
                switch (contenu.charAt(i)) {
                    case '\n':
                        syllable = syllable + " ";
                    a.add(syllable);
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        syllable = syllable + contenu.charAt(i);
                        a.add(syllable);
                        syllable = "";
                        break;
                    default:
                        syllable = syllable + contenu.charAt(i);
                        break;
                }

            }
        return a;
    }

    public static String convertirString (String nom) throws IOException {

        Path filePath = Paths.get(nom);
        String contenu = Files.readString(filePath);
        //contenu = contenu.replaceAll("\\s", "");

        return contenu;
    }

    public static String [] trimerString (String [] tableau){

        String [] tableau2 = new String[tableau.length];

        for (int i = 0; i < tableau.length; i++){
            tableau2[i] = tableau[i].replaceAll("\\s", "");
        }
        return tableau2;
    }
}
