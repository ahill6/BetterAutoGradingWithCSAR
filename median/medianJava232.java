package tmpStorage;
//fe9d5fb933c758c2cbbd859e3ecbd2d2eaecc2843b57cfd97da99af24de59f189a144d13ce81ec585d7c2f7367f70c0fb2aec8269eed1fd8380def614817ef7c_008
public class medianJava232{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int num1, int num2, int num3){
  int median, big, small;
  if( num1 >= num2 ){
    small = num2;
    big = num1;
  }
  else{
    big = num2;
    small = num1;
  }
  if( num3 >= big )
    median = big;
  else if( num3 <= small )
    median = small;
  else
    median = num3;
return median ;
}
}
