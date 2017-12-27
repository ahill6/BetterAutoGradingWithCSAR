package tmpStorage;
//346b1d3c1cdc3032d07222a8a5e0027a2abf95bb1697b9d367d7cca7db1af769d8298e232c56471a122f05e87e79f4bd965855c9c0f8b173ebc0ef5d0abebc7b_005
//346b1d3c1cdc3032d07222a8a5e0027a2abf95bb1697b9d367d7cca7db1af769d8298e232c56471a122f05e87e79f4bd965855c9c0f8b173ebc0ef5d0abebc7b_004
public class smallestJava31{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int num_1, int num_2, int num_3, int num_4){
		int a, b, c, d;
		a = (num_1);
		b = (num_2);
		c = (num_3);
		d = (num_4);
		if (a<=b && a<=c && a<=d)
			return a;
		else if (b<=a && b<=c && b<=d)
			return b;
		else if (c<=a && c<=b && c<=d)
			return c;
		else if (d<=a && d<=b && d<=c)
			return d;
	return -1;
	}
}
