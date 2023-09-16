
package ejercicio_1;


public class VectorEmpleados {
    
    private  Empleado empleados[];
    
    public  void crearEmpleados(int numero) {
        for (int i = 0; i < numero; i++) {
            empleados[i] = new Empleado(0 , "", "", 0 , 0 , 0 , null);
        }
    }
   
    public void registrarEmpleados(int indice , Empleado empleado ){
        empleados[indice] =  empleado;
    }
    
    
    // Solo será llamada dentro de esta clase
    private boolean empleadoExiste(int id ){
        for( int i = 0; i < empleados.length; i++ ){
            if (empleados[i].getIdEmpleado() == id){
                return true;
            }
        }
        return false;
    }
    
    
    public String calculoNomina(int id){
        String nomina;
        if (empleadoExiste(id)){
            
            nomina = "Nomina \n"
                    +"SUELDO BASICO		"+ empleados[id].getSalarioBasico() + "\n "
                    +"H.E LABORADAS             xxxxx\n "
                    +"VALOR H.E			xxxxx\n "
                    +"TOTAL H.E			xxxxx\n "
                    +"APORTE SALUD		xxxxx\n "
                    +"APORTE PENSEION		xxxxx\n "
                    +"APORTE ARL                xxxxx\n "
                    +"SUDSIDIO TTE		xxxxx\n "
                    +"-------------------------------\n "
                    +"NETO A PAGAR 		xxxxx\n "
                    ;
                    ;
        } else {
             nomina = "El Usuario No Existe!";
        }
        return nomina;
    }
}
