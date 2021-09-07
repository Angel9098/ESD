
package stable_matching_grupo02_esd115;

/**
 *
 * 
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableEmpresas extends AbstractTableModel{
    List<EMPRESA> empresas = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return empresas.size();
    }
    
    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {   
        EMPRESA emp = empresas.get(rowIndex);
        Object valor = null;
        switch(columnIndex){
            case 0: valor = emp.getNombre() ;
            break;
            case 1: valor = emp.getProfesionRequerida();
            break;
            case 2: valor = emp.getPlazaDisponible();
            break;
            case 3: valor = emp.getExperienciaRequerida();
            break;
            case 4: valor = emp.getPreferencias();
            break;
            case 5: valor = emp.getTelefono();
            break;
            case 6: valor = emp.getDireccion();
            break;
        }
        return valor;
     }

    void addRow(String[] datos) {
        throw new UnsupportedOperationException("No soportado.");
    }

}