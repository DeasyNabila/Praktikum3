/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumtiga;

/**
 *
 * @author MOKLET-1
 */
public class PraktikumTiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int p, u, j=4, i=4, f=5;
        for(p=1;p<=j;p++)
        {
            for(u=4;u>=1;u--)
               {
                    if(p==u)
                        System.out.print("@");
                else if (p==1 || p==4)
                    System.out.print("@");
                    else
                    System.out.print(" ");
               }
        }   
}   
 
}
