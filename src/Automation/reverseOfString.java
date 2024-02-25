package Automation;

public class reverseOfString {

	public static void main(String[] args) {
	    String s="Shivva";
	    int len=s.length();
	    String rev="";
	    System.out.println(s.length());
	    for(int i=len-1;i>=0;i--)
	    {
	    	rev=rev+s.charAt(i);
	    }
	   System.out.println("Reverse of String:"+rev);
}
}
