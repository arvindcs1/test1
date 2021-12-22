package Dataprovider_external;

public class String_Split {

	public static void main(String[] args) {
		String s1 = "Arvind Kumar Yadav";
		String []s2= s1.split(" ");
	char []ch1=s2[0].toCharArray();
//		for(int i=0;i<s2.length-1;i++) {
//			System.out.print(s2[i]+" ");
//		}
//		System.out.println(" ");
		
	char []ch2=s2[1].toCharArray();
	System.out.println(ch1[0]+"."+ch2[0]+"."+s2[2]);
			
		}
	 	}
	
	


