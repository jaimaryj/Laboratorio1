
package Controlador;

import Libreria.Rutinas;
import Modelo.MProyecto;
import Vistas.VProyecto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CProyecto implements ActionListener, KeyListener
{
    VProyecto VPro;
    
    public CProyecto() 
    {
        VPro = new VProyecto();
        VPro.agregarLitener(this);
        VPro.setVisible(true);
        
        VPro.getjTextFieldDescripcion().addKeyListener(this);
        VPro.getjTextFieldBuscarProyecto().addKeyListener(this);

        VPro.getjTextFieldBuscarCliente().addKeyListener(this);
        VPro.getjTextFieldRazonSoc().addKeyListener(this);
        
        VPro.getjDateChooserFechaInicio().addKeyListener(this);
        VPro.getjDateChooserFechaFin().addKeyListener(this);
    }   
//============================================ 
    private void Registrar()
    {
        MProyecto MPro;
        
        if(VPro.getjTextFieldBuscarProyecto().getText().trim().length()==0)
        {
            Rutinas.Aviso("Identificador vacío", "");
            VPro.getjTextFieldBuscarProyecto().requestFocusInWindow();
        }
    }
//============================================    
    private void Cancelar()
    {
        VPro.getjTextFieldBuscarProyecto().setText("");
        VPro.getjTextFieldDescripcion().setText("");
        VPro.getjTextFieldDescripcion().setEditable(false);
        
        VPro.getjTextFieldBuscarCliente().setText("");
        VPro.getjTextFieldRazonSoc().setText("");
        VPro.getjTextFieldRazonSoc().setEditable(false);
    }
//============================================
    
//============================================
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource().equals(VPro.getjTextFieldBuscarProyecto()))
        {
            Registrar();
            return;
        }
        if(e.getSource().equals(VPro.getjButtonCancelar()))
        {
            Cancelar();
            return;
        }
    }
//============================================    
    private void BuscarProyectokeyTyped(KeyEvent e)
    {
       if(VPro.getjTextFieldBuscarProyecto().getText().trim().length()==10)
        {
            e.consume();
            return;
        }
    }
    private void DescripcionkeyTyped(KeyEvent e)
    {
       if(VPro.getjTextFieldDescripcion().getText().trim().length()==40)
        {
            e.consume();
            return;
        }
    } 
    
    private void BuscarClientekeyTyped(KeyEvent e)
    {    
        if(VPro.getjTextFieldBuscarCliente().getText().trim().length()==10)
        {
            e.consume();
            return;
        }
    }
    private void RazonSocialkeyTyped(KeyEvent e)
    {
        if(VPro.getjTextFieldRazonSoc().getText().trim().length()==30)
        {
            e.consume();
            return;
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) 
    {
        if(e.getSource().equals(VPro.getjTextFieldBuscarProyecto()))
        {
            BuscarProyectokeyTyped(e);    
        }
        if(e.getSource().equals(VPro.getjTextFieldDescripcion()))
        {
           DescripcionkeyTyped(e);
        }
        
        if(e.getSource().equals(VPro.getjTextFieldBuscarCliente()))
        {
            BuscarClientekeyTyped(e);
        }
        if(e.getSource().equals(VPro.getjTextFieldRazonSoc()))
        {
            RazonSocialkeyTyped(e);
        }
        
        VPro.getjButtonCancelar().setEnabled(true);
    }
//============================================
    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
