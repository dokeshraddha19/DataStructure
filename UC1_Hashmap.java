package datstructure;
import java.util.LinkedHashMap;
import java.util.stream.*;
import java.util.*;
public class UC1_Hashmap {
	
	public static void main(String[] args) {
		MyMapNode();
		
		
		
	 
	}
 static void  MyMapNode() {
	LinkedHashMap<String,Integer> MyMapNode=new LinkedHashMap<>();
	
		 String s="To be or not to be";
			String[] words=s.split(" ");
			for (String word:words) {
				Integer integer= MyMapNode.get(word);
				if(integer==null) {
					MyMapNode.put(word,1);
				}else {
					MyMapNode.put(word,integer + 1);
				}
			}
			System.out.println(MyMapNode);
	}
}
	
	
		
	
	
		
	
		
	
