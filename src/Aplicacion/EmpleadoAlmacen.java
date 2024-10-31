package Aplicacion;

import java.util.Date;

public class EmpleadoAlmacen extends Empleado{

    public EmpleadoAlmacen(int idPersona, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String email, Date fechaNacimiento, int idEmpleado, double salario, Date fechaContratacion, String horario, String password) {
        super(idPersona, nombre, apellidoPaterno, apellidoMaterno, direccion, telefono, email, fechaNacimiento, idEmpleado, salario, fechaContratacion, horario, password);
    }
}
