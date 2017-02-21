/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamecordilleras;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author profe
 */
public class ProgramameCordilleras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent=new Scanner(System.in);
        
        while(ent.hasNext()){
            int montañas=Integer.valueOf(ent.next("-?\\d+"));
            
            if(montañas==0) break;
            int[] cimas=new int[montañas];
            for(int i=0;i<montañas;i++)
                cimas[i]=Integer.valueOf(ent.next("-?\\d+"));
            int cont=1;
            int maxim=cimas[cimas.length-1];
            for (int i = cimas.length-2; i >=0; i--) {
                int altura=cimas[i];
                if(maxim<altura){
                    maxim=altura;
                    cont++;
                }
            }
            System.out.println(cont);
        
        }
    }
    
}
