import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NouveauFichier {

    public static FileWriter newFile(String nomFichier) throws IOException {
        nomFichier = nomFichier.replaceAll(".txt", ".html");
        FileWriter nouveauFichier = new FileWriter(nomFichier);
        nouveauFichier.write("Allo");
        nouveauFichier.close();
        return nouveauFichier;
    }
}
