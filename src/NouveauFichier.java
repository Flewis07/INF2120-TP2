import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class NouveauFichier {

    public static FileWriter newFile(String nomFichier, ArrayList d) throws IOException {
        nomFichier = nomFichier.replaceAll(".txt", ".html");
        FileWriter nouveauFichier = new FileWriter(nomFichier);
        nouveauFichier.write("< !DOCTYPE html>\n" +
                "<html>\n" +
                " <head>\n" +
                " <title>TP 2</title>\n" +
                " </head>\n" +
                " <body>\n‘" + d.toString() + "’\n" +
                    " <hr>\n" +
                    " <table>\n" +
                    " </table>\n" +
                    "<hr>\n" +
                    "</body> \n" +
                    "</html>");
        nouveauFichier.close();
        return nouveauFichier;
    }
    }


