package Controlador;
import java.awt.BorderLayout;
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

    }
    
    public static void Cancelar(){
        ControladorRegistro.ocultar();
        ControladorUsuarios.mostrar();
    }

}

