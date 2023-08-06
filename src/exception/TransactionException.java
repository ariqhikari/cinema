package exception;

/**
 *
 * @author ariqhikari
 */
public class TransactionException extends Exception {
    public TransactionException() {
        
    }
    
    public TransactionException(String msg) {
        super(msg);
    }
}
