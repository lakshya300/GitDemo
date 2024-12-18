
public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "Rahul Shetty Academy";
		String s1 = "Rahul Shetty Academy";
		
		//new
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		String s = "Rahul Shetty Academy";
		String[] splittedstring = s.split(" ");
		//System.out.println(splittedstring[2].trim());
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
