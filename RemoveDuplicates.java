package week3.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "Paypal India";
		String[] str=text.split(" ");
		int length=str.length;
		System.out.println("Printing the string array");
		for(int i=0;i<length;i++)
		{
			System.out.println(str[i]);
		}
		
		List<String> values=new ArrayList<String>();
		
		for(String var:str)
		{
			values.add(var);
		}
		int size=values.size();
		
		System.out.println("Printing the string List");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(values.get(i));
		}
		
		Set<String> duplicate = new LinkedHashSet<String>(values);
        System.out.println(duplicate);
		
		
	}

}