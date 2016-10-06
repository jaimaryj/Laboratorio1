/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoFeriado;
import Vista.VFeriado;
import Libreria.Rutinas;
import Modelo.MFeriado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CFeriado implements ActionListener,KeyListener
{
    private VFeriado formFeriado;
    private char Operacion; 
    
    public CFeriado(){
        
        formFeriado = new VFeriado();
        formFeriado.agregarActionListener(this);
        formFeriado.setVisible(true);
        
        
        
        formFeriado.getJDateChooserFeriado().getDateEditor().getUiComponent().addKeyListener(new java.awt.event.KeyListener() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent e)
          {               
            DateChooserFeriadoKeyTyped(e);
       
          }
           //---------------------------
       
            @Override
            public void keyPressed(KeyEvent e) 
            {           
                
            }
            //------------------
            @Override
            public void keyReleased(KeyEvent e) 
            {
               
            }
        });        
    }
   
    
  //--------------------------
private void DateChooserFeriadoKeyTyped(KeyEvent e)
{
  char tecla;
  tecla=e.getKeyChar();
  
  if (tecla=='/')
   return;   
  
  if (tecla<'0' || tecla>'9')
   e.consume();
}
//------------------------------    
    private void registrar(){
        DaoFeriado daoferiado=new DaoFeriado();
        MFeriado mf;
        String fecha;
          
     if(formFeriado.getJDateChooserFeriado().getDate()==null){
          Rutinas.Aviso("Seleccione una fecha", "");
          formFeriado.getJDateChooserFeriado().requestFocus();
          return;
     }
     
      else if(formFeriado.getjTextFieldDescripcion().getText().trim().length()==0){
                Rutinas.Aviso("Ingrese una descripción", "");
                formFeriado.getjTextFieldDescripcion().requestFocusInWindow();
                return;
       }
      else{
    
        mf= new MFeriado(formFeriado.getJDateChooserFeriado().getDate(),
                       formFeriado.getjTextFieldDescripcion().getText().trim());
        
        daoferiado.insertFeriado(mf);
        Rutinas.Aviso("La fecha fue registrada como feriada de manera exitosa", "");
        limpiarCampos();
      }
      
    
    }
  //------------------------- 
    private void modificar(){
        DaoFeriado daoferiado=new DaoFeriado();
        MFeriado mf;
      if(formFeriado.getJDateChooserFeriado().getDate()==null){
          Rutinas.Aviso("Seleccione una fecha", "");
          formFeriado.getJDateChooserFeriado().requestFocus();
          return;  
      }
     
      else if(formFeriado.getjTextFieldDescripcion().getText().trim().length()==0){
                Rutinas.Aviso("Ingrese una descripción", "");
                formFeriado.getjTextFieldDescripcion().requestFocusInWindow();
                return;
        }
      else
      {
            mf= new MFeriado(formFeriado.getJDateChooserFeriado().getDate(),
                       formFeriado.getjTextFieldDescripcion().getText().trim());
        
            
           switch (Operacion)
           {
               case 'I':daoferiado.insertFeriado(mf);
                        break;
               case 'M':    
                       daoferiado.modificarFeriado(mf);
                        Rutinas.Aviso("La fecha fue modificada como feriada de manera exitosa", ""); 
           }
           
        limpiarCampos();
          
      }
    }
  //-------------------------
    private void eliminar(){
        
    
          if(formFeriado.getJDateChooserFeriado().getDate()==null){
          Rutinas.Aviso("Seleccione una fecha", "");
          formFeriado.getJDateChooserFeriado().requestFocus();
          return;
          }
     
             
    
    }
  //-------------------------
    private void limpiarCampos(){
        formFeriado.getjTextFieldDescripcion().setText("");
        formFeriado.getJDateChooserFeriado().setDate(null);         
        Operacion=' ';
    }
   //--------------------------
    private void cancelar(){
        limpiarCampos();
    }
  //----------------------------

    private void descripcionKeyTyped(KeyEvent e){
        if(formFeriado.getjTextFieldDescripcion().getText().trim().length()==50)
        {
            e.consume();
        }
    }
//------------------------- 
    @Override
    public void keyTyped(KeyEvent ke) {
       if (ke.getSource().equals(formFeriado.getjTextFieldDescripcion())) 
       {
         descripcionKeyTyped(ke);  
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
    //---------------------------------
private void BuscarFecha() throws SQLException
{
  DaoFeriado daoFeriado=new DaoFeriado(); 
  ResultSet regisFecha;
  
  regisFecha=daoFeriado.buscarFeriado(formFeriado.getJDateChooserFeriado().getDate());
  if (regisFecha.next())
    {
      Operacion='M';  
      formFeriado.getjTextFieldDescripcion().setText(regisFecha.getString("descripcion"));  
    }  
  else
     Operacion='I'; 
      
}        
//--------------------  
    
  
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        
         if (ae.getSource().equals(formFeriado.getjButtonRegistar())){
            registrar();   
         }
         
         if(ae.getSource().equals(formFeriado.getjButtonCancelar())){ 
             cancelar();
         }
         
         if(ae.getSource().equals(formFeriado.getjButtonModificar())){
             modificar();
         }
         
         if(ae.getSource().equals(formFeriado.getjButtonEliminar())){
             eliminar();
         }
         if(ae.getSource().equals(formFeriado.getjButtonSalir())){
             formFeriado.dispose();
         }
         
         
         if(ae.getSource().equals(formFeriado.getjButtonBuscar())){
            try {
                BuscarFecha();
            } catch (SQLException ex) {
                Logger.getLogger(CFeriado.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
             
         
        
    }

   
            
}
    
