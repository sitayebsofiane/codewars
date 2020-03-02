package fr.sofiane.programme;

public class CountIPAddresses {
	public static long ipsBetween(String start, String end) {
		int [] tabStatrt=new int[4];
		int [] tabEnd=new int[4];
		for(int i=0;i<4;i++) {
			tabStatrt[i]=Integer.parseInt(start.replace(".", "/").split("/")[i]);
			tabEnd[i]=Integer.parseInt(end.replace(".", "/").split("/")[i]);
		}
		long res=0;
		
		for(int i=0;i<4;i++) {
		res+=(tabEnd[i]-tabStatrt[i])*((long)Math.pow(256, 3-i));

		}
		return res;
	}
	public static void main(String []args) {
		System.out.print(ipsBetween("10.0.0.1", "10.0.255.254"));
	}

}
