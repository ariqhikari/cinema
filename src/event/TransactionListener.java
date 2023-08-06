package event;

import entity.Transaction;
import model.TransactionModel;

/**
 *
 * @author ariqhikari
 */
public interface TransactionListener {
    public void onChange(TransactionModel model);
    public void onInsert(Transaction model);
}
