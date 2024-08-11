import java.util.Scanner;
class boomcardtest{
     public static void main(String[] args) {
         boomcard bc = new boomcard(); 
         bc.set(1);
         bc.set("Which is India's capital?", 3);
      bc.set("Mumbai", "Bangalore", "New Delhi", "Goa");

      System.out.println(bc.getId() + "."+ bc.getQuestion());
      System.out.println("1. " + bc.getOption(1) + "\t2. " + bc.getOption(2));
      System.out.println("3. " + bc.getOption(3) + "\t4. " + bc.getOption(4));
      System.out.print("Enter the answer:- ");
      Scanner s=new Scanner(System.in);
      int ans=s.nextInt();
      bc.select(ans);
     }
}