package fr.sofiane.programme;

import java.io.IOException; 
  
class GFG { 
  
    static int Modulo(int a, char b[]) 
    { 
         
        int mod = 0; 
  
        
        for (int i = 0; i < b.length; i++) 
            mod = (mod * 10 + b[i] - '0') % a; 
  
        return mod; 
    } 
  
    
    static int LastDigit(char a[], char b[]) 
    { 
        int len_a = a.length, len_b = b.length; 
  
        
        if (len_a == 1 && len_b == 1 && b[0] == '0' && a[0] == '0') 
            return 1; 
  
        
        if (len_b == 1 && b[0] == '0') 
            return 1; 
  
        
        if (len_a == 1 && a[0] == '0') 
            return 0; 
  
       
        int exp = (Modulo(4, b) == 0) ? 4 : Modulo(4, b); 
  
        
        int res = (int)(Math.pow(a[len_a - 1] - '0', exp)); 
  
       
        return res % 10; 
    } 
  
   
    public static void main(String args[]) throws IOException 
    { 
        char a[] = "2".toCharArray(), b[] = { '1','2','8' }; 
        System.out.println(LastDigit(a, b)); 
    } 
} 
  
