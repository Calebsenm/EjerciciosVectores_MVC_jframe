package Controlador;

import Vista.VentanaPrincipal;

public class Controlador {

    public static VentanaPrincipal vn = new  VentanaPrincipal();
    
    public static void mostrar() {
        vn.setLocationRelativeTo(null);
        vn.setVisible(true);
        ControladorUsuarios.mostrar();
    }
    
    public static void ocultar(){
        vn.setVisible(false);
    }

    public static void botonCerrar(){
        System.exit(0);
    }
    
    public static void botonRegistrar(){
        ControladorUsuarios.ocultar();
        ControladorRegistro.mostrar();      
    }

    public static void botonBuscarInformacion(){
        ControladorUsuarios.ocultar();
        ControladorInformacion.mostrar();
    }

    public static void botonOrdenarQuicksort(){

    }

    public static void botonOrdenarSeleccion(){

    }

    public static void botonOrdenarShell(){}


}