/**
 * Cette classe permet de construire une erreur selon le type de situation.
 */
public class MessageErrException extends Exception{

    /**
     * Permet de definir un message d'erreur selon un type de situation.
     * @param message Le message d'erreur a afficher en parametres.
     */
    public MessageErrException(String message) {
        System.out.println(message);
        System.exit(-1);
    }
}
