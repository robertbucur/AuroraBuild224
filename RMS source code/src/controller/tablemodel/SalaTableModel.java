package controller.tablemodel;
import model.Sala;
import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * TableModel pentru <code>Sala</code>
 *
 * @author Acristinei Razvan
 * @version 1.0,25 aprilie 2013
 */
public class SalaTableModel extends AbstractTableModel {
    private List<Sala> list;
    private String[] cols = {"ID", "Cod sala","Numar locuri"};

    public SalaTableModel(List<Sala> list){
        this.list = list;

    }
    @Override
    public String getColumnName(int column) {
        return cols[column];
    }
    @Override
    public int getRowCount(){
        return list.size();
    }
    @Override
    public int getColumnCount(){
        return cols.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sala sala = list.get(rowIndex);
        switch(columnIndex) {
            case 0: return sala.getId();
            case 1: return sala.getCodSala();
            case 2: return sala.getNrLocuri();
        }
        return null;
    }
    public List<Sala> getList() {
        return list;
    }
}