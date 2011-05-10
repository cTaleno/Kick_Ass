/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tablero;

import java.util.ArrayList;

/**
 *
 * @author Jacob Ramirez
 */
public class Cartas_Jugadores extends Carta_Maestra{

    protected static ArrayList CJugador1;
    protected static ArrayList CJugador2;

    public Cartas_Jugadores(Color A, int B){
        super(A,B);
    }

    public Cartas_Jugadores(){
        CJugador1 = new ArrayList(7);
        CJugador2 = new ArrayList(7);
    }

    protected void Agregar_Cartas(Color A, int B, int C){
        if(C==0)
            CJugador1.add(new Cartas_Jugadores(A,B));
        CJugador2.add(new Cartas_Jugadores(A,B));
    }

}
