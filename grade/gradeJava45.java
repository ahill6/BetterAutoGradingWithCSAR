package tmpStorage;
//36d8008b13f6475ca8fa4553fea10042b0a6c623665065672051445c3464d61b29b47cb66321844a0264505a0f5ccf5aa6de072aa266b5a8b0cf13198380a389_000
//317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_007
public class gradeJava45{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float s){	
  if (s>=a)
     return 'A';
  else if (s>=b)
     return 'B';
  else if (s>=c)
     return 'C';
  else if (s>=d)
     return 'D';
  else
     return 'F';
}
}
