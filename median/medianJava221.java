package tmpStorage;
//e9c6206d3a4862876b0dead881ac55078f11e291f60215ab028651f06fcbee2a591a31a7727037774542df4fe051a89460d85f6067a0b9729ae86e4afe1e6e92_000
//d6364e6e98a5c96387950d5b3e6206ba9d57628ab2ad0f2cd05ea7af3b818ed03e514157fe4c64e264a0ac9df0840028e0c5a8fd3d096f5ab93bffba61f23812_007
public class medianJava221{
	public static void main(String[] args){
	median(new float[]{(float)1.0, (float)2.0, (float)3.0});
}

	public static float median(float[] data){
//
	float temp=0; //
	//
	while (!((data[1] <= data[2]) && (data[2] <= data[3]))) {//
		if(data[2] < data[1]) {
			temp=data[2];
			data[2]=data[1];
			data[1]=temp;
		} //
//
		if(data[3] < data[2]) {//
			temp=data[2];
			data[2]=data[3];
			data[3]=temp;
		}
	}
return data[2];
}
}