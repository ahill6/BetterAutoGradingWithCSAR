package tmpStorage.smallest;


//97f6b15278788d90f6a0159ac65668f63f182fadf165e78bfecd7750de89f8611759f8d8206b3505407f7de14d124db7b0309a53e222c538c4dedadc6fa24fe6_001
public class smallestJava127{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num1,int num2,int num3,int num4){
		int small;
		if (num1 < num2 && num1 < num3 && num1 < num4)
			small = num1;
		else if (num2 < num1 && num2 < num3 && num2 < num4)
			small = num2;
		else if (num3 < num1 && num3 < num2 && num3 < num4)
			small = num3;
		else
			small = num4;
		return small;
		}
	}
