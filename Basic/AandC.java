class ac
{
double r;
void setData(double radius)
{
	r=radius;
}

void area()
{
	double Area = 3.14 * r * r;
	System.out.println("Area of Circle : "+Area);	
}
	
void circumference()
{
	double Circumference = 2 * 3.14 * r;
	System.out.println("Area of Circumference : "+Circumference);
}
}
public class Circle
{
	public static void main(String args [])
	{
		ac a = new ac();
		a.setData(5);
		a.area();
		a.circumference();
	}
			
} 
