//import java
import java.util.*;
class bca
 {
    int sem=3;
    int roll = 28;
    
    void bca1(){

    }
 }
class MCA extends bca
{
    // int sem1=5;
    static Scanner sc= new Scanner (System.in);
    String a =sc.nextLine();

     int roll1=23217;
      int pass_bca= sc.nextInt();
      int pass_mca=pass_bca+2;
      

}
class Main extends MCA{
     public static void ts(){
     System.out.println("enter your roll:");
      int r=sc.nextInt();
      Main roll2=new Main();
      System.out.println("students after you:");
      System.out.println(roll2.roll1-r);
      
      
   }
public static void main (String[] args)
{
   Main sweta = new Main();
   System.out.println("Sweta Studying in " + sweta.sem + "rd bearing college roll number " + sweta.roll );
   switch (sweta.a){
  case ("yes"):
   System.out.println("student will enter MCA in the year"+ sweta.pass_bca);
   System.out.println("student will complete MCA in the year"+ sweta.pass_mca);
   System.out.println("Please enter your bca marks in % : ");
   double marks =sc.nextDouble();
   if (marks >= 60.00){
      System.out.println("You can join MCA \n Fill more details of the student: ");
   }
   else {
      System.out.println("sorry you are not eligible");
   }
   
   }
}
      
}
