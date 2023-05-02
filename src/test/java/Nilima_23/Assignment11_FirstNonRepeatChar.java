package Nilima_23;

public class Assignment11_FirstNonRepeatChar {
	
    public static void main(String args[])
    {
    	
    	Assignment11_FirstNonRepeatChar obj = new Assignment11_FirstNonRepeatChar();
    	obj.PrintNonRepeatChar("Nilima");
    	obj.PrintNonRepeatChar("chinchwad");
    	obj.PrintNonRepeatChar("baba");
    }
    
    void PrintNonRepeatChar(String input){
   
        boolean flag = true;

        for(char i :input.toCharArray())
        {
                       if (input.indexOf(i) == input.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+ i);
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("There is no non repeating character in input string");
    }

}
