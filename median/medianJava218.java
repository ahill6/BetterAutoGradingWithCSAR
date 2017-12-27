package tmpStorage;
//d6364e6e98a5c96387950d5b3e6206ba9d57628ab2ad0f2cd05ea7af3b818ed03e514157fe4c64e264a0ac9df0840028e0c5a8fd3d096f5ab93bffba61f23812_005
//d4aae191327d63b5ebc388f4bdbdaaf670e3332ea6afc5be3f04cca42334a4b6fe038630379bb774135a21197172563cf1b684c6ae927cce50b06340048b132a_002
public class medianJava218{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
	if ((a > b) && (b > c))		
return b;
	if ((a > b) && (a > c))
	{
		if (c > b)
		{
return c;
		}
	}
	if ((b > a) && (a > c))
return a;
	if ((b > a) && (b > c))
	{
		if (c > a)
		{
return c;
		}
	}
        if ((c > a) && ( a > b))
return a;
        if ((c > a) && (c > b))
	{
                if (b > a)
		{
return b;
		}
	}
	if (a == b)
		{
return b;
		}
	else if (a == c)
		{
return c;
		}
	else if (b == c)
		{
return b;
		}
return -1;
}
}
