package tmpStorage.smallest;


//d9e7eab5f82342d78fb20833701c4e9f900e8fcb737038d3a2ad18f664532af4d6332b7d14841c9ac773c52f6590b754f76df1f430a35bc8ca4799a767cdec6d_014
public class smallestJava160{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int one, int two, int three, int four){
    int small;
    int smaller;
    int smallest;
    if (one <= two)
       small = one;
    else
       small = two;
    if (small <= three)
       smaller = small;
    else
       smaller = three;
    if (smaller <= four)
       smallest = smaller;
    else
       smallest = four;
    return smallest;
}}
