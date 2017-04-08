/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorypanbox;

import beans.PurchaseOrder;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class POListTable extends SwingWorker<Void, PurchaseOrder>{
    
    private final JTable table;
    private final ArrayList<PurchaseOrder> list;

    public POListTable(JTable table, ArrayList<PurchaseOrder> list) {
        this.table = table;
        this.list = list;
    }
    
    

    @Override
    protected Void doInBackground() throws Exception {
        for(PurchaseOrder p : list) {
            publish(p);
        }
        return null;
    }

    @Override
    protected void process(List<PurchaseOrder> chunks) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
            for(PurchaseOrder p : chunks) {
                    dtm.addRow(new Object[]{p.getPoid(), p.getDateordered(), p.getStatus()});
            }
    }
}
