
package Main;

import Controlador.Controlador;
import Modelo.VectorEmpleados;
import Vista.VentanaPrincipal;

public class Main {
    public static void main( String[] args){
     
        VectorEmpleados vt = new VectorEmpleados();
        VentanaPrincipal nv =  new VentanaPrincipal();
        
        Controlador control = new Controlador(nv, vt);
        control.Iniciar();
        
        nv.setVisible(true);
    }
}

