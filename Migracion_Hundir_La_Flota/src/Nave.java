public class Nave {
    /**
     *
     Clase que crea una nave con sus parametros, ademas tiene metodos "recibir_disparo" y "restar_vida"
     */
    private String nombre;
    private String tipo;
    private int tamano;
    private int vida;


    public void setVida(int vida) {
        this.vida = vida;
    }



    public int getVida() {
        return vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Nave(String nombre, String tipo, int tamano, int vida){
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamano = tamano;
        this.vida = vida;

    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamano() {
        return tamano;
    }

    public int restarvida(){
        vida -= 1;
        return vida;
    }

    public String recibir_disparo(){
        restarvida();
        if (vida > 0){
            return "Tocado";

        }else{
            return "Hundido";
        }

    }

    @Override
    public String toString() {
        return (nombre + " " +  vida);
    }
}
