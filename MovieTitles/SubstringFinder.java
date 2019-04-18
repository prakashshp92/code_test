/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substringfinder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Prakash Premkumar
 */
public class SubstringFinder {

    /**
     * @param args the command line arguments
     */
    private static String movieStrToBeFound;
    private static ArrayList<String> movieListWithKeyWord = new ArrayList<>();
    
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        System.out.println("Enter the movie substring to find");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        movieStrToBeFound = br.readLine();
        
        System.out.println("Enter the movie names");
        while(true) {
            
          br = new BufferedReader(new InputStreamReader(System.in));
          String line = br.readLine();
          
          if(line != null && line.trim().equalsIgnoreCase("<end/>")) {
              break;
          }
          
          if(line == null) {
              break;
          }
          
          String lowercaseLine = line.toLowerCase();
          
          if(lowercaseLine.contains(movieStrToBeFound.toLowerCase())) {
              movieListWithKeyWord.add(line);
          }
          
        }
        
        
        Collections.sort(movieListWithKeyWord);
        
        System.out.println("Output-------");
        
        for(String l: movieListWithKeyWord) {
            System.out.println(l);
        }
    }
    
}
