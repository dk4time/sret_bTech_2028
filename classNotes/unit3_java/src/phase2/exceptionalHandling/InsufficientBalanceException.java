package phase2.exceptionalHandling;

//Custom unchecked exception
public class InsufficientBalanceException extends RuntimeException {

 public InsufficientBalanceException(String message) {
     super(message);
 }
}

