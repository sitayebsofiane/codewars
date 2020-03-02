package fr.sofiane.programme;

import java.util.ArrayList;

public class Snail {

    public static int[] snail(int[][] array) {
    	int taille= array.length;
    	int [] tab=new int[taille*taille];
    	ArrayList<Integer>liste= new ArrayList<Integer>();
    	int i=0,j=0,index=1;
    	while(index<=taille) {
    		if(i==0 && j==0) {
    			while(j<taille-index) {
    				liste.add(array[i][j]);
    				j++;
    			}
    			while(i<taille-index) {
    				liste.add(array[i][j]);
    				i++;
    			}
    		}else {
    			while(j>0) {
    				liste.add(array[i][j]);
    				j--;
    			}
    			while(i>0) {
    				liste.add(array[i][j]);
    				i--;
    			}
    			i++;
    			j++;
    		}
    		index++;
    	}
    	for(int k=0;k< liste.size()-1;k++)
    		tab[k]=liste.get(k);
		return tab ;
    	
    }

	public static void main(String[] args) {
		int [][] array= {{1,2,3},
		                    {8,9,4},
		                    {7,6,5}};
		for(int e :snail(array)) {
			System.out.print(e+" ");
		}

	}

}
