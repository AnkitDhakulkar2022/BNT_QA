package Nilima_23;

public class Assignment12_FindLongestString {

	  public static void main(String[] args) {
		  
		  String st[]={"nitin","jadeja","mama","Adam is Adama","Nilima Ghawate" };  
		  Assignment12_FindLongestString obj = new Assignment12_FindLongestString();
		  obj.longestString(st);
		  
		   
	  }
		    void longestString(String st[]){
		    	
		    String s=st[0];   
		    for(int i=0;i<st.length;i++)     
		    {
		        if(s.length()< st[i].length())     
		        {    
		            s=st[i];    
		        }
		    }
		    System.out.print("Longest String is : " + s);     
		  }
	  }