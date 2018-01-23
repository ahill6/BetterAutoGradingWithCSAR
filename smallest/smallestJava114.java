package tmpStorage.smallest;


//8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_000
public class smallestJava114{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num1, int num2, int num3, int num4){
  int smallest=-1; //**/
  if (num1 < num2 && num1 < num3 && num1 < num4)
    smallest = num1;
  else
    if (num2 < num1 && num2 < num3 && num2 < num4)
      smallest = num2;
    else
      if (num3 < num1 && num3 < num2 && num3 < num4)
	smallest = num3;
      else
	if (num4 < num1 && num4 < num2 && num4 < num3)
	  smallest = num4;

	return smallest;
}}
