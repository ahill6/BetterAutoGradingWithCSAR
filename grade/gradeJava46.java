package tmpStorage.grade;


//36d8008b13f6475ca8fa4553fea10042b0a6c623665065672051445c3464d61b29b47cb66321844a0264505a0f5ccf5aa6de072aa266b5a8b0cf13198380a389_000
public class gradeJava46{
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
