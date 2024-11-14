// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = (Double.parseDouble(args[1]))/100;
		double n = Double.parseDouble(args[2]);
		double futureValue = currentValue * Math.pow((1+rate), n);
		System.out.println("After "+ (int)n + " years, a $" +  currentValue+ " saved at "+ (rate*100) + "% will yield $"+ ((int)futureValue));	
	}
}