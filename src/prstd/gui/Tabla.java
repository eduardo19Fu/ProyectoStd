package prstd.gui;

import javax.swing.JTable;

public class Tabla extends JTable{
    
   // private final boolean [] tableColumns = {false, false, false};
   public Tabla(JTable tabla){
       
   }
   @Override
    public boolean isCellEditable(int row, int column){
       return false;
   }
    
}
