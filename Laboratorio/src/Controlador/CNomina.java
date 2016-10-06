/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author franc_000
 */
import Libreria.Rutinas;
import Vista.VNomina;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

        
public class CNomina implements ActionListener
{
    
    private VNomina formNomina;

    public CNomina( ) 
    {
        formNomina = new VNomina();
        formNomina.agregarListener(this);
        formNomina.setVisible(true);
    }
    
    

    private void Cancelar()
{
  formNomina.getjComboBox1Empleado().setSelectedIndex(0); 
  formNomina.getjTextField2Horames().setText("");
  formNomina.getjTextField3Horast().setText("");
  formNomina.getjTextField5MontoPagar().setText(" ");
  formNomina.getjTextField5MontoPagar().setText(" ");
  formNomina.getjTextField4Salario().setText(" ");
  
  
}        
//--------------------------
private void Calcular()
{
 
   String Cadena1;
     Cadena1=(String) formNomina.getjComboBox1Empleado().getSelectedItem();
      if(Cadena1.equalsIgnoreCase("Seleccione"))
     {
         Rutinas.Aviso("Seleccione Empleado ", "");
         formNomina.getjComboBox1Empleado().requestFocusInWindow();
         return;      
         
     }
  
  
  if (formNomina.getjTextField3Horast().getText().trim().length()==0)    
   {
      Rutinas.Aviso("Debe ingresar las horas trabajadas", "");
      formNomina.getjTextField3Horast().requestFocusInWindow();
      return;      
   }  
  
  
}   
 
    private void Registrar ()
    {
        if (formNomina.getjTextField5MontoPagar().getText().trim().length()==0)    
   {
      Rutinas.Aviso("Monto a Pagar no puede estar vacio", "");
      formNomina.getjTextField5MontoPagar().requestFocusInWindow();
      return;      
   }  
    }
    
    
    //--------------------
    @Override
    public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource().equals(formNomina.getjButton1Calcular()))  
      {
        Calcular();   
      }  
      //---------
      if (e.getSource().equals(formNomina.getjButton3Cancelar()))  
      {
         Cancelar(); 
      }  
      //----------
     if (e.getSource().equals(formNomina.getjButton2Registrar()))  
      {
          Registrar ();
      }  
     //--
     if (e.getSource().equals(formNomina.getjButton5Salir()))  
      {
        formNomina.dispose();  
      }  
      
    }
   
    
}
