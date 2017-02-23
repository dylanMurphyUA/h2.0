import java.lang.Math;
public class squareRoot {
	private double source;
	private double guess;
	private double nextGuess;
	private double error;
	private double acceptableError;
	public squareRoot(int a, int b){
		source = a;
		acceptableError = b;
		guess = source/2;
		error = Math.abs(source - (guess*guess));
		newGuess(guess);
			
		
	}
	public boolean newGuess(double i){
		if (error <= acceptableError)
		{
			System.out.print(guess);
			return true;
		}
		else{
			
			nextGuess = 0.5*(i+(source/i));
			error = Math.abs(source - (nextGuess*nextGuess));
			newGuess(nextGuess);
			return false;
		}
	}
	public static void main(String []args){
		new squareRoot(64, 0);
		
	}
}
	

