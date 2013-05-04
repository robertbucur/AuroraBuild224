package controller.tablemodel;

import model.Echipament;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
* TableModel pentru <code>Echipament</code>
*
* @author Florin Mihalache
* @version 1.0, 4 mai 2013
*/
public class EchipamentTableModel extends AbstractTableModel {
    private List<Echipament> list;
    private String[] cols = {"Tip", "Model"};

    public EchipamentTableModel(List<Echipament> list) {
        this.list = list;
    }

    @Override
    public String getColumnName(int column) {
        return cols[column];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Echipament echipament = list.get(rowIndex);
        switch (columnIndex) {
            case 0: return echipament.getTip();
            case 1: return echipament.getModel();
        }
        return null;
    }

    public List<Echipament> getList() {
        return list;
    }
}
