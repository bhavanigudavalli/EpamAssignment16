package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

 public class CheckifPalindrome{
	   public static void main(String args[]){
	       String[] strArray = {"ant","pineapple","reviver","palindrome","refer"};
	       List<String> sList = Arrays.asList(strArray);
	       List<String> resList = getPalindromeList(sList);
	      System.out.println(resList);
	    }
	   public static List<String> getPalindromeList(List<String> list){
	        ListIterator<String> iterator = list.listIterator();
	        List<String> result = new ArrayList<>();
	        while(iterator.hasNext()){
	            String s = iterator.next();
	            if(isPalindrome(s)){
	               result.add(s);
	             }
	           }
	       return result;
	     }
	  public static boolean isPalindrome(String s) {
	      int p=0,q=s.length()-1;
	      while(p<q){
	          if(s.charAt(p) != s.charAt(q)){
	          return false;
	      }
	     p++;
	     q--;
	   }
	   return true;
	 }
	}

