package tmpStorage.median;


//97f6b15278788d90f6a0159ac65668f63f182fadf165e78bfecd7750de89f8611759f8d8206b3505407f7de14d124db7b0309a53e222c538c4dedadc6fa24fe6_008
public class medianJava152{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int median=-1;
if (a > b && a < c)
	median = a;
else if (a < b && a > c)
	median = a;
else if (b > a && b < c)
	median = b;
else if (b < a && b > c)
	median = b;
else if (c > a && c < b)
	median = c;
else if (c < a && c > b)
	median = c;
else if ((a == b) || (a == c))
	median = a;
else if (b == c)
	median = c;
return median;
}
}
