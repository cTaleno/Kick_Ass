/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tablero;

/**
 *
 * @author Jacob Ramirez
 */
public class Cartas_Numericas extends Carta_Maestra{

    private static Cartas_Numericas[] CNegro;
    private static Cartas_Numericas[] CVerde;
    private static Cartas_Numericas[] CPurpura;
    private static Cartas_Numericas[] CRojo;

    private Cartas_Numericas(Color A, int B){
        super(A,B);
    }

    public void Crear_Cartas_Numericas(){
        Barajas_Negras();
        Barajas_Verdes();
        Barajas_Purpuras();
        Barajas_Rojas();
    }

    private void Barajas_Negras(){
        for(int A=0; A<20;A++){
            if(A==0){
                CNegro[A]=new Cartas_Numericas(Color.NEGRO, A);
            }else{
                CNegro[A]=new Cartas_Numericas(Color.NEGRO, A);
                int B = A;
                CNegro[++A]=new Cartas_Numericas(Color.NEGRO, B);
            }
        }

        for(int B=0; B<20; B++){
            BarajaInicial.add(CNegro[B].TipodeColor);
            BarajaInicial.add(CNegro[B].NumerodeCarta);
        }
    }

    private void Barajas_Verdes(){
        for(int A=0; A<20;A++){
            if(A==0){
                CVerde[A]=new Cartas_Numericas(Color.VERDE, A);
            }else{
                CVerde[A]=new Cartas_Numericas(Color.VERDE, A);
                int B = A;
                CVerde[++A]=new Cartas_Numericas(Color.VERDE, B);
            }
        }

        for(int B=0; B<20; B++){
            BarajaInicial.add(CVerde[B].TipodeColor);
            BarajaInicial.add(CVerde[B].NumerodeCarta);
        }
    }

    private void Barajas_Purpuras(){
        for(int A=0; A<20;A++){
            if(A==0){
                CPurpura[A]=new Cartas_Numericas(Color.PURPURA, A);
            }else{
                CPurpura[A]=new Cartas_Numericas(Color.PURPURA, A);
                int B = A;
                CPurpura[++A]=new Cartas_Numericas(Color.PURPURA, B);
            }
        }

        for(int B=0; B<20; B++){
            BarajaInicial.add(CPurpura[B].TipodeColor);
            BarajaInicial.add(CPurpura[B].NumerodeCarta);
        }
    }

    private void Barajas_Rojas(){
        for(int A=0; A<20;A++){
            if(A==0){
                CRojo[A]=new Cartas_Numericas(Color.ROJO, A);
            }else{
                CRojo[A]=new Cartas_Numericas(Color.ROJO, A);
                int B = A;
                CRojo[++A]=new Cartas_Numericas(Color.ROJO, B);
            }
        }

        for(int B=0; B<20; B++){
            BarajaInicial.add(CRojo[B].TipodeColor);
            BarajaInicial.add(CRojo[B].NumerodeCarta);
        }
    }

}
