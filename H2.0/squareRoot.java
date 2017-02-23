import java.lang.Math;
public class squareRoot {
	private double source;
	private double guess;
	private double nextGuess;
	private double error;
	private double acceptableError;
	public squareRoot(double a, double b){
		source = a;
		acceptableError = b;
		guess = source/2;
		error = Math.abs(source - (guess*guess));
		newGuess(guess);
			
		
	}
	public void newGuess(double i){
		System.out.println("...");
		if (error <= acceptableError)
		{
			System.out.print(nextGuess);
			return;
		}
		else
		{
			System.out.println("nextGuess:"+ nextGuess);
			System.out.println("error:"+ error);
			nextGuess = 0.5*(i+(source/i));
			error = Math.abs(source - (nextGuess*nextGuess));
			newGuess(nextGuess);
			
		}
	}
	public static void main(String []args){
		new squareRoot(244.12, 0.00002);
		
	}
}
	

