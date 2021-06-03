class SingleInhArea
 {
 int length;
 int breadth;
 }

 public class GetRectangleSingle extends SingleInhArea{

 int area;

 public void TotalArea()
 {
 area = length*breadth;
 }
 
 public static void main(String args[])
 {
 GetRectangleSingle gr = new GetRectangleSingle();

 gr.length = 18;
 gr.breadth = 12;

 gr.TotalArea();
 System.out.println("The Area of your Rectangle is: " + gr.area);
 }
 }
