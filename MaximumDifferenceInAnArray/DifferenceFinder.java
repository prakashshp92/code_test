/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differencefinder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Prakash Premkumar
 */
public class DifferenceFinder {

    /**
     * @param args the command line arguments
     */
    private static int n;
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("Enter the number of elements:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] elements = new int[n];
        System.out.println("Enter the numbers:");
        for(int i=1; i<=n;i++) {
           br = new BufferedReader(new InputStreamReader(System.in));
           elements[i-1] = Integer.parseInt(br.readLine());
        }
        
        int maxDiff = -1;
        for(int i=1;i<n;i++) {
            for(int j=0;j<i;j++) {
                if(elements[j] < elements[i] && elements[i] - elements[j] > maxDiff) {
                    maxDiff = elements[i] - elements[j];
                }
            }
        }
        
        System.out.println("MaxDiff="+ maxDiff);
    }
    
}
