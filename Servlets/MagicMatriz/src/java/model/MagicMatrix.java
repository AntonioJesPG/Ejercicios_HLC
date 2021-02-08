/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DWES
 */
public class MagicMatrix {
    
    int[][] matriz;
    int t;
    public MagicMatrix(int t){
        this.matriz = new int[t][t];
        this.t = t;
            int i = t/2;
            int j = t-1;

        for(int num = 1; num <= t*t;){
            if( i == -1 && j == t){
                j = t - 2;
                i = 0;
            }
            else{
                if(j == t){
                    j = 0;
                }
                if(i < 0){
                    i = t -1;
                }
            }
            
            if(matriz[i][j] != 0){
                j -= 2;
                i++;
                
                continue;
            }
            else{
                matriz[i][j] = num++;
            }
            j++;
            i--;
        }
    }
    
    public int[][] devolverMatriz(){
        return matriz;
    }
    
    public void mostrarMatriz(){
        for(int i = t-1; i >= 0; i--){
            for(int j = 0; j < t; j++){
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma " +  (t*(t*t+1)/2));
    }
    
    public static void main (String [] args){
        MagicMatrix m = new MagicMatrix(3);
        m.mostrarMatriz();
    }
}
