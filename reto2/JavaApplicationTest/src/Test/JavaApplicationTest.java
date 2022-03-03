/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author GIOVANNI
 */
public class JavaApplicationTest{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int target=2141;
        int i = Integer.parseInt(Double.toString(Math.floor((-1+Math.pow((1+8*target),0.5))*0.5)).replaceAll(".0", ""));

        int contents = Integer.parseInt(Double.toString(Math.floor(i*(i+1)*0.5)));

        int j=0;
        System.out.println(i);
        while (contents<target){
            contents=contents+1;
            i=i-1;
            j=j+1;
        }
        Pos pos = new Pos((int) i, j);
        System.out.println(pos);
           String a = "64.0";

           String c = a.replaceAll(".0", "");
           System.out.println(c);
        
    }
    
}
