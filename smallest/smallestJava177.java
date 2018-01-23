package tmpStorage.smallest;


//fe9d5fb933c758c2cbbd859e3ecbd2d2eaecc2843b57cfd97da99af24de59f189a144d13ce81ec585d7c2f7367f70c0fb2aec8269eed1fd8380def614817ef7c_006
public class smallestJava177{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num1,int num2,int num3,int num4){
		int min;
  min = num1;
  if( min > num2 )
    min = num2;
  if( min > num3 )
    min = num3;
  if( min > num4 )
    min = num4;
  return min;
}
}
