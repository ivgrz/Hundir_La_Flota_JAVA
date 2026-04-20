public class Casillero {
    private Nave nave;
    private boolean visitada;


    public Casillero(){
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
