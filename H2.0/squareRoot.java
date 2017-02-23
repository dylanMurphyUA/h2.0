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
		guessCheck();
			
		
	}
	public void guessCheck(){
		if (error > acceptableError)
		{
			nextGuess = 0.5*(guess+(source/guess));
			error = Math.abs(source - (nextGuess*nextGuess));
			nextGuess = guess;
			guessCheck();
		}
		else{
			System.out.print(guess);
			return;
		}
	}
	public static void main(String []args){
		new squareRoot(64, 0);
		
	}
}
	

