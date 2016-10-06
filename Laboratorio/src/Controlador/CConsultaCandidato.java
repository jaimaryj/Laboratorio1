/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VConsultaCandidato;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 *
 * @author Joselyn
 */
public class CConsultaCandidato implements ActionListener, KeyListener{
    
    private VConsultaCandidato VCand;

    public CConsultaCandidato() {
        VCand = new VConsultaCandidato();
        VCand.agregarListener(this);
        VCand.setVisible(true);
       
        
        VCand.getjTextFieldBusq().addKeyListener(this);
                
    }
    

    private void cancelar()
    {
        VCand.getjTextFieldBusq().setText("");
        VCand.getjComboBoxBusqCand().setSelectedIndex(0);
        VCand.getjButtonBuscar().setEnabled(false);
        VCand.getjButtonCancelar().setEnabled(false);
        VCand.getjTextFieldBusq().setEnabled(false);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(VCand.getjButtonCancelar()))
        {
            cancelar();
            return;
        }
        if(e.getSource().equals(VCand.getjComboBoxBusqCand()))
        {
            VCand.getjTextFieldBusq().setEnabled(true);
            VCand.getjButtonCancelar().setEnabled(true);
            return;
        }
    }
private void  NombreskeyTyped(KeyEvent e)
{
  if (VCand.getjTextFieldBusq().getText().trim().length()==20)  
   {
     e.consume(); 
   }  
}     

public void keyTyped(KeyEvent e) 
{
    if(e.getSource().equals(VCand.getjTextFieldBusq()))
    {
        NombreskeyTyped(e);
        VCand.getjButtonBuscar().setEnabled(true);
        
    }
}

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }
}

