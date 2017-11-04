




import java.util.Scanner;






public class Students_of_Unipi {

    
    public static void main(String[] args) 
    {
        String x = "we are the students of the Department of Informatics.All students should know how to programm in Java and C";
       
        //Excersice 1. in the above string prints the substrings that starts with "department" and ends with "should know"
        int index1 = x.indexOf("Department");
        int index2 = x.indexOf("should know");
        String y = "should know";  
        
        String z=x.substring(index1, index2+y.length());
        System.out.println(z);
         
         
         
        //Excersise 2.count the numbers of "students" and prints it
         String s = "students";
         int count = 0;
         while(x.contains("students"))
         {
             count++;
             x=x.substring(x.indexOf("students")+s.length());
         }
        System.out.println("the number of students occurrences is:"+count);
        
        
    }
    
}
