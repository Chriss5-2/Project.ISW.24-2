package Aplicacion.Entity;

import java.util.Date;

public class Administrador extends Empleado{

    public Administrador(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String email, Date fechaNacimiento, int idEmpleado, double salario, Date fechaContratacion, String horario, String password) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono, email, fechaNacimiento, idEmpleado, salario, fechaContratacion, horario, password);
    }
}
