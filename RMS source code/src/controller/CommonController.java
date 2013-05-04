package controller;

import controller.tablemodel.EchipamentTableModel;
import controller.tablemodel.ResursaUmanaTableModel;
import controller.tablemodel.SalaTableModel;
import model.Echipament;
import model.ResursaUmana;
import model.Sala;
import persistence.cadrudidacticpersistence.CadruDidacticPersistence;
import persistence.echipamentpersistence.EchipamentPersistence;
import persistence.salapersistence.SalaPersistence;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandru
 * Acest controller va contine toate metodele comune ca sa nu apara aceeleasi metode 
 * de mai multe ori in controllere diferite, iar celelalte controllere il vor mosteni pe acesta
 * eventual este posibil ca Guest-ul sa foloseasca acest controller daca metodele ii sunt suficiente --(mai vedem  iteratia IV)
 */
public class CommonController {
    private CadruDidacticPersistence cadruDidacticPersistence;
    private EchipamentPersistence echipamentPersistence;
    private SalaPersistence salaPersistence;

    private ResursaUmanaTableModel resursaUmanaTableModel;
    private EchipamentTableModel echipamentTableModel;
    private SalaTableModel salaTableModel;

    public CommonController() {
        cadruDidacticPersistence = CadruDidacticPersistence.instance();
        echipamentPersistence = EchipamentPersistence.instance();
        salaPersistence = SalaPersistence.instance();

        resursaUmanaTableModel = new ResursaUmanaTableModel(getAllResursaUmana());
        echipamentTableModel = new EchipamentTableModel(getAllEchipament());
        salaTableModel = new SalaTableModel(getAllSala());
    }

    /**
     * Formeaza o lista cu toate obiectele de tip <code>ResursaUmana</code>, apeland pe rand
     * metodele din persistenta corespunzatoare fiecarei clase care mosteneste <code>ResursaUmana</code>
     *
     * @return lista cu obiectele de tip ResursaUmana
     */
    public List<ResursaUmana> getAllResursaUmana() {
        List<ResursaUmana> list = new ArrayList<ResursaUmana>();

        list.addAll(cadruDidacticPersistence.getAllCadruDidactic());
        //TODO: trebuie actualizata pe masura ce vor fi create metodele necesare din persistence
        return list;
    }

    /**
     * Returneaza <code>ResursaUmanaTableModel</code>
     * @return
     */
    public ResursaUmanaTableModel getResursaUmanaTableModel() {
        return resursaUmanaTableModel;
    }

    /**
     * Reface modelul pentru <code>ResursaUmanaTableModel</code> cu datele din BD
     */
    public void updateResursaUmanaTableModel() {
        List<ResursaUmana> list = resursaUmanaTableModel.getList();
        list.clear();
        list.addAll(getAllResursaUmana());
        resursaUmanaTableModel.fireTableDataChanged();
    }

    /**
     * Formeaza o lista cu toate obiectele de tip <code>Echipament</code>.
     *
     * @return lista cu obiectele de tip Echipament
     */
    public List<Echipament> getAllEchipament() {
        return echipamentPersistence.getAllEchipament();
    }

    /**
     * Returneaza <code>EchipamentTableModel</code>
     * @return
     */
    public EchipamentTableModel getEchipamentTableModel() {
        return echipamentTableModel;
    }

    /**
     * Reface modelul pentru <code>EchipamentTableModel</code> cu datele din BD
     */
    public void updateEchipamentTableModel() {
        List<Echipament> list = echipamentTableModel.getList();
        list.clear();
        list.addAll(getAllEchipament());
        echipamentTableModel.fireTableDataChanged();
    }

    /**
     * Formeaza o lista cu toate obiectele de tip <code>Sala</code>.
     *
     * @return lista cu obiectele de tip Echipament
     */
    public List<Sala> getAllSala() {
        return salaPersistence.getAllSala();
    }

    /**
     * Returneaza <code>SalaTableModel</code>
     * @return
     */
    public SalaTableModel getSalaTableModel() {
        return salaTableModel;
    }

    /**
     * Reface modelul pentru <code>SalaTableModel</code> cu datele din BD
     */
    public void updateSalaTableModel() {
        List<Sala> list = salaTableModel.getList();
        list.clear();
        list.addAll(getAllSala());
        salaTableModel.fireTableDataChanged();
    }
}
