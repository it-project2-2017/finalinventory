/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorypanbox;

import beans.ReturnStock;
import beans.StckParticularPurOrd;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class StckReturnTable extends SwingWorker<Void, ReturnStock>{
    
    private final JTable table;
    private final ArrayList<ReturnStock> list;

    public StckReturnTable(JTable table, ArrayList<ReturnStock> list) {
        this.table = table;
        this.list = list;
    }
    
    

    @Override
    protected Void doInBackground() throws Exception {
        for(ReturnStock s : list) {
            publish(s);
        }
        return null;
    }

    @Override
    protected void process(List<ReturnStock> chunks) {
        Boolean bool = false;
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        for(ReturnStock retstck : chunks) {
            dtm.addRow(new Object[]{retstck.getStckparticularid(), retstck.getStckparticularname(), retstck.getQtydelivered(), retstck.getQtyreturned()});
        }
    }   
}
