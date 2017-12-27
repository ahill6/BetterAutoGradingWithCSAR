package tmpStorage;
//cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_018
//cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_017
public class medianJava201{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int num1,int num2,int num3){
int median=-1;
if((num1<num2&&num1>num3)||(num1>num2&&num1<num3))
median=num1;
else if ((num2<num1&&num2>num3)||(num2>num1&&num2<num3))
median=num2;
else
median=num3;
return median;
}
}
