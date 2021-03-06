/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorypanbox;

import beans.Stock;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class StckComboBox extends SwingWorker<Void, Stock>{
    
    private final JTable table;
    private final ArrayList<Stock> list;

    public StckComboBox(JTable table, ArrayList<Stock> list) {
        this.table = table;
        this.list = list;
    }
    
    

    @Override
    protected Void doInBackground() throws Exception {
        for(Stock s : list) {
            publish(s);
        }
        return null;
    }

    @Override
    protected void process(List<Stock> chunks) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        for(Stock s : chunks) {
            dtm.addRow(new Object[]{s.getStockName()});
        }
}
}