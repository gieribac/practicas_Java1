/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import javaapplication10.Pos;

/**
 *
 * @author GIOVANNI
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int target=2141;
        int i = (int) Math.floor((-1+Math.pow((1+8*target),0.5))*0.5);
        int contents = Integer.parseInt(Double.toString(Math.floor(i*(i+1)*0.5)));
        int j=0;
        while (contents<target){
            contents=contents+1;
            i=i-1;
            j=j+1;
        }
        Pos pos = new Pos(i, j);
        System.out.println(pos);
        
    }
    
}
