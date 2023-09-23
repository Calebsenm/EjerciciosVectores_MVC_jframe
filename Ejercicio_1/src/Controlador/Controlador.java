package Controlador;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Modelo.VectorEmpleados;
import Vista.VentanaPrincipal;
import Vista.VistaUsuarios;

public class Controlador {

    public static VentanaPrincipal vn = new VentanaPrincipal();
    public static VectorEmpleados vectorEmp = new VectorEmpleados();
    public static int Index;

    public static void mostrar() {
        vn.setLocationRelativeTo(null);
        vn.setVisible(true);
        ControladorUsuarios.mostrar();
    }

    public static void ocultar() {
        vn.setVisible(false);
    }

    public static void botonCerrar() {
        System.exit(0);
    }

    public static void botonRegistrar() {
        ControladorUsuarios.ocultar();
        ControladorRegistro.mostrar();

        Index = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Los el numero de usuarios a registrar "));
        vectorEmp.crearEmpleados(Index);

    }

    public static void actualizarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Genero");
        modelo.addColumn("Salario Basico");
        modelo.addColumn("Salario Neto");
        modelo.addColumn("Estrato");
        modelo.addColumn("Horas Laboradas");
        modelo.addColumn("Horas Extras Laboradas");
        modelo.addColumn("Fecha de Vinculacion");

        for (int i = 0; i < Index; i++) {

            modelo.addRow(new Object[] {
                    vectorEmp.getEmpleados()[i].getIdEmpleado(),
                    vectorEmp.getEmpleados()[i].getNombre(),
                    vectorEmp.getEmpleados()[i].getGenero(),
                    vectorEmp.getEmpleados()[i].getSalarioBasico(),
                    vectorEmp.getEmpleados()[i].getSalarioNeto(),
                    vectorEmp.getEmpleados()[i].getEstrato(),
                    vectorEmp.getEmpleados()[i].getHorasLaboradas(),
                    vectorEmp.getEmpleados()[i].getHorasExtraLaboradas(),
                    vectorEmp.getEmpleados()[i].getFechaVinculacion()
            });

        }

        VistaUsuarios.jTable1.setModel(modelo);

    }

    public static void botonBuscarInformacion() {
        ControladorUsuarios.ocultar();

        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID del usuario que deseas buscar "));
        vectorEmp.generarReporte(id);
        ControladorInformacion.mostrar();
    }

    public static void botonOrdenarQuicksort() {

    }

    public static void botonOrdenarSeleccion() {

    }

    public static void botonOrdenarShell() {
    }

}