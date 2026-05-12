/**
 * Clase que crea una matriz en formato de Tablero
 *
 * @author Ivan Gutierrez
 * @version 1.0
 * Creacion del Tablero de juego
  */
public class Tablero {
    /**
     * Propiedades de clase Tablero
     */
    public static final int AGUA = 0;
    public static final int TOCADO = 1;
    public static final int HUNDIDO = 2;

    private Casilla[][] casillero;
    public int tamano;

    /**
     * Constructor
     */
    public Tablero(){
        this(10);

    }

    /**
     * Constructor
     * @param tamano: int
     */
    public Tablero(int tamano){

        this.casillero = new Casilla[tamano][tamano];
        this.tamano = tamano;
        for(int i = 0; i < tamano; i++){
            for (int j = 0; j < tamano; j++){
                this.casillero[i][j] = new Casilla();
            }
        }



    }

    /**
     * Metodo colocar_nave
     * @param nave: Nave
     * @param x: int
     * @param y: int
     * @param orientacion: String
     */
    public void colocar_nave(Nave nave,int x,int y, String orientacion){

        if (orientacion.equals("H")){
            for(int i = 0; i < nave.getVida(); i++){
                this.casillero[x][y+i].setNave(nave);
            }
        } else if (orientacion.equals("V")) {
            for(int i = 0; i < nave.getVida(); i++){
                this.casillero[x+i][y].setNave(nave);
            }
        }else{
            System.out.println("Orientacion invalida");
        }
    }

    /**
     * Comprueba el impacto en la posicion de la nave
     * @param x: int
     * @param y: int
     * @return int
     */
    public int comprobar_impacto(int x, int y){
        System.out.println("Comprobando impacto en " + x + " " + y);
        Casilla casilla = this.casillero[x][y];

        if (casilla.isVisitada()){
            System.out.println("Casilla disparada anteriormente");
            return AGUA;

        }
        casilla.setVisitada(true);
        if (casilla.getNave() == null){
            System.out.println("AGUA");
            return AGUA;
        }
        else {
            String resultado = casilla.getNave().recibir_disparo();
            System.out.println("[LOG] " + casilla.getNave().getNombre() + " " + resultado);

            if(resultado.equals("HUNDIDO")){
                return HUNDIDO;
            }
            return TOCADO;

        }
    }

    /**
     * Muestra la matriz en formato de Tablero de juego
     */
    public void mostrar() {
        System.out.println("  0 1 2 3 4 5 6 7 8 9"); // Encabezado de columnas
        for (int i = 0; i < tamano; i++) {
            System.out.print(i + " "); // Número de fila
            for (int j = 0; j < tamano; j++) {
                Casilla c = this.casillero[i][j];


                if (!c.isVisitada()) {
                    System.out.print("~ "); // Agua no visitada
                } else if (c.getNave() == null) {
                    System.out.print("O "); // Agua disparada (fallo)
                } else {
                    System.out.print("X "); // Impacto en nave
                }
            }
            System.out.println();
        }
    }
}
