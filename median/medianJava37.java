package tmpStorage;
//30074a0e036669b5681720e6481cc101877d52ee589bab434417ece22b4133ed584c6a84f80047c10ab47aa73a7807720b5375983e8b489e8e69978e5e0e8b71_000
//2c1556672751734adf9a561fbf88767c32224fca14a81e9d9c719f18d0b21765038acc16ecd8377f74d4f43e8c844538161d869605e3516cf797d0a6a59f1f8e_000
public class medianJava37{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int i1,int i2,int i3){
  if ((i1 >= i2 && i1 <= i3) || (i1 == i2 && i1 == i3) || (i1 > i2 && i1 < i3))
return i1;
  else if ((i2 >= i1 && i2 <= i3) || (i2 == i1 && i2 == i3) || (i2 > i1 && i2 < i3))
return i2;
  else if ((i3 >= i2 && i3 <= i1) || (i3 == i2 && i3 == i1) || (i3 > i2 && i3 < i1))
return i3;
return -1;
}
}
