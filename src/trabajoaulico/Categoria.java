package trabajoaulico;

/**
 *
 * @author Leonel
 */
public enum Categoria {
    DIRECTOR,
    GERENTE,
    MIEMBRO;

    private static String[] capitalizadas = null;
    public static final Categoria[] Categorias = Categoria.values();

    public static String[] capitalizadas() {
        if (capitalizadas == null) {
            capitalizadas = new String[Categorias.length];
            for (int i = 0; i < Categorias.length; i++) {
                capitalizadas[i] = Categorias[i].capitalizar();
            }
        }
        return capitalizadas;
    }

    public String capitalizar() {
        String str = this.toString();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
