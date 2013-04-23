package controller.tablemodel;

import model.*;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * TableModel pentru <code>ResursaUmana</code>
 *
 * @author Florin Mihalache
 * @version 1.0, 23 aprilie 2013
 */
public class ResursaUmanaTableModel extends AbstractTableModel {
    private List<ResursaUmana> list;
    private String[] cols = {"Nume", "Prenume", "Telefon", "E-mail", "Domenii de interes", "Tip"};

    public ResursaUmanaTableModel(List<ResursaUmana> list) {
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
        ResursaUmana resursaUmana = list.get(rowIndex);
        switch (columnIndex) {
            case 0: return resursaUmana.getNume();
            case 1: return resursaUmana.getPrenume();
            case 2: return resursaUmana.getNumarTelefon();
            case 3: return resursaUmana.getEmail();
            case 4: return resursaUmana.getDomeniiInteres();
            case 5:
                if (resursaUmana instanceof CadruDidactic)
                    return "Cadru didactic";
                if (resursaUmana instanceof Cercetator)
                    return "Cercetator";
                if (resursaUmana instanceof Doctorand)
                    return "Doctorand";
                if (resursaUmana instanceof PersonalAdministrativ)
                    return "Personal administrativ";
        }
        return null;
    }
}
