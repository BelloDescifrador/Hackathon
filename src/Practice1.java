import java.util.Scanner;


public class Practice1 {
    //global variables
    int count=0;
	String newstr="";
	
	public int occuranceOfWord(String str, String word){
		int count=0;
		int ps=0;				//ps=previous space
		for (int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(c == ' ')
			{	
				int cs=i; 				//cs=current space
				String occured=str.substring(ps,cs);
				if(word.equalsIgnoreCase(occured))
				{
					count++;
				}
				ps=i+1;
			}
			
		}
		return count;

	}
	
	public String remove(String str, String word){
		     str=str+" ";        
	         String temp="";   
	             
	        for(int i=0;i<str.length();i++)
	        {
	            char x=str.charAt(i);
	            if(x!=' ')
	                temp=temp+x;               
	            else
	            {
	                if(word.equals(temp))
	                	count++;
	                else
	                    newstr=newstr+temp;
	                    
	                newstr=newstr+" ";
	                temp="";
	            }
	        }
		
	   
	     newstr.replaceAll(" ","");
		return newstr;
	}
	
	public String append(String str, String word){
		
		String str1 = word;
        String x=newstr;
        String repeated="";
        for(int i=0;i<count;i++)
        {
            repeated = x+" "+str1;
            x=repeated;
        }
		return repeated;
	}
	

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("\n Enter any string");
		String s = scan.nextLine();
		System.out.println("\n Enter a word from the string");
		String w = scan.nextLine();
	
		Practice1 obj=new Practice1();
		int res1=obj.occuranceOfWord(s,w);
		System.out.println("Occurrences of the word in the string:"+res1);
		String res2= obj.remove(s, w);
        System.out.println("After removal of word from the string:"+res2);
        String res3=obj.append(s, w);
        System.out.println("Appending same word equal to number of occurrences in string"+res3);
	}

}
