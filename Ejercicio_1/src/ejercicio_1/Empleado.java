
package ejercicio_1;

import java.time.LocalDate;

public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String genero;
    private double salarioBasico;
    private double salarioNeto;
    private int estrato;
    private int horasLaboradas;
    private int horasExtraLaboradas;
    private LocalDate fechaVinculacion;

    public Empleado(int idEmpleado, String nombre, String genero, double salarioBasico, double salarioNeto, int estrato,
            int horasLaboradas, int horasExtraLaboradas, LocalDate fechaVinculacion) {

        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.genero = genero;
        this.salarioBasico = salarioBasico;
        this.salarioNeto = salarioNeto;
        this.estrato = estrato;
        this.horasLaboradas = horasLaboradas;
        this.horasExtraLaboradas = horasExtraLaboradas;
        this.fechaVinculacion = fechaVinculacion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getGenero() {
        return genero;
    }


        public double getSalarioBasico() {
        return salarioBasico;
    }
    
    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }
    
    public double getSalarioNeto() {
        return salarioNeto;
    }
    
    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
    
    public int getEstrato() {
        return estrato;
    }
    
    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getHorasLaboradas() {
        return horasLaboradas;
    }
    
    public void setHorasLaboradas(int horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }
    
    public int getHorasExtraLaboradas() {
        return horasExtraLaboradas;
    }
    
    public void setHorasExtraLaboradas(int horasExtraLaboradas) {
        this.horasExtraLaboradas = horasExtraLaboradas;
    }
    
    public LocalDate getFechaVinculacion() {
        return fechaVinculacion;
    }
    
    public void setFechaVinculacion(LocalDate fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

}
