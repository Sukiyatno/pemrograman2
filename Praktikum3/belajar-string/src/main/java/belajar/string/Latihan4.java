package belajar.string;

public class Latihan4{
	public static void main (String args[]){
		System.out.println (getReturn());
		}
		
		public static boolean getReturn(){
		String s1="Hello";
		String s2="Java";
		
		if(s1==s2){
		return true;
		}
		
		if (s1.equals(s2)){
		return true ;
		}
		
		if (s1.compareTo(s2)==0){
		return true;
		}else{
		return false;
		}
	}
}