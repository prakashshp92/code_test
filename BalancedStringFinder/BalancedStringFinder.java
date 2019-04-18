/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author Prakash Premkumar
 */
public class BalancedStringFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        String inputString = br.readLine();
        HashMap<Character,Integer> countMap = new HashMap<>();
        
        int length = inputString.length();
        for(int i=0;i<length;i++) {
            char ch = inputString.charAt(i);
            if(!countMap.containsKey(ch)) {
                countMap.put(ch, 1);
            }else {
                int count = countMap.get(ch);
                count++;
                countMap.put(ch, count);
            }
        }
        
        Integer aCount = countMap.get('a');
        Integer bCount = countMap.get('b');
        Integer cCount = countMap.get('c');
        Integer dCount = countMap.get('d');
        
        
        if(aCount == null) {
            aCount = 0;
        }
        
        if(bCount == null) {
            bCount =0;
        }
        
        
        if(cCount == null) {
            cCount =0;
        }
        
        
        if(dCount == null) {
            dCount =0;
        }
        
        /*
        System.out.println("aCount="+aCount);
        System.out.println("bCount="+bCount);
        System.out.println("cCount="+cCount);
        System.out.println("dCount="+dCount);
        */
        if((aCount + cCount)%2 == 0 && (bCount+dCount)%2 ==0) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        
        
        
    }
    
}
