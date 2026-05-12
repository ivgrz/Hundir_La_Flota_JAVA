/**
 * Clase que crea el objeto Nave
 */

/**
 * @author Ivan Gutierrez
 * @version 1.0
 * Creacion del objeto Nave
 */
public class Nave {
    /**
     * Propiedades de nave
     *
     */

    private String nombre;
    private String tipo;
    private int tamano;
    private int vida;

    /**
     * Constructor de clase NAVE
     * @param nombre: String
     * @param tipo: String
     * @param tamano: int
     * @param vida: int
     */
    public Nave(String nombre, String tipo, int tamano, int vida){
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamano = tamano;
        this.vida = vida;

    }

    /**
     * Setter VIDA
     * @param vida: int
     */
    public void setVida(int vida) {
        this.vida = vida;
    }


    /**
     * Getter vida
     * @return vida: int
     */
    public int getVida() {
        return vida;
    }

    /**
     * Setter de Nombre
     * @param nombre: String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter Tipo
     * @param tipo: String
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Setter Tamaño
     * @param tamano: int
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * Getter de Nombre
     * @return nombre: String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter
     * @return tipo: String
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Getter
     * @return tamaño: int
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * Metodo restar vida
     * @return vida:int
     */
    public int restarvida(){
        vida -= 1;
        return vida;
    }

    /**
     * Metodo que resta vida a la Nave al recibir un disparo
     * @return boolean
     */
    public String recibir_disparo(){
        restarvida();
        if (vida > 0){
            return "Tocado";

        }else{
            return "Hundido";
        }

    }

    /**
     * Metodo toString para visualizar el nombre y vida de la Nave
     * @return String
     */
    @Override
    public String toString() {
        return (nombre + " " +  vida);
    }
}
