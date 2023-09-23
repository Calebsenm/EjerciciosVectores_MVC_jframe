package Controlador;

import java.awt.BorderLayout;
import Modelo.Empleado;
import Modelo.VectorEmpleados;
import Vista.VentanaRegistro;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class ControladorRegistro {

    public static VentanaRegistro vnRegistro = new VentanaRegistro();

    public static void mostrar() {
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

    public static boolean errorGuardado = false;
    public static void Guardar(int index) {

        try {
            String stringFecha = ControladorRegistro.vnRegistro.getFechaVinculacion().getText();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fechaConvertida = LocalDate.parse(stringFecha, formato);
    
            int estrato = Integer.parseInt(ControladorRegistro.vnRegistro.getEstrato().getText());
            int horasExtrasLaboradas = Integer.parseInt(ControladorRegistro.vnRegistro.getHorasExtrasLaboradas().getText());
            int horasLaboradas = Integer.parseInt(ControladorRegistro.vnRegistro.getHorasLaboradas().getText());
            

            Empleado empleado = new Empleado(
                    Integer.parseInt(ControladorRegistro.vnRegistro.getID_Empleado().getText()),
                    ControladorRegistro.vnRegistro.getNomnbre().getText(),
                    ControladorRegistro.vnRegistro.getGenero().getText(),
                    Double.parseDouble(ControladorRegistro.vnRegistro.getSalarioBasico().getText()),
                    0.0,
                    estrato,
                    horasLaboradas,
                    horasExtrasLaboradas,
                    fechaConvertida
                    );

            VectorEmpleados.registrarEmpleados(index, empleado);
            VectorEmpleados.calularsueldoNeto();

        } catch (Exception e) {
            errorGuardado = true;
            JOptionPane.showMessageDialog(null, "Tienes un Eror de tipo " + e );
            
        }

    }

    public static void Cancelar() {
        ControladorRegistro.ocultar();
        ControladorUsuarios.mostrar();
    }

}
