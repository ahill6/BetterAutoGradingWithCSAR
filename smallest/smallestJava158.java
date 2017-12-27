package tmpStorage;
//d9e7eab5f82342d78fb20833701c4e9f900e8fcb737038d3a2ad18f664532af4d6332b7d14841c9ac773c52f6590b754f76df1f430a35bc8ca4799a767cdec6d_002
//d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_001
public class smallestJava158{
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
}
}
