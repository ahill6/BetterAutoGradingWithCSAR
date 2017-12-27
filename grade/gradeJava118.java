package tmpStorage;
//9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_009
//9013bd3be8c00de447e6ed49a0fe0fab037251c28e26954bf780f2f3b929a9e7ce9da037811c76028e4069d3857410f82b8f399c7fa4386ea8f97f80aab1f191_000
public class gradeJava118{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float grade){
   if (grade>=A)
         return 'A';
   else if (grade>=B && grade<=A)
         return 'B';
   else if (grade>=C && grade<=B)
         return 'C';
   else if (grade>=D && grade<=C)
         return 'D';
   else if (grade<D)
         return 'F';
return 0;		
}
}
