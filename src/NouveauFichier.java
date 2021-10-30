import java.io.FileWriter;
import java.io.IOException;

public class NouveauFichier {

    public static FileWriter newFile(String nomFichier) throws IOException {
        nomFichier = nomFichier.replaceAll(".txt", ".html");
        FileWriter nouveauFichier = new FileWriter(nomFichier);
        nouveauFichier.write("< !DOCTYPE html>\n" +
                "<html>\n" +
                " <head>\n" +
                " <title>TP 2</title>\n" +
                " </head>\n" +
                " <body>\n‘&#12371;’\n" +
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


