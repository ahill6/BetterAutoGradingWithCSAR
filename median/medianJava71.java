package tmpStorage;
//593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_003
//593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_002
public class medianJava71{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int num1,int num2,int num3){
int median=-1;
  if((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3))
    median = num1;
  else if((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3))
    median = num2;
  else if((num3 > num1 && num3 < num2) || (num3 < num1 && num3 > num2))
    median = num3;
return median;
}
}
