package service;
public class PersonalityCalculator{
	public String findYourBrainType(String options){
		int [] a=  findAnswers(options);
		int A=a[0]+a[1]+a[2]+a[4]+a[7]+a[9]+a[10]+a[11]+a[13]+a[17]+a[19];
		int B=a[3]+a[5]+a[6]+a[8]+a[12]+a[14]+a[15]+a[16]+a[18];
		int output=66-A+B;
		if(output>=20 && output<=55)
		{
			return "leftbrained";
		}
		else if(output>=56 && output<=64)
		{
			return "No clear preference";
		}
		else {
			return "rightbrained";
		}
	
	}
	
public int [] findAnswers( String options){
	   int[] arr1=new int [20];
	   String[] arr2=options.split(",");
	  for(int i=0;i<arr2.length;i++)
	  {
		      arr1[i]=Integer.parseInt(arr2[i]);
	  }
	return arr1;
}
}