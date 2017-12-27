package tmpStorage;
//97f6b15278788d90f6a0159ac65668f63f182fadf165e78bfecd7750de89f8611759f8d8206b3505407f7de14d124db7b0309a53e222c538c4dedadc6fa24fe6_000
//95362737dcd262ddd67b0fe1381c25f1e6b885860b4e51efb6f57223dceb77b4c6c7d855e3fe891c10cd51b48c9b052cf2c74f181a28d3020d77a4a2d6e4db18_018
public class gradeJava142{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float score){
if (score >= a)
	 return 'A';
else if (score >= b)
	 return 'B';
else if (score >= c)
	 return 'C';
else if (score >= d)
	 return 'D';
return 0;
}
}
