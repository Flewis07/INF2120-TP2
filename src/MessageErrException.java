public class MessageErrException extends Exception{

    public MessageErrException(String message) {
        System.out.println(message);
        System.exit(-1);
    }
}
