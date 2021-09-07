/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stable_matching_grupo02_esd115;

/**
 *
 * @author PRN-315
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableEstudiantes extends AbstractTableModel{
    List<ESTUDIANTE> estudiantes = new ArrayList<ESTUDIANTE>();
    @Override
    public int getRowCount() {
        return estudiantes.size();
    }
    @Override
    public int getColumnCount() {
        return 9;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ESTUDIANTE estd = estudiantes.get(rowIndex);
        Object valor = null;
        switch(columnIndex){
            case 0: valor = estd.getNombre() ;
            break;
            case 1: valor = estd.getCarnet();
            break;
            case 2: valor = estd.getCarrera();
            break;
            case 3: valor = estd.getExperiencia();
            break;
            case 4: valor = estd.getPreferencias();
            break;
            case 5: valor = estd.getTelefono();
            break;
            case 6: valor = estd.getDireccion();
            break;
            case 7: valor = estd.getEdad();
             break;
            case 8: valor = estd.getCum();
            break;
        }
        return valor;
    }

       void addRow(String[] datos) {
           throw new UnsupportedOperationException("No soportado"); //To change body of generated methods, choose Tools | Templates.
       }
}