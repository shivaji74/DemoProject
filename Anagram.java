import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string ");
		String a=sc.nextLine(); 
		System.out.println("enter second string ");
		
		String b=sc.nextLine();
		
		
		if(a.length()==b.length())
        {
            char ch[]=a.toCharArray();
               Arrays.sort(ch);
            char[] ch1=b.toCharArray();
                Arrays.sort(ch1);
            a=Arrays.toString(ch);
            b=Arrays.toString(ch1);
               if(a.equals(b))
            {
                System.out.println("Yes anagram");
            }
               else{
                  System.out.println("No anagram");
              }
           }
		else
		{
			System.out.println("No anagram");
		}
           
    }
	}


