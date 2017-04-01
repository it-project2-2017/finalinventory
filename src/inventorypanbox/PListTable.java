/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorypanbox;

import beans.Product;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class PListTable extends SwingWorker<Void, Product>{
    
    private final JTable table;
    private final ArrayList<Product> list;

    public PListTable(JTable table, ArrayList<Product> list) {
        this.table = table;
        this.list = list;
    }
    
    

    @Override
    protected Void doInBackground() throws Exception {
        for(Product p : list) {
            publish(p);
        }
        return null;
    }

    @Override
    protected void process(List<Product> chunks) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        for(Product p : chunks) {
            dtm.addRow(new Object[]{p.getId(), p.getName(), p.getPrice()});
        }
    }
    
    
    
}
