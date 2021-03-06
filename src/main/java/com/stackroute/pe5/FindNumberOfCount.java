package com.stackroute.pe5;
/*Write a program to find the number of counts in the following String . Store the output in
Map< String ,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}*/

import java.util.regex.*;

public class FindNumberOfCount {
    public String findNumberOfCount(String input){
        if(input.isEmpty())
            return null;

        Pattern pattern1 = Pattern.compile("one");
        Matcher matcher1 = pattern1.matcher(input);
        String result = "";
        int one = 0;
        while ( matcher1.find() ){
                one++;
        }
        if(one>0){
            result=result+"one:"+one+",";
        }
        Pattern pattern2 = Pattern.compile("two");
        Matcher matcher2 = pattern2.matcher(input);
        int two = 0;
        while ( matcher2.find() ){
            two++;
        }
        if(two>0){
            result=result+"two:"+two+",";
        }
        Pattern pattern3 = Pattern.compile("three");
        Matcher matcher3 = pattern3.matcher(input);
        int three = 0;
        while ( matcher3.find() ){
            three++;
        }
        if(three>0){
            result=result+"three:"+three;
        }
        return result;
    }
}
