/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Libreria.Rutinas;
import Vista.VConsultaEntrevista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Joselyn
 */
public class CConsultarEntrevista implements ActionListener,KeyListener{
    private VConsultaEntrevista VEnt;
     public CConsultarEntrevista() 
    {
        VEnt = new VConsultaEntrevista();
        VEnt.agregarListener(this);
        VEnt.setVisible(true);
        
        VEnt.getjTextFieldBusq().addKeyListener(this);
    }
     
     private void Cancelar()
     {

         VEnt.getjTextFieldBusq().setText("");
                  VEnt.getjTextFieldBusq().setEnabled(false);
         VEnt.getjButtonBuscar().setEnabled(false);
         VEnt.getjComboBoxBusqEnt().setSelectedIndex(0);
         VEnt.getjRadioButtonFecha().setSelected(false);
         VEnt.getjDateChooserFecFinal().setCalendar(null);
         VEnt.getjDateChooserFecInicial().setCalendar(null);
         VEnt.getjDateChooserFecFinal().getDateEditor().setEnabled(false);
         VEnt.getjDateChooserFecInicial().getDateEditor().setEnabled(false);
         VEnt.getjDateChooserFecFinal().setEnabled(false);
         VEnt.getjDateChooserFecInicial().setEnabled(false);
         VEnt.getjButtonBuscar().setEnabled(false);
         VEnt.getjButtonCancelar().setEnabled(false);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource().equals(VEnt.getjButtonCancelar()))
        {
            Cancelar();
            return;
        }
        if(e.getSource().equals(VEnt.getjComboBoxBusqEnt()))
        {
            VEnt.getjTextFieldBusq().setEnabled(true);
            VEnt.getjButtonCancelar().setEnabled(true);
            return;
        }
        if(e.getSource().equals(VEnt.getjRadioButtonFecha()))
        {
            
            VEnt.getjDateChooserFecFinal().setEnabled(true);
            VEnt.getjDateChooserFecInicial().setEnabled(true);
            VEnt.getjDateChooserFecFinal().getDateEditor().setEnabled(false);
            VEnt.getjDateChooserFecInicial().getDateEditor().setEnabled(false);
            
        }
    }

    private void  NombreskeyTyped(KeyEvent e)
{
        if (VEnt.getjTextFieldBusq().getText().trim().length()==20)  
    {
         e.consume(); 
    }} 
    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getSource().equals(VEnt.getjTextFieldBusq()))
    {
        NombreskeyTyped(e);
        VEnt.getjButtonBuscar().setEnabled(true);
        VEnt.getjButtonCancelar().setEnabled(true);
        
    }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
