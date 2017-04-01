/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorypanbox;

import beans.Product;
import beans.PurchaseOrder;
import beans.StckParticularPurOrd;
import beans.StckPurOrd;
import beans.Stock;
import beans.Supplier;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class StckPurOrdTable extends SwingWorker<Void, StckParticularPurOrd>{
    
    private final JTable table;
    private final ArrayList<StckParticularPurOrd> list;

    public StckPurOrdTable(JTable table, ArrayList<StckParticularPurOrd> list) {
        this.table = table;
        this.list = list;
    }
    
    

    @Override
    protected Void doInBackground() throws Exception {
        for(StckParticularPurOrd s : list) {
            publish(s);
        }
        return null;
    }

    @Override
    protected void process(List<StckParticularPurOrd> chunks) {
        Boolean bool = false;
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        for(StckParticularPurOrd spp : chunks) {
            dtm.addRow(new Object[]{spp.getParticularsid(), spp.getStckparticularname(), spp.getQtyordered(), spp.getQtydelivered(), bool});
        }
    }
    
    
    
}
