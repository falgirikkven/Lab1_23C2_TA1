package trabajoaulico;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Leonel
 */
class Empresa {

    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        empleados = new ArrayList();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            // equivalente a empleado.toString() pero sin mostrar la empresa
            int dni = empleado.getDni();
            String nombreApellido = empleado.getNombreApellido();
            String categoria = empleado.getCategoria();
            double sueldo = empleado.getSueldo();
            System.out.println("Empleado{" + "dni=" + dni + ", nombreApellido=" + nombreApellido + ", categoria=" + categoria + ", sueldo=" + sueldo + "}");
        }
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return razonSocial;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.razonSocial, other.razonSocial);
    }

       

}
