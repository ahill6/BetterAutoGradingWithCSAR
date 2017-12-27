package tmpStorage;
//a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_012
//a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_011
public class gradeJava164{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float th_1,float th_2,float th_3,float th_4,float score){
if (score >= th_1){
 return 'A'; }
else
{ if (th_2 <= score && score < th_1){
 return 'B';}
else
{  if (th_3 <= score && score < th_2){
 return 'C';}
else {if (th_4 <= score && score < th_3){
  return 'D';}
else { if (score < th_4){
 return 'F';}
}}}}
return 'E';}
}
