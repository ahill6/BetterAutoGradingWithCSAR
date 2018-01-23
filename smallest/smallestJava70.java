package tmpStorage.smallest;


//75c98d3d90ca9a022bbf45421aa04a07f37da8a126811259bc4873e9458baab0a4863fa6664e5735c60172b34a16ed5acef892635f4f16e6d5737fb3685d0356_000
public class smallestJava70{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num1,int num2,int num3,int num4){
		int smallest=-1;
		if (num1<num2 && num1<num3 && num1<num4)
			smallest = num1;
		else if (num2<num1 && num2<num3 && num2<num4)
			smallest = num2;
		else if (num3<num1 && num3<num2 && num3<num4)
			smallest = num3;
		else if (num4<num1 && num4<num2 && num4<num3)
			smallest = num4;
		return smallest;
		}
	}
