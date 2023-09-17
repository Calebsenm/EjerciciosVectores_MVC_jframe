package Modelo;

import java.time.LocalDate;
import java.time.Period;

public class VectorEmpleados {

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    private Empleado[] empleados;
   
    
    public void crearEmpleados(int numero) {
        for (int i = 0; i < numero; i++) {
            empleados[i] = new Empleado(0, "", "", 0,0, 0, 0, 0, null);
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

    // calcula los saldos netos y genera el reporte devolviendo una String
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

            if (empleados[id].getEstrato() == 1 || empleados[id].getEstrato() == 2) {
                sudsidioTTE = 78.000;
            } else {
                sudsidioTTE = 0;
            }

            netoAPagar = sueldoBasico - aporteSalud - aportePension - aporteArl + devengado + sudsidioTTE;

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

    // Metodos del algoritmo Quicksort
    public static void swap(Empleado[] empleado, int i, int j) {
        Empleado temp = empleado[i];
        empleado[i] = empleado[j];
        empleado[j] = temp;
    }

    public static int partition(Empleado[] empleado, int start, int end) {
        double pivot = empleado[end].getSalarioNeto();
        int pIndex = start;

        for (int i = start; i < end; i++) {
            if (empleado[i].getSalarioNeto() <= pivot) {
                swap(empleado, i, pIndex);
                pIndex++;
            }
        }
        swap(empleado, end, pIndex);
        return pIndex;
    }

    public void ordenarQuickSort(Empleado[] empleado, int inicio, int fin) {

        if (inicio >= fin) {
            return;
        }

        int pivot = partition(empleado, inicio, fin);
        ordenarQuickSort(empleado, inicio, pivot - 1);
        ordenarQuickSort(empleado, pivot + 1, fin);

    }

    // ordenará alfabeticamente de forma acendente por nombres
    public void odenarSeleccion(Empleado[] empleado) {
        for (int i = empleado.length - 1; i > 0; i--) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                
                if (compareStrings( empleado[i].getNombre() , empleado[j].getNombre()) > 0){
                    maxValue = j + 1;
                }

            }
            swapSelecction(empleado, i, maxValue);
        }
    }

    private void swapSelecction(Empleado[] array, int a, int b) {
        Empleado value = array[b];
        array[b] = array[a];
        array[a] = value;
    }

    private  int compareStrings(String word1, String word2) {
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if ((int) word1.charAt(i) != (int) word2.charAt(i)) {
                return (int) word1.charAt(i) - (int) word2.charAt(i);
            }
        }
        if (word1.length() != word2.length()) {
            return word1.length() - word2.length();
        } else {
            return 0;
        }
    }

    // ordena por estrato en forma decendente
    public void ordenarShell (Empleado[] empleado){
            int inta, i;
            Empleado aux;
            boolean band;
            inta = empleado.length;
            while(inta > 0){
                inta = inta / 2;
                band = true;
                while(band){
                    band = false;
                    i = 0;
                    while ((i+inta) <=empleado.length-1){//2.1.1
                        if (empleado[i].getEstrato() > empleado[i + inta].getEstrato()){
                            aux = empleado[i];
                            empleado[i] = empleado[i+inta];
                            empleado[i+inta] = aux;
                            band = true;
                        }
                        i = i +1;
                    }
                }
            }
    }
}
