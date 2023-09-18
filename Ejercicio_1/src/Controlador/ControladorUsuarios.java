
package Controlador;

import java.awt.BorderLayout;
import Vista.VistaUsuarios;

public class ControladorUsuarios {

    public static VistaUsuarios vnUsuario = new VistaUsuarios();
    
    public static void mostrar()  {
        vnUsuario.setSize(984, 462);
        vnUsuario.setLocation(0, 0);
       
        Controlador.vn.PanelVista.removeAll();
        Controlador.vn.PanelVista.add(vnUsuario, BorderLayout.CENTER);
        Controlador.vn.PanelVista.revalidate();
        Controlador.vn.PanelVista.repaint();
    }
    
    public static void ocultar() {
       Controlador.vn.PanelVista.removeAll();
       Controlador.vn.PanelVista.revalidate();
       Controlador.vn.PanelVista.repaint();
    }

}
