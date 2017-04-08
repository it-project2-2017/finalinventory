/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorypanbox;

import beans.LedgerRecord;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class PLedger extends SwingWorker<Void, LedgerRecord>{
    
    private final JTable table;
    private final ArrayList<LedgerRecord> list;

    public PLedger(JTable table, ArrayList<LedgerRecord> list) {
        this.table = table;
        this.list = list;
    }
    
    

    @Override
    protected Void doInBackground() throws Exception {
        for(LedgerRecord p : list) {
            publish(p);
        }
        return null;
    }

    @Override
    protected void process(List<LedgerRecord> chunks) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
            for(LedgerRecord l : chunks) {
                    dtm.addRow(new Object[]{l.getDate(), l.getReference(), l.getQtypurchased(), l.getQtyused(), l.getQtyadjusted(), l.getReason(), l.getQtyleft()});
            }
    }
}
