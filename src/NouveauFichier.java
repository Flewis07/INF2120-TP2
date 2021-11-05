import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class NouveauFichier {

    public static FileWriter newFile(String nomFichier, ArrayList<ArrayList<String>> d) throws IOException {
        nomFichier = nomFichier.replaceAll(".txt", ".html");
        FileWriter nouveauFichier = new FileWriter(nomFichier);
        nouveauFichier.write("<!DOCTYPE html>\n" +
                "<html>\n" +
                " <head>\n" +
                " <title>TP 2</title>\n" +
                "<style>\n" +
                "p {\n writing-mode: vertical-rl;\n text-orientation: upright;\n }" +
  "</style>\n" +
                " </head>\n" +
                " <body>\n" +
                    " <hr>\n" +
                    " <table>\n" +
                    "<tr>\n" +
                NouveauFichier.blocLignes(d) + "\n" +
                    "</tr>\n" +
                    " </table>\n" +
                    "<hr>\n" +
                    "</body> \n" +
                    "</html>");
        nouveauFichier.close();
        return nouveauFichier;
    }

    public static String ligneString(ArrayList<String> ligne){
        String newString = "";

        for(int i = 0; i < ligne.size(); i++){
            newString = newString + "&#" + ligne.get(i) + "; ";
        }
        return newString;
    }

    public static String blocLignes(ArrayList<ArrayList<String>> d){
        String bloc = "";

        for(int i = 0; i < d.size(); i++){
            bloc = bloc + "<td><p>" + NouveauFichier.ligneString(d.get(i)) + "</p></td>\n";
        }
        return bloc;
    }
    }


