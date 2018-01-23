package tmpStorage.grade;


//75c98d3d90ca9a022bbf45421aa04a07f37da8a126811259bc4873e9458baab0a4863fa6664e5735c60172b34a16ed5acef892635f4f16e6d5737fb3685d0356_009
public class gradeJava100{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float grade){		
if (grade < D)
	 return 'F';
else if (grade < C)
	 return 'D';
else if (grade < B)
	 return 'C';
else if (grade < A)
	 return 'B';
else
	 return 'A';
}
}
