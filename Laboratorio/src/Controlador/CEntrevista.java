
package Controlador;

import Modelo.MEntrevista;
import Vista.VEntrevista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class CEntrevista implements ActionListener, KeyListener 
{
    VEntrevista VEnt;

    public CEntrevista() {
        VEnt = new VEntrevista();
        VEnt.agregarListener(this);
        VEnt.setVisible(true);
        
        VEnt.getjDateChooser2().addKeyListener(this);
        VEnt.getjTextFieldCodigoCan().addKeyListener(this);
        VEnt.getjTextFieldCodigoEntre().addKeyListener(this);
        VEnt.getjTextFieldCodigoProy().addKeyListener(this);
        VEnt.getjTextFieldCargoAspirado().addKeyListener(this);
    }
//===================================================
    private void Cancelar(){
        VEnt.getjTextFieldDescripcion().setText("");
        VEnt.getjButtonBuscarProy().setText("");
        
        VEnt.getjTextFieldCodigoCan().setText("");
        VEnt.getjTextFieldNombreCan().setText("");
        VEnt.getjTextFieldNombreCan().setEditable(false);
        VEnt.getjTextFieldApellidoCan().setText("");
        VEnt.getjTextFieldApellidoCan().setEditable(false);
        VEnt.getjTextFieldCargoAspirado().setText("");
        VEnt.getjTextFieldCargoAspirado().setEditable(false);
        
        VEnt.getjTextFieldCodigoEntre().setText("");
        VEnt.getjTextFieldNombreEntre().setText("");
        VEnt.getjTextFieldNombreEntre().setEditable(false);
        VEnt.getjTextFieldApellidoEntre().setText("");
        VEnt.getjTextFieldApellidoEntre().setEditable(false);
        
        VEnt.getjComboBoxCalificacion().setSelectedIndex(0);
        VEnt.getjComboBoxModalidad().setSelectedIndex(0);
        VEnt.getjComboBoxTipo().setSelectedIndex(0);
        VEnt.getjTextFieldSalarioOfertado().setEditable(false);
        VEnt.getjTextFieldSalarioPretendido().setEditable(false);
    }
//===================================================
    private void Registrar(){
        MEntrevista MEnt;
        
        
        
    }
//===================================================
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(VEnt.getjButtonCancelar())){
            Cancelar();
            return;
        }
        if(e.getSource().equals(VEnt.getjButtonRegistrar())){
            Registrar();
            return;
        }
    }
    
    private void NombreskeyTyped(KeyEvent e){
        if(VEnt.getjTextFieldCodigoProy().getText().trim().length()==10){
            e.consume();
            return;
        }
        if(VEnt.getjTextFieldCargoAspirado().getText().trim().length()==2){
            e.consume();
            return;
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        NombreskeyTyped(e);
        VEnt.getjButtonCancelar().setEnabled(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
