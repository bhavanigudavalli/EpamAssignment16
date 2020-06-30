package package1;

import java.util.*;
public class AvgOfInt {
     public static void main(String args[]){
          Integer[] list = {1,2,3,4,5,6,7,8,9};
          List<Integer> listNum = Arrays.asList(list);
          double averageRes = average(listNum);
          System.out.println(averageRes);
      }

     private static double average(List<Integer> listNum) {
         return listNum.stream().mapToInt(i -> i).average().getAsDouble();
      }
   }
