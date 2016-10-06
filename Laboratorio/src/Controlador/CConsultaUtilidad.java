/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Libreria.Rutinas;
import Vista.VConsultaUtilidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Joselyn
 */
public class CConsultaUtilidad implements ActionListener{
    private VConsultaUtilidad VUtil;
    
    public CConsultaUtilidad()
    {
        VUtil = new VConsultaUtilidad();
        VUtil.agregarListener(this);
        VUtil.setVisible(true);   
    }
    
    private void Cancelar()
    {
       
        VUtil.getjTextFieldBusq().setText("");
        VUtil.getjButtonBuscar().setEnabled(false);
        VUtil.getjRadioButton1().setSelected(false);
        VUtil.getjComboBoxBusqCand().setSelectedIndex(0);
    }
    
     public void actionPerformed(ActionEvent e) 
     {
          if (e.getSource().equals(VUtil.getjButtonCancelar()))  
      {
         Cancelar(); 
      }  
     }
}
