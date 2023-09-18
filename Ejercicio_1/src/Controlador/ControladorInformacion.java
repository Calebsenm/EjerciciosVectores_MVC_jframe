
package Controlador;

import Vista.VentanaInformacion;
import java.awt.BorderLayout;

public class ControladorInformacion {
       public static VentanaInformacion vninformacion = new VentanaInformacion();
    
    public static void mostrar()  {
        vninformacion.setSize(984, 462);
        vninformacion.setLocation(0, 0);
       
        Controlador.vn.PanelVista.removeAll();
        Controlador.vn.PanelVista.add(vninformacion, BorderLayout.CENTER);
        Controlador.vn.PanelVista.revalidate();
        Controlador.vn.PanelVista.repaint();
    }
    
    public static void ocultar() {
       Controlador.vn.PanelVista.removeAll();
       Controlador.vn.PanelVista.revalidate();
       Controlador.vn.PanelVista.repaint();
    }
}
