public class Juego {
    private Tablero tablero;
    public Juego(){
        this.tablero = new Tablero();
        inicializando_naves();
    }

    /**
     * Crea e inicializa todas las naves del juego.
     * Coloca las naves en el tablero en posiciones predefinidas.
     */
    public void inicializando_naves(){
        System.out.println("Inicializando naves de la partida");

        Nave por1 = new Nave("Enterprise", "portaaviones", 5, 5);

        Nave fra1 = new Nave("Bismarck", "fragata", 3, 3);
        Nave fra2 = new Nave("Prince of Wales", "fragata", 3, 3);
        Nave fra3 = new Nave("Graf Spee", "fragata", 3, 3);

        Nave sub1 = new Nave("U-47", "submarino", 1, 1);
        Nave sub2 = new Nave("U-96", "submarino", 1, 1);
        Nave sub3 = new Nave("U-505", "submarino", 1, 1);
        Nave sub4 = new Nave("U-534", "submarino", 1, 1);

        // Colocamos las naves usando el tablero
        tablero.colocar_nave(por1, 1, 1, "H");
        tablero.colocar_nave(fra1, 3, 3, "V");
        tablero.colocar_nave(fra2, 7, 1, "H");
        tablero.colocar_nave(fra3, 9, 1, "H");
        tablero.colocar_nave(sub1, 4, 6, "H");
        tablero.colocar_nave(sub2, 9, 9, "H");
        tablero.colocar_nave(sub3, 7, 6, "H");
        tablero.colocar_nave(sub4, 9, 5, "H");
    }
    public void mostrar_resultado(int resultado){
        /**
         * Muestra por pantalla el resultado de un disparo.
         *
         *         Args:
         *             resultado (int): Resultado del disparo (AGUA=0, TOCADO=1, HUNDIDO=2)
         */
        if(resultado == tablero.AGUA){
            System.out.println("Agua");
        } else if (resultado == tablero.TOCADO) {
            System.out.println("TOCADO");
            
        } else if (resultado == tablero.HUNDIDO) {
            System.out.println("HUNDIDO");
            
        }
    }
    public void lanzar_ataque(int x,int y){
        /**
         * Ejecuta un disparo en las coordenadas indicadas.
         *
         *         Args:
         *             x (int): Coordenada X del disparo
         *             y (int): Coordenada Y del disparo
         */
        System.out.println("Atacando en las coordenadas " + " " + x + " " + y);
        int resultado = tablero.comprobar_impacto(x,y);
        mostrar_resultado(resultado);
    }

}
