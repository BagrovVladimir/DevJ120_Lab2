
package DevJ120_Lab2;

import java.util.ArrayList;
import java.util.Arrays;

public class StringService {
    
    public static String showArray(String [] sa) {
        String s;
        s= Arrays.toString(sa);
        return s;
    }
   
    public static String showArray(char [] c) {
        String s;
        s= Arrays.toString(c)+" ";
        return s;
    }
    
    public static String[] sort(String[] asMethod, boolean dirMethod) throws StringArrayException{  
        if(asMethod==null || asMethod.length==0) throw new StringArrayException("Array is null or empty");
        else {if (dirMethod)
             Arrays.sort(asMethod);
             else  {Arrays.sort(asMethod);
             int i=0;
             int j=asMethod.length-1;
             while (j>i) {
                 String tmp;
                 tmp=asMethod[j];
                 asMethod[j]=asMethod[i];
                 asMethod[i]=tmp;
                 i++;
                 j--;
               }
            }
        }
        return asMethod;
    }
    
    public static char [] getCharStat(String str){
        char [] cNull = new char[0];
        if (str==null || str.trim().isEmpty()) return cNull;
        else{
        char [] strToArr= str.toCharArray();
        
        ArrayList<Character> listChar= new ArrayList<>();
            for (int i = 0; i < strToArr.length; i++) {
              if (!listChar.contains(strToArr[i]))
                  listChar.add(strToArr[i]);        
        }
        System.out.println("Number of uniq element: "+listChar.size());

        char [] rezUniq = new char[listChar.size()];
        for (int i = 0; i < listChar.size(); i++) {
            rezUniq[i]= listChar.get(i);  
        }
        return rezUniq;}
    }
}
