package tmpStorage;
//f2997e14a460c6df0ed10aa9f6e792666e37d5c06a9a81445f14509e4a0113f59f5589ef37774dfea1f7d0ae9bb6c388e6eeb44e745e35f8511bbd4b82709d9a_000
//ee1f20ccded21df47f14019584a29968013d1e66c8df14c1564aff0d69f463c1897e93b7881fa6318cbf475b51e0cdd7523d748525fb5d64d376b88614d3fc92_006
public class smallestJava167{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num1,int num2,int num3,int num4){
  if(num1 < num2 && num1 < num3 && num1 < num4)
    {
      return num1;
    }
  else if(num2 < num1 && num2 < num3 && num2 < num4)
    {
      return num2;
	     }
      else if(num3 < num1 && num3 < num2 && num3 < num4)
	  return num3;
      else if(num4 < num1 && num4 < num2 && num4 < num3)
	  return num4;

		return -1;
}}
