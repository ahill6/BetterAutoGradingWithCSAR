package tmpStorage.smallest;


//98d873cde39437ae581e6b61ce30ca54634c9c1517b46a0f2774cb12db474b5a37759281b19283c60dbcfa44ac3e05d474a896310f64e8533603b1db73457494_001
public class smallestJava131{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num1,int num2,int num3,int num4){
		int small=-1;
  if(num1 < num2 && num1 < num3 && num1 < num4)
    small = num1;
  else if(num2 < num1 && num2 < num3 && num2 < num4)
    small = num2;
  else if(num3 < num1 && num3 < num2 && num3 < num4)
    small = num3;
  else if(num4 < num1 && num4 < num2 && num4 < num3)
    small = num4;

	return small;
}
}
