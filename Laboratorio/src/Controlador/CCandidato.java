/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Libreria.Rutinas;
import Vista.VCandidato;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
/**
 *
 * @author franc_000
 */
public class CCandidato implements ActionListener, KeyListener
{
    private VCandidato formCandidato;    

    public CCandidato() 
    {
        formCandidato = new VCandidato();
        formCandidato.agregarListener(this);
        formCandidato.setVisible(true);
        formCandidato.getjTextField1Nombre().addKeyListener(this);
        formCandidato.getjTextField2Apellido().addKeyListener(this);
        formCandidato.getjTextField3Identificacion().addKeyListener(this);
        formCandidato.getjTextField4Telefono().addKeyListener(this);
        formCandidato.getjTextField5Correo().addKeyListener(this);
        formCandidato.getjTextField6estadoprovincia().addKeyListener(this);
        formCandidato.getjLocaleChooser1Nacionalidad().addKeyListener(this);
        
    }
//-------------------------
private void Cancelar()
{
  formCandidato.getjTextField1Nombre().setText("");
  formCandidato.getjTextField2Apellido().setText("");
  formCandidato.getjTextField3Identificacion().setText("");
  formCandidato.getjTextField4Telefono().setText("");
  formCandidato.getjTextField5Correo().setText("");
  formCandidato.getjTextArea1cualidades().setText("");
  formCandidato.getjLocaleChooser1Nacionalidad().setSelectedIndex(0);
}        
//--------------------------
private void Registrar()
{
  if (formCandidato.getjTextField1Nombre().getText().trim().length()==0)    
   {
      Rutinas.Aviso("Nombre de Candidato Vacio", "");
      formCandidato.getjTextField1Nombre().requestFocusInWindow();
      return;      
   }  
  
  if (formCandidato.getjTextField2Apellido().getText().trim().length()==0)    
   {
      Rutinas.Aviso("Apellido de Candidato Vacio", "");
      formCandidato.getjTextField2Apellido().requestFocusInWindow();
      return;      
   }  
  
}   

    //--------------------
    @Override
    public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource().equals(formCandidato.getRegistrar()))  
      {
        Registrar();   
      }  
      //---------
      if (e.getSource().equals(formCandidato.getCancelar()))  
      {
         Cancelar(); 
      }  
      //----------
     
     //--
     if (e.getSource().equals(formCandidato.getSalir()))  
      {
        formCandidato.dispose();  
      } 
    }

    public void NombreKeyTyped (KeyEvent e)
    {
        if (formCandidato.getjTextField1Nombre().getText().trim().length()==20)  
          {
              e.consume(); 
          }  
    }
     
    public void ApellidoKeyTyped (KeyEvent e)
    {
        if (formCandidato.getjTextField2Apellido().getText().trim().length()==20)
        {
            e.consume();
        }
    }
    public void TelefonoKeyTyped (KeyEvent e)
    {
        char tecla;
            
    }
    @Override
    public void keyTyped(KeyEvent e) 
    {
         
        
        if (e.getSource().equals(formCandidato.getjTextField2Apellido()))
        {
            ApellidoKeyTyped (e);
        }
        if (e.getSource().equals(formCandidato.getjTextField4Telefono()))
        {
            TelefonoKeyTyped (e);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        
    }

}

