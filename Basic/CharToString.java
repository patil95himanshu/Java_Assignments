class CharToString
{
    public static String toString(char[] a)
    {
        String string = new String(a);
        return string;
    }
	
	public static void main(String args[])
    {
        char s[] = { 'g', 'o', 'o', 'd',
                     'm', 'o', 'r', 'n',
                     'i', 'n', 'g' };

        System.out.println(toString(s));
    }
}
