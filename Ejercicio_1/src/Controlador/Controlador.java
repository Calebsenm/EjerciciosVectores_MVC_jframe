
package Controlador;

import Modelo.VectorEmpleados;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    
    private VentanaPrincipal wiew;
    private VectorEmpleados empleados;

    public Controlador(VentanaPrincipal wiew, VectorEmpleados empleados) {
        this.wiew = wiew;
        this.empleados = empleados;
        this.wiew.Salir_Bn.addActionListener(this);
    }
    
   
    public void Iniciar(){
        wiew.setLocationRelativeTo(null);    
    }
    
    public void actionPerformed(ActionEvent e ){
        if(e.getSource().equals( wiew.Salir_Bn)){
            System.exit(0);
        }else if (e.getSource().equals( wiew.Registro_Bn)){
            
        } 
        
    }
    
}
