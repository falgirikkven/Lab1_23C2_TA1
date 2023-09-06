package trabajoaulico;

import java.util.Objects;
import java.util.TreeSet;

/**
 *
 * @author Leonel
 */
class Empresa implements Comparable<Empresa> {

    private String razonSocial;
    private int cuit;
    private TreeSet<Empleado> empleados;

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        empleados = new TreeSet();
    }

    public boolean agregarEmpleado(Empleado e) {
        return empleados.add(e);
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

    public TreeSet<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return razonSocial;
    }

    @Override
    public int compareTo(Empresa o) {
        return this.razonSocial.compareTo(o.getRazonSocial());
    }

}
