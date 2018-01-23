package tmpStorage.grade;


//9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_009
public class gradeJava119{
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
return (char) grade;		
}
}
