public class StringDemo
{
  public static void main(String[] args)
  {

String str1 = "Himanshu ";
String str2 = "Patil";
String str3 = "GotVaccinated";
String str4 ="Got";
String str5= "Vaccinated";

String str6= str1.concat(str2);
System.out.println(str6);


String str7= str1+" "+str2+" "+str4+" " +str5;
System.out.println(str7);
 

System.out.println("Length of String: " + str3.length());
System.out.println("Index of character 'V': " + str3.indexOf('V'));
System.out.println("Character at position 5: " + str3.charAt(5));
System.out.println("Contains sequence 'ted': " + str3.contains("ted"));
System.out.println("EndsWith character 'd': " + str3.endsWith("d"));
  }
}
