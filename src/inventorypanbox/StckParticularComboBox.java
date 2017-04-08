/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorypanbox;

import beans.StckParticular;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.SwingWorker;

/**
 *
 * @author hp
 */
public class StckParticularComboBox extends SwingWorker<Void, StckParticular>{
    
    private final JComboBox combobox;
    private final ArrayList<StckParticular> list;

    public StckParticularComboBox(JComboBox combobox, ArrayList<StckParticular> list) {
        this.combobox = combobox;
        this.list = list;
    }
    
    

    @Override
    protected Void doInBackground() throws Exception {
        for(StckParticular s : list) {
            publish(s);
        }
        return null;
    }

    @Override
    protected void process(List<StckParticular> chunks) {
        combobox.removeAllItems();
        JComboBox<StckParticular> comboBox = new JComboBox<StckParticular>();
        comboBox.setModel(combobox.getModel());
        for(StckParticular s : chunks) {
            combobox.addItem(s.getParticularsname());
        }
    }
    
    
    
}
