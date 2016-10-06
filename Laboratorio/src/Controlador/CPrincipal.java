/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VMenuPrin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class CPrincipal implements ActionListener {
    private VMenuPrin formMenuPrin;
    
    public CPrincipal()
    {
        formMenuPrin= new VMenuPrin();
        formMenuPrin.agregarListener(this);
        formMenuPrin.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource().equals(formMenuPrin.getjMenuItemferiado())) {
            new CFeriado();
            
        }
        
        if (ae.getSource().equals(formMenuPrin.getjMenuItemconsrecord())) {
            new CConsRecordPago();
            
        }
        if(ae.getSource().equals(formMenuPrin.getjMenuItemconscandidatos()))
        {
            new CConsultaCandidato();
        }
        if(ae.getSource().equals(formMenuPrin.getjMenuItemconsentrevistas()))
        {
            new CConsultarEntrevista();
        }
        
        if(ae.getSource().equals(formMenuPrin.getjMenuItemconsutilidad()))
        {
            new CConsultaUtilidad();
        }
        
        if(ae.getSource().equals(formMenuPrin.getjMenuItemAsigCand()))
        {
            new CAsignarCand();
        }
        
        if (ae.getSource().equals(formMenuPrin.getjMenuItemgestcandidato()))
        {
            new CCandidato ();
        }
         
        if (ae.getSource().equals(formMenuPrin.getjMenuItemregnomina()))
        {
            new CNomina ();
        }
        
        if (ae.getSource().equals(formMenuPrin.getjMenuItemgestclientes()))
        {
            new CCliente();
        }
        
        if (ae.getSource().equals(formMenuPrin.getjMenuItemconsfaltas()))
        {
            new CConsultaFaltas();
        }
        
        if(ae.getSource().equals(formMenuPrin.getjMenuItemgestentrevistas()))
        {
            new CEntrevista();
        }
        if(ae.getSource().equals(formMenuPrin.getjMenuItemgestproyectos()))
        {
            new CProyecto();
        }
        
        
    }
    
    
    
}
