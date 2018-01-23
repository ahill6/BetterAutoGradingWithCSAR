package tmpStorage.median;


//d43d32076778e9cb3a2aa237e806bc00b0eaffde5b75563c9321019a817607f8303e6b982bf49358787264ac38e22026f27bde7e67a87ba43b973c29442f9e93_000
public class medianJava216{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int int1,int int2,int int3){
    if ((int1 < int2 && int1 > int3) || (int1 > int2 && int1 < int3))
return int1;
    else if ((int2 < int3 && int2 > int1) || (int2 > int3 && int2 < int1))
return int2;
    else
return int3;
}
}
