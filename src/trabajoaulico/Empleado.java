package trabajoaulico;

/**
 *
 * @author Leonel
 */
public class Empleado {

    private int dni;
    private String nombreApellido;
    private String categoria;
    private double sueldo;
    private Empresa empresa;

    /**
     *
     * @param dni
     * @param nombreApellido
     * @param categoria
     * @param sueldo
     * @param empresa
     */
    public Empleado(int dni, String nombreApellido, String categoria, double sueldo, Empresa empresa) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public int getDni() {
        return dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombreApellido=" + nombreApellido + ", categoria=" + categoria + ", sueldo=" + sueldo + ", empresa=" + empresa + '}';
    }

}
