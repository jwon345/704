
public class helperClass {

	public static void dothis()
	{
		for (int a =0; a < 10; a++)
		{
			System.out.println("hi" + a);
		}
	}
	
	  public static int[] parseString(String fileReadString)
	    {
	        int[] b = {0,0,0,0};
		  	if (fileReadString == null)
		  	{
		  		return b; 
		  	}
	        String[] fileStringSplit = fileReadString.split(",");

	        for (int i = 0; i< fileStringSplit.length; i++)
	        {
	            b[i] = Integer.parseInt(fileStringSplit[i]);
//	            System.out.println(b[i]);
	        }
	        return b;
	    }

	    public static int parseString(String fileReadString, int liquidIndex)
	    {
	        int[] b = {0,0,0,0};
		  	if (fileReadString == null)
		  	{
		  		return 0; 
		  	}
	        String[] fileStringSplit = fileReadString.split(",");
	        for (int i = 0; i< fileStringSplit.length; i++)
	        {
	            b[i] = Integer.parseInt(fileStringSplit[i]);
//	            System.out.println(b[i]);
	        }
	        return b[liquidIndex];
	    }
}
