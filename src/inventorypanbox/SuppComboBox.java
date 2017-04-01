/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorypanbox;

import beans.Product;
import beans.PurchaseOrder;
import beans.Supplier;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class SuppComboBox extends SwingWorker<Void, Supplier>{
    
    private final JComboBox combobox;
    private final ArrayList<Supplier> list;

    public SuppComboBox(JComboBox combobox, ArrayList<Supplier> list) {
        this.combobox = combobox;
        this.list = list;
    }
    
    

    @Override
    protected Void doInBackground() throws Exception {
        for(Supplier s : list) {
            publish(s);
        }
        return null;
    }

    @Override
    protected void process(List<Supplier> chunks) {
        JComboBox<Supplier> comboBox = new JComboBox<Supplier>();
        comboBox.setModel(combobox.getModel());
        for(Supplier s : chunks) {
            combobox.addItem(s.getName());
        }
        combobox.setSelectedItem("SM");
    }
    
    
    
}
