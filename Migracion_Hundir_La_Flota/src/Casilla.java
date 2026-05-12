/**
 * @author Ivan Guiterrez
 * @version 1.0
 * Creacion de clase casilla para Tablero
 */
public class Casilla {
    /**
     * Propiedades de clase Casilla
     */
    private Nave nave;
    private boolean visitada;

    /**
     * Constructor
     */
    public Casilla(){

        this.nave = null;
        this.visitada = false;

    }

    /**
     * Getter
     * @return nave: Nave
     */
    public Nave getNave() {
        return nave;
    }

    /**
     * Getter
     * @return boolean
     */
    public boolean isVisitada() {
        return visitada;
    }

    /**
     * Setter
     * @param nave: Nave
     */
    public void setNave(Nave nave) {
        this.nave = nave;
    }

    /**
     * Setter
     * @param visitada: boolean
     */
    public void setVisitada(boolean visitada) {
        this.visitada = visitada;
    }

}
