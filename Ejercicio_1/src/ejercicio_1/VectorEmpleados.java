package ejercicio_1;

import java.time.LocalDate;
import java.time.Period;

public class VectorEmpleados {

    private Empleado empleados[];

    public void crearEmpleados(int numero) {
        for (int i = 0; i < numero; i++) {
            empleados[i] = new Empleado(0, "", "", 0, 0, 0, 0, 0, null);
        }
    }

    public void registrarEmpleados(int indice, Empleado empleado) {
        empleados[indice] = empleado;
    }

    public boolean empleadoExiste(int id) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getIdEmpleado() == id) {
                return true;
            }
        }
        return false;
    }

    // calcula los saldos netos y genera el reporte
    public String calularsueldoNeto(int id) {

        String nomina;

        if (empleadoExiste(id)) {

            double sueldoBasico = empleados[id].getSalarioBasico();
            int horasExtraLaboradas = empleados[id].getHorasExtraLaboradas();
            double aporteSalud = (empleados[id].getSalarioBasico() * 4) / 100;
            double aportePension = (empleados[id].getSalarioBasico() * 3.7) / 100;
            double aporteArl = (empleados[id].getSalarioBasico() * 2) / 100;

            double valorHorasExtraLaboradas;
            double sudsidioTTE;
            double netoAPagar;
            int añosTrabajados;
            double devengado; 

            // Calcula los años hasta hoy
            LocalDate fecha = empleados[id].getFechaVinculacion();
            LocalDate hoy = LocalDate.now();
            Period periodo = Period.between(fecha, hoy);
            añosTrabajados = periodo.getYears();

            if (añosTrabajados > 10) {
                valorHorasExtraLaboradas = 45.000;

            } else if (añosTrabajados >= 5 && añosTrabajados <= 10) {
                valorHorasExtraLaboradas = 35.000;
            } else if (añosTrabajados >= 3 && añosTrabajados < 5) {
                valorHorasExtraLaboradas = 30.000;
            } else {
                valorHorasExtraLaboradas = 25.000;
            }

            devengado = valorHorasExtraLaboradas * horasExtraLaboradas;
        
            if ( empleados[id].getEstrato()  == 1 || empleados[id].getEstrato() == 2 ){
                sudsidioTTE = 78.000;
            } else{
                sudsidioTTE = 0;
            }
           
            netoAPagar = sueldoBasico - aporteSalud - aportePension - aporteArl + devengado + sudsidioTTE ;
            

            nomina = "Nomina \n"
                    + "SUELDO BASICO	         $" + sueldoBasico + "\n "
                    + "HORAS EXTRAS LABORADAS     " + horasExtraLaboradas + "\n "
                    + "VALOR HORAS EXTRAS	     $" + valorHorasExtraLaboradas + "\n "
                    + "TOTAL HORAS EXTRAS	     $" + devengado + "\n"
                    + "APORTE SALUD		         $" + aporteSalud + "\n"
                    + "APORTE PENSION		     $" + aportePension + "\n "
                    + "APORTE ARL                $" + aporteArl + "\n "
                    + "SUDSIDIO TTE		         $" + sudsidioTTE + "\n "
                    + "-------------------------------\n "
                    + "NETO A PAGAR 		     $" + netoAPagar + "\n ";
            ;

            // agregar los sueldos netos a los objetos
            for (int i = 0; i < empleados.length; i++) {
                empleados[i].setSalarioNeto(netoAPagar);
            }

        } else {
            nomina = "El Usuario No Existe!";
        }
        return nomina;
    }


    // ordenará de mayor a menor 
    public void ordenarQuickSort(){

    }

    // ordenará alfabeticamente de forma acendente por nombres 
    public void ordernarPorSelección(){

    }

    // ordena por estrato en forma decendente 
    public void ordenarShell(){

    }

    public void salir(){
        System.exit(0);
    }

}
