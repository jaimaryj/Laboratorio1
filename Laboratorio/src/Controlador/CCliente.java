
package Controlador;

import Libreria.Rutinas;
import Modelo.MCliente;
import Vista.VCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Valmore Canelon
 */
public class CCliente implements ActionListener,KeyListener {
    private VCliente formCliente;
    
        public CCliente(){
            formCliente = new VCliente();
            formCliente.agregarListener(this);
            formCliente.setVisible(true);
            
            formCliente.getjTextFieldCodigo().addKeyListener(this);
            formCliente.getjTextFieldRazonSocial().addKeyListener(this);
            formCliente.getjTextFieldEstado_Provincia().addKeyListener(this);
            formCliente.getjTextFieldTelefono().addKeyListener(this);
            formCliente.getjTextFieldCorreo().addKeyListener(this);
        }
    
        
       
      
        
    private void Cancelar(){
        formCliente.getjTextFieldCodigo().setText("");
        formCliente.getjTextFieldRazonSocial().setText("");
        formCliente.getjTextFieldEstado_Provincia().setText("");
        formCliente.getjTextFieldTelefono().setText("");
        formCliente.getjTextFieldCorreo().setText("");
    }
    
    private void Guardar(){
        
        if (formCliente.getjTextFieldCodigo().getText().trim().length()==0)
        {
            Rutinas.Aviso("Codigo de Cliente vacio", "");
            formCliente.getjTextFieldCodigo().requestFocusInWindow();
            return;
        }
        
        if (formCliente.getjTextFieldRazonSocial().getText().trim().length()==0)
        {
            Rutinas.Aviso("Razon social de Cliente vacio", "");
            formCliente.getjTextFieldRazonSocial().requestFocusInWindow();
            return;
        }
        
        if (formCliente.getjTextFieldEstado_Provincia().getText().trim().length()==0)
        {
            Rutinas.Aviso("Estado/Provincia de Cliente vacio", "");
            formCliente.getjTextFieldEstado_Provincia().requestFocusInWindow();
            return;
        }
        
        if (formCliente.getjTextFieldTelefono().getText().trim().length()==0)
        {
            Rutinas.Aviso("Telefono de Cliente vacio", "");
            formCliente.getjTextFieldTelefono().requestFocusInWindow();
            return;
        }
        
        if (formCliente.getjTextFieldCorreo().getText().trim().length()==0)
        {
            Rutinas.Aviso("Correo de Cliente vacio", "");
            formCliente.getjTextFieldCorreo().requestFocusInWindow();
            return;
        }
        
        
         
         //mClie = new MCliente(formCliente.getjTextFieldCodigo().getText().trim(),
         //                    formCliente.getjTextFieldRazonSocial().getText().trim(),
          //                   formCliente.getjTextFieldEstado_Provincia().getText().trim(),
           //                  formCliente.getjTextFieldTelefono().getText().trim(),
           //                  formCliente.getjTextFieldCorreo().getText().trim())
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource().equals(formCliente.getjButtonRegistrar()))  
      {
        Guardar();   
      } 
       
       if (ae.getSource().equals(formCliente.getjButtonCancelar()))  
      {
         Cancelar(); 
      }
      
       
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        if (ke.getSource().equals(formCliente.getjTextFieldCodigo()))
        {
            CodigoKeyTyped(ke);
        }
        
        if (ke.getSource().equals(formCliente.getjTextFieldRazonSocial()))
        {
            RazonSocialKeyTyped (ke);
        }
        
        if (ke.getSource().equals(formCliente.getjTextFieldEstado_Provincia()))
        {
            Estado_ProvinciaKeyTyped (ke);
        }
        
        
    }
    
    public void CodigoKeyTyped(KeyEvent ke)
    {
        if (formCliente.getjTextFieldCodigo().getText().trim().length()==15)
        {
            ke.consume();
        }
    }
    
    public void RazonSocialKeyTyped(KeyEvent ke)
    {
        if (formCliente.getjTextFieldRazonSocial().getText().trim().length()==30)
        {
            ke.consume();
        }
    }
    
    public void Estado_ProvinciaKeyTyped(KeyEvent ke)
    {
        if (formCliente.getjTextFieldEstado_Provincia().getText().trim().length()==20)
        {
            ke.consume();
        }
    }
    
    

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
