import java.io.*;


class Electricity 
	{
	
	public static void main(String args[]) throws IOException
		{
	double rate1=2.50; 	
	double rate2=3.00;	
	double rate3=3.50;	
	double rate4=4.50;	
	
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	double unit=Double.parseDouble(br.readLine());
	
	if(unit<=100)
	{
	double amt=rate1*unit;
	System.out.print("the amount is \n" +amt +"\n");	
	
	}
	if(unit<=200 && unit>=101)
	{
	double amt1=rate2*unit;
	System.out.print("the amount is \n" +amt1 +"\n");	
	}
	if(unit<=300 && unit>=201)
	{
	double amt2=rate3*unit;
	System.out.print("the amount is" +amt2 +"\n");	
	}
	if(unit<=400 && unit>=301)
	{
	double amt3=rate4*unit;
	System.out.print("the amount is" +amt3 +"\n");	
	}
	
	}
	}