package Controlador;

import Modelo.Empleado;
import Modelo.VectorEmpleados;
import Vista.VentanaPrincipal;
import Vista.VentanaRegistro;
import Vista.VistaUsuarios;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Controlador implements ActionListener {

    private VentanaPrincipal wiew;
    private VectorEmpleados empleados;
    private Empleado []listasEmpleados;
    private VistaUsuarios vistaUsuarios = new VistaUsuarios();
    private VentanaRegistro ventanaRegistro = new VentanaRegistro();
    private int TamañoVector;
    private int contador;

    public Controlador(VentanaPrincipal wiew, VectorEmpleados empleados) {
        this.wiew = wiew;
        this.empleados = empleados;

        this.wiew.Salir_Bn.addActionListener(this);
        this.wiew.Registro_Bn.addActionListener(this);

        this.ventanaRegistro.CerrarBn_2.addActionListener(this);
        this.ventanaRegistro.GuardarBn_2.addActionListener(this);
    }

    public void Iniciar() {
        wiew.setLocationRelativeTo(null);
        CambiarPaneel(vistaUsuarios);
    }

    public void CambiarPaneel(JPanel vista) {
        vista.setSize(984, 462);
        vista.setLocation(0, 0);
        wiew.PanelVista.removeAll();
        wiew.PanelVista.add(vista, BorderLayout.CENTER);
        wiew.PanelVista.revalidate();
        wiew.PanelVista.repaint();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(wiew.Salir_Bn)) {
            System.exit(0);

        } else if (e.getSource().equals(wiew.Registro_Bn)) {
            TamañoVector = Integer.parseInt(JOptionPane.showInputDialog("Ingresa El Tamaño Del vector"));
            CambiarPaneel(ventanaRegistro);
        }
        if (e.getSource().equals(ventanaRegistro.CerrarBn_2)) {
            CambiarPaneel(vistaUsuarios);

        }
        if (e.getSource().equals(ventanaRegistro.GuardarBn_2)) {
            if (contador < TamañoVector) {
              
                listasEmpleados[contador] = new Empleado(
                   Integer.parseInt(ventanaRegistro.ID_Empleado.getText()),
                   ventanaRegistro.Nomnbre.getText(), 
                   ventanaRegistro.Genero.getText(),
                  0,
                   0,
                   Integer.parseInt( ventanaRegistro.Estrato.getText()),
                   Integer.parseInt( ventanaRegistro.HorasLaboradas.getText()),
                   Integer.parseInt( ventanaRegistro.HorasExtrasLaboradas.getText()),
                   LocalDate.parse(ventanaRegistro.FechaVinculacion.getText())
                    );
                
                contador++;
                if (contador == TamañoVector) {
                    JOptionPane.showMessageDialog(null, "Vector LLeno!");
      
                   empleados.setEmpleados(listasEmpleados);
                           
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vector LLeno!");
            }
            
            System.err.println(empleados);

        }

    }

}
