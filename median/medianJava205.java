package tmpStorage;
//d009aa71ece41454c68d8038b5462d8eea8feb291bce1d53ee149f8477b5eab62ee28c7f690bf14dc6ce1d70c8943f7f3b3e4300965cb24da4cd2d2807dab19a_000
//cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_021
public class medianJava205{
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
