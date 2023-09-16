
package ejercicio_1;

import java.util.Date;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String genero;
    private double salarioBasico;
    private int estrato;
    private int horasExtraLaboradas;
    private Date fechaVinculacion;

    // Constructor
    public Empleado(int idEmpleado, String nombre, String genero, double salarioBasico, int estrato, int horasExtraLaboradas, Date fechaVinculacion) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.genero = genero;
        this.salarioBasico = salarioBasico;
        this.estrato = estrato;
        this.horasExtraLaboradas = horasExtraLaboradas;
        this.fechaVinculacion = fechaVinculacion;
    }

    // Getters y Setters
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

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getHorasExtraLaboradas() {
        return horasExtraLaboradas;
    }

    public void setHorasExtraLaboradas(int horasExtraLaboradas) {
        this.horasExtraLaboradas = horasExtraLaboradas;
    }

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }
}
