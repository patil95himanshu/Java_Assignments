import java.util.*;
public class AddTwoInteger
{   
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
	   System.out.println("1. Addition By Using While Loop ");
       System.out.println("2. Addition By Using For Loop ");
       System.out.println("3. Addition By Using Parameterized Constructor");
       System.out.println("4. Addition By Using Static Method");
       System.out.println("5. Addition By Using Non-Static Method");
       
      
       System.out.print("Enter any from above :");
       int choice = sc.nextInt();

       System.out.print("Enter First Number : "); 
       int firstNo = sc.nextInt();

       System.out.print("Enter Second Number : "); 
       int secondNo = sc.nextInt();
        
       int total=0;
       AddTwoIntegerVar add = new AddTwoIntegerVar();

       switch(choice)
       {
         case 1: add.usingWhile(firstNo, secondNo);
          break;

         case 2: add.usingFor(firstNo, secondNo);
          break;

         case 3: AddTwoIntegerVar addp = new AddTwoIntegerVar(firstNo, secondNo);
                 System.out.print("Addition by using Parameterized Constructor : "+addp.result); 
          break;

         case 4: total = AddTwoIntegerVar.usingStaticMethod(firstNo, secondNo);
                 System.out.print("Addition by using Static Method : "+total);
          break;

         case 5: total = add.usinNonStaticMethod(firstNo, secondNo);
                 System.out.print("Addition by using Static Method : "+total);
          break;

          default : System.out.print("Please enter Valid choice :");
       }
   }
}

class AddTwoIntegerVar{
   int result =0;

   AddTwoIntegerVar()
   {
     
   }

   AddTwoIntegerVar(int num1, int num2)
   {
     result = num1 + num2;
   }

   public void usingWhile(int num1, int num2)
   {
     System.out.println("["+num1+" + "+num2+"]");
     while(num1-- != 0)
     {
      num2++;
     }
     System.out.print("Addition by using While Loop is :"+ num2);
   }

   public void usingFor(int num1, int num2)
   {
     System.out.println("["+num1+" + "+num2+"]");
     for(int i=num1; i!=0 ;i--)
     {
      num2++;
     }
     System.out.print("Addition by using For Loop is :"+ num2);
   }

   static int usingStaticMethod(int x,int y)
   {
     return x+y;
   }

   public int usinNonStaticMethod(int x,int y)
   {
     result =  x+y;
     return result;
   }

   
}
