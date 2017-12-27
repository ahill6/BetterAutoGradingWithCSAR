package tmpStorage;
//9013bd3be8c00de447e6ed49a0fe0fab037251c28e26954bf780f2f3b929a9e7ce9da037811c76028e4069d3857410f82b8f399c7fa4386ea8f97f80aab1f191_000
//8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_002
public class gradeJava117{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float avg){
	if (avg >= A)
		 return 'A';
	if(avg >= B && avg< A)
		 return 'B';
	if(avg >= C && avg < B)
		 return 'C';
	if(avg >= D && avg<C){
		 return 'D';
	}
	if (avg<D){
		 return 'F';
	}
	return 0;
}
}
