
/**
 * Write a description of class StringEngine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.StringTokenizer;

public class StringModifier
{

	private StringModifierGUI  st;
	/**
	 * Constructor for objects of class StringEngine
	 */
	//public StringEngine()
	public StringModifier(StringModifierGUI sTest)
	{
		 st = sTest;
	}

	/**
	 * Turn the display string to upper case and return the result.
	 */
	public String getDisplayUppercase()
	{
		String qq =  st.getInputString();
		qq = qq.toUpperCase();
		return qq;
		//return  st.getInputString().toUpperCase();
		//return "getDisplayUppercase()";  // implement this properly!
	}

	/**
	 * Turn the display string to l case and return the result.
	 */
	public String getDisplayLowercase()
	{
		String qq =  st.getInputString();
		qq = qq.toLowerCase();
		return qq;
	}

	/**
	 * Turn the display string to title case and return the result.
	 */
	public String getDisplayTitlecase()
	{
		String qq =  st.getInputString();
		qq = qq.trim(); //deals with multiple space errors
		// char[] qqArray = qq.toCharArray(); No longer neccessary
		String str = "";
		char a;


		for(int i =0;i<qq.length();i++)
    	{
			a = qq.charAt(i);
			if(i == 0){
				str = str+(Character.toUpperCase(qq.charAt(0)));
			} else{
				if(a==' ')
			{
				str = str + " ";
				str = str+(Character.toUpperCase(qq.charAt(i+1)));
				i = i+1;
				System.out.println(str);
			}
			else
			{
				str =str+(Character.toLowerCase(a));
				System.out.println(str);
			}
			}

		}						
		return str;
	}

	/**
	 * Remove leading and trailing spaces from the display string and return
	 * the result.
	 */
	public String getDisplayStripped()
	{
		String qq =  st.getInputString();
		qq = qq.trim();
		return qq;
	}

	/**
	 * Return the length of the display string.
	 */
	public int getDisplayLength()
	{
		String qq =  st.getInputString();
		return qq.length();  // implement this properly!
	}

	/**
	 * Add the input string at the end of the display string and return
	 * the result.
	 */
	public String appendInputToDisplay()
	{
		String q1 =  st.getDisplayString();
		String q2 =  st.getInputString();

		return q1 + " " + q2;  // implement this properly!
	}

	/**
	 * Add the input string at the beginning of the display string and return
	 * the result.
	 */
	public String prependInputToDisplay()
	{
		String q1 =  st.getDisplayString();
		String q2 =  st.getInputString();

		return q2 + " " + q1;  // implement this properly!
	}

	/**
	 * Add the input string to the middle of the display string and return
	 * the result.
	 */
	public String insertInputToDisplay()
	{
		String q1 =  st.getDisplayString();
		String q2 =  st.getInputString();
		StringTokenizer st = new StringTokenizer(q1);



		System.out.println(q1);
		System.out.println(q2);
		String q3 = st.nextElement() + " " + q2 + " " + st.nextElement(); 
		System.out.println(q3);
		while (st.hasMoreElements()) {
			q3 = q3 + " " + st.nextElement();
		}

		return q3;

	}

}