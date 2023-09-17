
package Main;

import Controlador.Controlador;
import Modelo.VectorEmpleados;
import Vista.VentanaPrincipal;
import Vista.VentanaRegistro;


public class Main {
    public static void main( String[] args){
     
        VectorEmpleados empleados = new VectorEmpleados();
        VentanaPrincipal principal =  new VentanaPrincipal();
        Controlador control = new Controlador(principal, empleados);
        control.Iniciar();        
        principal.setVisible(true);
    }
}

