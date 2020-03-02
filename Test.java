package fr.sofiane.programme;

import java.util.Date;

public class Test {
	
	public static double calcule(int n) {
			double res =0;
		for (int i = 0; i < n; i++) {
			for(int j=0; j<n;j++) {
				res+=j;
			}
			
		}
		return res;
		
	}
	
	public static void insertion(int [] tab, int tailleLogique)
	{
	    int cpt;
	    int element;
	 
	    for (int i = 1; i < tailleLogique ; i++)
	    {    
	        element = tab[i];
	        cpt = i - 1;
	        while (cpt >= 0 && tab[cpt] > element)
	        {
	           tab[cpt + 1] = tab[cpt];
	           cpt--;
	        }
	        tab[cpt + 1] = element;
	    }
	}


	
	public static int[] generer(int taille) {
		int[]tab = new int[taille];
		for (int i = 0; i < tab.length; i++) {
			tab[i]=(int)(10000*Math.random());
		}
		return tab;	
	}
	static void displayTab(int[] tab)
    {      
         for(int i=0; i < tab.length; i++)
         {  
              System.out.print(tab[i] + " ");  
         } 
         System.out.println();
    }

	
	public static void main(String[] args) {
//		int[] tab =generer(100000);
//		displayTab(tab);
		Date maintenant1 = new Date(System.currentTimeMillis()); 
//		insertion(tab,tab.length);
		System.out.println(calcule(1500000));
		Date maintenant2 = new Date(System.currentTimeMillis()); 
		System.out.println("********************apres tri**********************");
		//displayTab(tab);
		System.out.println("temps d'execution "+(maintenant2.getTime() - maintenant1.getTime()));
		
	}

}
