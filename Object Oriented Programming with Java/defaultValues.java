public class defaultValues
{
	int a;
	float b;
	boolean c;
	double d;
	byte e;
	long f;
	short g;
	char h;
	
	static int aa;
	static float bb;
	static boolean cc;
	static double dd;
	static byte ee;
	static long ff;
	static short gg;
	static char hh;
	
	public static void main(String args [])
	{
		System.out.println(defaultValues.aa);
		System.out.println(defaultValues.bb);
		System.out.println(defaultValues.cc);
		System.out.println(defaultValues.dd);
		System.out.println(defaultValues.ee);
		System.out.println(defaultValues.ff);
		System.out.println(defaultValues.gg);
		System.out.println(defaultValues.hh);
		
		defaultValues sc=new defaultValues();
		
		System.out.println(sc.a);
		System.out.println(sc.b);
		System.out.println(sc.c);
		System.out.println(sc.d);
		System.out.println(sc.e);
		System.out.println(sc.f);
		System.out.println(sc.g);
		System.out.println(sc.h);
			
			
	}
	
	
}
