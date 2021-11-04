import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class NouveauFichier {

    public static FileWriter newFile(String nomFichier, ArrayList<ArrayList<String>> d) throws IOException {
        nomFichier = nomFichier.replaceAll(".txt", ".html");
        FileWriter nouveauFichier = new FileWriter(nomFichier);
        nouveauFichier.write("<!DOCTYPE html>\n" +
                "<html lang =" + "jv" + ">\n" +
                " <head>\n" +
                " <title>TP 2</title>\n" +
                " </head>\n" +
                " <body>\n‘" + NouveauFichier.blocLignes(d) + "’\n" +
                    " <hr>\n" +
                    " <table>\n" +
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
            newString = newString + "&#" + ligne.get(i) + " ";
        }
        return newString;
    }

    public static String blocLignes(ArrayList<ArrayList<String>> d){
        String bloc = "";

        for(int i = 0; i < d.size(); i++){
            bloc = bloc + NouveauFichier.ligneString(d.get(i)) + "\n";
        }
        return bloc;
    }
    }


