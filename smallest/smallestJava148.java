package tmpStorage.smallest;


//c868b30a4adebf62b0ed20170a14ee9e5f8bc62d827e9712294ffa4a10ab8423e3d903c29e2392c83963972019a470e667c1987e2547294d1e2d1df1db832912_002
public class smallestJava148{
	public static void main(String[] args){
	smallest(new int[]{1,2,3,4});
}

	public static int smallest(int[] numbers){
  int x, i, smallest, j, k, temp;
  for (k = 3; k > 0; k--)
  {		
    for (j = 1; j <= k; j++)
    {
      if (numbers[j-1] > numbers[j])
      {
        temp = numbers[j-1];
        numbers[j-1] = numbers[j];
        numbers[j] = temp;
      }
    }
  }
  smallest = numbers[0];
  return smallest;
}
}
