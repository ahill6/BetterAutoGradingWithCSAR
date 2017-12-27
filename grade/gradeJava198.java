package tmpStorage;
//ca94e3756cbf8d1490bad660c06307f5d678e3675bbea85359523809a4f06b370066767ea2d2d76d270e4712b464924f12e19dbf1a12d28b75d367ceb202dbb9_000
//c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_004
public class gradeJava198{
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
	return 0;
}
}
