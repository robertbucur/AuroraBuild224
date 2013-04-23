package controller;

import model.ResursaUmana;
import persistence.cadrudidacticpersistence.CadruDidacticPersistence;

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

    public CommonController() {
        cadruDidacticPersistence = CadruDidacticPersistence.instance();
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
}
