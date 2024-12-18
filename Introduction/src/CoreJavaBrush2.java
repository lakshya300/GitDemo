import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CoreJavaBrush2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,4,5,6,7,9,10,11,122};
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] % 2 == 0)
			{
			//	System.out.println(arr2[i]);
				break;
			}
			else
			{
			//	System.out.println(arr2[i]+" is not a multiple of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList();
		a.add("rahul");
		a.add("lakshman");
		a.add("Babu");
		a.add("Laksh");
		//System.out.println(a.get(2));
		
		for(int i = 0;i<a.size();i++)
		{
		//	System.out.println(a.get(i));
		}
		
		for( String val :a)
		{
		//	System.out.println(val);
		}
		//System.out.println(a.contains("rahul"));
		
		
		String[] name = {"Rahul","Vasu","Chakku"};
		List<String> nameArrList = Arrays.asList(name);
		System.out.println(nameArrList.contains("Rahul"));

	}

}
