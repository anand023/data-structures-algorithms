package ds.arrays;

public class ReverseTheString {
	
	public static String reverse(String str){
		if(str.isEmpty()) return "hmmmm Not too funny!";
		if(str.length() == 1) return str;
		char[] ch = str.toCharArray();
		int l = ch.length-1;
		char[] reverse = new char[l+1];
		for (int i=0; i<=l; i++){
			reverse[i] = ch[l-i];
		}
		return new String(reverse);
	}
	public static void main(String[] args){
		System.out.println("Hi, my name is Abhishek and reverse is "+reverse("Hi, my name is Abhishek"));
	}
}
