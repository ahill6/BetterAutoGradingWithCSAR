package tmpStorage.median;


//d4aae191327d63b5ebc388f4bdbdaaf670e3332ea6afc5be3f04cca42334a4b6fe038630379bb774135a21197172563cf1b684c6ae927cce50b06340048b132a_000
public class medianJava217{
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
return -1;
}
}
