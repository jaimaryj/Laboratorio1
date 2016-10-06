/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VAsignarCand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Joselyn
 */
public class CAsignarCand implements ActionListener, MouseListener{

    VAsignarCand VAsig;

    public CAsignarCand() {
        VAsig = new VAsignarCand();
        VAsig.agregarListener(this);
        VAsig.agListener(this);
        VAsig.setVisible(true);
    }
    
    private void Cancelar()
    {
        VAsig.getjButtonBuscar().setEnabled(false);
        VAsig.getjButtoncancelar().setEnabled(false);
        VAsig.getjTextFieldBusqProy().setText("");
        VAsig.getjTextFieldDesc().setText("");
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
