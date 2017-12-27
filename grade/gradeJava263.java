package tmpStorage;
//fe9d5fb933c758c2cbbd859e3ecbd2d2eaecc2843b57cfd97da99af24de59f189a144d13ce81ec585d7c2f7367f70c0fb2aec8269eed1fd8380def614817ef7c_001
//fe9d5fb933c758c2cbbd859e3ecbd2d2eaecc2843b57cfd97da99af24de59f189a144d13ce81ec585d7c2f7367f70c0fb2aec8269eed1fd8380def614817ef7c_000
public class gradeJava263{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float grade1,float grade2,float grade3,float grade4,float score){
  if( score >= grade1 )
     return 'A';
  else if( score >= grade2 && score < grade1 )
     return 'B';
  else if( score >= grade3 && score < grade2 )
     return 'C';
  else if( score >= grade4 && score < grade3 )
     return 'D';
  else
     return 'F';
}
}
