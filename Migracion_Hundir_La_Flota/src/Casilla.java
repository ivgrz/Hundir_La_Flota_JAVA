/**
 * Creacion de clase casilla para Tablero
 */
public class Casilla {
    private Nave nave;
    private boolean visitada;


    public Casilla(){
        /**
         * Constructor de la clase Casilla.
         *
         *         Atributos:
         *             nave: Referencia a la nave que ocupa esta casilla (None si está vacía)
         *             visitada (bool): True si ya se ha disparado a esta casilla, False en caso contrario
         */
        this.nave = null;
        this.visitada = false;

    }


    public Nave getNave() {
        return nave;
    }

    public boolean isVisitada() {
        return visitada;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public void setVisitada(boolean visitada) {
        this.visitada = visitada;
    }

}
