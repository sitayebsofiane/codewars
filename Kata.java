package fr.sofiane.programme;

public class Kata {
	public static String createPhoneNumber(int[] numbers) {
		String res ="(";
		for(int i=0;i<numbers.length;i++) {
			if(i==3)
				res+=") "+numbers[3];		
			else if(i==6)
				res+="-"+numbers[6];
			else
				res+=numbers[i];
		}
		return res;
	  }

	public static void main(String[] args) {
		int [] numero= {6, 2, 3, 4, 5, 6, 7, 8, 4, 3};
		
		System.out.println(createPhoneNumber(numero));
	}

}
