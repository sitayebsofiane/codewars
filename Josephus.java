package fr.sofiane.programme;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
		  public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
			  int tailleInitiale=items.size();
			  List<T> retour=new ArrayList<T>();
			  List<T> temp=items;
			  int i=0;
			  while(retour.size()<tailleInitiale) {			  
				  if(i%k==k-1) {
					  retour.add(temp.get(i%temp.size()));
				  }else {
					  temp.add(temp.get(i%temp.size()));
				  }
				  i++;
				  						
			  }
			return retour;

		  }

	public static void main(String[] args) {
		int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 
        List<Integer> items= new ArrayList<Integer>();
        	for(int e:tab)
        		items.add(e);
       
        for (int elem : josephusPermutation(items, 1))
        	{
            System.out.println(elem);
        	}
	}

}
