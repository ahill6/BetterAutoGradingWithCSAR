package tmpStorage.grade;


//ca94e3756cbf8d1490bad660c06307f5d678e3675bbea85359523809a4f06b370066767ea2d2d76d270e4712b464924f12e19dbf1a12d28b75d367ceb202dbb9_005
public class gradeJava200{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float n1,float n2,float n3,float n4,float perc){
	if(perc >= n1)
		 return 'A';
	else if(perc >= n2 && perc < n1)
		 return 'B';
	else if(perc >= n3 && perc < n2)
		 return 'C';
	else if(perc >= n4 && perc < n3)
		 return 'D';
	else if(perc < n4)
		 return 'F';
	return (char) perc;
}
}
