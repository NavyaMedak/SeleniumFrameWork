package Automation;

public class palindromeNumber {

	public static void main(String[] args) {
		int num=16461;
		int temp=num;
		int rem,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("reverse of number is:"+rev);
		if(num==rev)
		{
			System.out.println(num+"Given number is palindrome");
		}
		else
		{
		System.out.println(num+"Given number is not palindrome");

		}

	}

}
