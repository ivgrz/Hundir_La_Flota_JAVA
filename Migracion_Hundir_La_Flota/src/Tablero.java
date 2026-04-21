public class Tablero {
    public static final int AGUA = 0;
    public static final int TOCADO = 1;
    public static final int HUNDIDO = 2;

    private Casilla[][] casillero;
    public Tablero(){
        this(10);

    }
    public Tablero(int tamano){
        this.casillero = new Casilla[tamano][tamano];

        for(int i = 0; i < tamano; i++){
            for (int j = 0; j < tamano; i++){
                this.casillero[i][j] = new Casilla();
            }
        }



    }
    /*
    *     def colocar_nave(self, nave, x, y, orientacion):
        """
        Coloca una nave en el tablero en las coordenadas especificadas.
        Marca las casillas ocupadas por la nave según su tamaño y orientación.

        Args:
            nave (Nave): Objeto nave a colocar
            x (int): Coordenada X inicial (fila)
            y (int): Coordenada Y inicial (columna)
            orientacion (str): Orientación de la nave
                              "H" para horizontal (expande en columnas)
                              "V" para vertical (expande en filas)

        Example:
            tablero.colocar_nave(submarino, 0, 0, "H")  # Coloca horizontalmente desde (0,0)
            tablero.colocar_nave(buque, 5, 3, "V")      # Coloca verticalmente desde (5,3)
        """
        if orientacion == "H":
            for i in range(nave.vida):
                self.casillero[x][y + i].nave = nave
        elif orientacion == "V":
            for i in range(nave.vida):
                self.casillero[x + i][y].nave = nave
    *
    *
    * */
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
    /*
    * CODIGO PYTHON
    def comprobar_impacto(self, x, y):
        """
        Comprueba si hay una nave en las coordenadas indicadas.
        Si la casilla ya fue visitada, no descuenta vida.
        Si hay nave, llama a su método recibir_disparo().

        Args:
            x (int): Coordenada X del disparo
            y (int): Coordenada Y del disparo

        Returns:
            int: Resultado del disparo (AGUA=0, TOCADO=1, HUNDIDO=2)
        """
        print(f"[LOG] estoy en tablero comprobando impacto ({x}, {y})")
        casilla = self.casillero[x][y]

        if casilla.visitada:
            print("[LOG] Casilla ya disparada anteriormente, no se descuenta vida")
            return self.AGUA

        casilla.visitada = True

        if casilla.nave is None:
            print("[LOG] Agua")
            return self.AGUA
        else:
            resultado = casilla.nave.recibir_disparo()
            print(f"[LOG] {casilla.nave.nombre} {resultado}")
            if resultado == "Hundido":
                return self.HUNDIDO
            return self.TOCADO

    *
    * */
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

            if(resultado.equals("TOCADO")){
                return HUNDIDO;
            }
            return TOCADO;

        }
    }
}
