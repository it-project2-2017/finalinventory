/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorypanbox;

import beans.Employee;
import beans.StckParticular;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.SwingWorker;

/**
 *
 * @author hp
 */
public class EmpComboBox extends SwingWorker<Void, Employee>{
    
    private final JComboBox combobox;
    private final ArrayList<Employee> list;

    public EmpComboBox(JComboBox combobox, ArrayList<Employee> list) {
        this.combobox = combobox;
        this.list = list;
    }
    
    

    @Override
    protected Void doInBackground() throws Exception {
        for(Employee e : list) {
            publish(e);
        }
        return null;
    }

    @Override
    protected void process(List<Employee> chunks) {
        combobox.removeAllItems();
        JComboBox<Employee> comboBox = new JComboBox<Employee>();
        comboBox.setModel(combobox.getModel());
        for(Employee e : chunks) {
            combobox.addItem(e.getName());
        }
    }
    
    
    
}
