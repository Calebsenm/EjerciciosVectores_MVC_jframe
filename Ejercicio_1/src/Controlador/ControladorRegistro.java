package Controlador;
import java.awt.BorderLayout;

import Modelo.Empleado;
import Modelo.VectorEmpleados;
import Vista.VentanaRegistro;

public class ControladorRegistro {
    
    public static VentanaRegistro vnRegistro = new VentanaRegistro();
    
    public static void mostrar()  {
        vnRegistro.setSize(984, 462);
        vnRegistro.setLocation(0, 0);
        
        Controlador.vn.PanelVista.removeAll();
        Controlador.vn.PanelVista.add(vnRegistro, BorderLayout.CENTER);
        Controlador.vn.PanelVista.revalidate();
        Controlador.vn.PanelVista.repaint();
    }

    public static void ocultar() {
        Controlador.vn.PanelVista.removeAll();
        Controlador.vn.PanelVista.revalidate();
        Controlador.vn.PanelVista.repaint();
    }
    
    public static void Guardar(){
        int numeroVector = VectorEmpleados.getEmpleados().length;

        Empleado empleado = new Empleado(
                    Integer.parseInt( ControladorRegistro.vnRegistro.getID_Empleado().getText()),
                    ControladorRegistro.vnRegistro.getNomnbre().getText(),
                    ControladorRegistro.vnRegistro.getGenero().getText(),
                    0,
                    0,
                    0,
                    numeroVector,
                    0,
                    null);

            VectorEmpleados.registrarEmpleados(numeroVector , empleado);
        

        System.out.println(VectorEmpleados.getEmpleados()[2] );
    }
    
    public static void Cancelar(){
        ControladorRegistro.ocultar();
        ControladorUsuarios.mostrar();
    }

}

