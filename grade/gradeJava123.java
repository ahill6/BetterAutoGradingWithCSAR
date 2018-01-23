package tmpStorage.grade;


//9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_018
public class gradeJava123{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0, 5.0);
}

	public static char grade(double A, double B, double C, double D, double grade){
   if (grade>=A)
         return 'A';
   else if (grade>=B && grade<A)
         return 'B';
   else if (grade>=C && grade<B)
         return 'C';
   else if (grade>=D && grade<C)
         return 'D';
   else if (grade<D)
         return 'F';
return (char) grade;
}
}
