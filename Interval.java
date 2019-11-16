package fr.sofiane.programme;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.lang.Math;

public class Interval {
public static class TabInt implements Comparable<Object> {
		int pEl;
		int dEl;
		public TabInt(int[] tab) {
			super();
			this.pEl = tab[0];
			this.dEl= tab[1];
			
		}
		@Override
		public int compareTo(Object o) {
			TabInt e= (TabInt)o;
			return pEl-e.pEl;
		}
		@Override
		public String toString() {
			return "TabInt [pEl=" + pEl + ", dEl=" + dEl + "]";
		}
		public int tailleInterval() {
			return dEl-pEl;
		}	
	}
public static ArrayList<TabInt> trieListe(ArrayList<TabInt>liste){
		for(int i=0;i<liste.size()-1;i++) {
			if(liste.get(i).dEl>=liste.get(i+1).pEl) {
				liste.get(i).dEl=Math.max(liste.get(i).dEl,liste.get(i+1).dEl);
				liste.remove(i+1);
			}
		}
		for(int i=0;i<liste.size()-1;i++) {
			if(liste.get(i).dEl>liste.get(i+1).pEl)
				return trieListe(liste);
		}
		return liste;
		
	}
	

    public static int sumIntervals(int[][] intervals) {
    	if(intervals==null)
    		return 0;
    else if(intervals.length==0)
        return 0;
      else if(intervals[0]==null || intervals[0].length==0)
			 return 0;
		 else {
		 HashSet<TabInt> hs = new HashSet<TabInt>();
		 	for(int i=0;i<intervals.length;i++) 
				{
				TabInt e=new TabInt(intervals[i]);
					hs.add(e);
				}
		 	
			TreeSet<TabInt> trie=new TreeSet<TabInt>(hs);
			ArrayList<TabInt> liste= new ArrayList<TabInt>(trie);
			trieListe(liste);
			int res=0;
			for(TabInt e:liste)
				res+=e.tailleInterval();
			return res;
		 		}
    }
    public static void main (String[]args) {
    	int[][] tab= {{1,2},{1,2},{1,5},{11,202}};
    	System.out.println(sumIntervals(tab));
    	
    }
}
