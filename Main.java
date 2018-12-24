/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unclecoin;

import java.util.Scanner;

/**
 *
 * @author amir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] big = {'x','x','x','x','x','H','T','H','T','H','x','x','x','x','x'};
        int j, w, x=1;
        for(;true;x++){
            char l,r;
            System.out.print("  ");
            for (int i = 0; i < 14; i++)
                System.out.printf("%4d",i+1);
            System.out.println("");
            for (int i = 0; i < 15; i++)
                System.out.print("   "+big[i]);
            
            System.out.print("\nChoose a set you want to move : ");
            j = s.nextInt();
            
            if(big[j-1] == 'x' || big[j]=='x')
                continue;
            else{
                l = big[j-1];
                r = big[j];
            }
            
            System.out.println("Where do you want to move those two numbers to?");
            w = s.nextInt();
            if(big[w-1] == 'x' && big[w]=='x'){
                big[w-1] = l;
                big[w] = r;
                big[j-1] = 'x';
                big[j] = 'x';
            }
            if(winner(big))
            break;
        }
        
        System.out.println("You got it boiii. Completed in " + x +" steps");

        for (int i = 0; i < 15; i++)
            System.out.print("   "+big[i]);
    }

    private static boolean winner(char[] big) {
        int i = 0;
        for (; i < 10; i++) {
            if(big[i]== 'H' || big[i] == 'T'){
                int count=1;
                while(count <= ((big[i]=='H') ? 2:1)){
                    if(big[i]==big[i+1]){
                        i++;
                        count++;
                    }
                    else
                        return false;
                }
                i++;
                count=1;
                while(count <= ((big[i]=='H') ? 2:1)){
                    if(big[i]==big[i+1]){
                        i++;
                        count++;
                    }
                    else
                        return false;
                }
                return true;
            }
        }
        return false;
    }
    
}
