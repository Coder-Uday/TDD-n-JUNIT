package com.uday;

public class UdayTest implements Access {
	public String accept(String str)
	{   
	        String s="";
		
	      int len=str.length();
		if(len>=2)
		{
			if(str.charAt(0)!='A')
			{
				s=s+str.charAt(0);
				
			}
			if(str.charAt(1)!='A')
			{
				s=s+str.charAt(1);
				
			}
			if(len>2)
			{
				
				s=s+str.substring(2,len);
				
			}
		
			
		}
		else
		{
			if(len==1)
			{
				if(str.charAt(0)!='A')
				{
					s=s+str.charAt(0);
					
				}	
				
				
			}
			}
		
		
	   return(s);
	}

}
