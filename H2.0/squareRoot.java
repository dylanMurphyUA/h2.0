
public class squareRoot {
	private int source;
	private int guess;
	private int nextGuess;
	private int error;
	private int acceptableError;
	public squareRoot(int a, int b){
		source = a;
		acceptableError = b;
		guess = source/2;
		error = source - (guess*guess);
		guessCheck();
			
		
	}
	public void guessCheck(){
		if (error > acceptableError)
		{
			nextGuess = (guess+source)/guess;
			error = source - (nextGuess*nextGuess);
			guess = nextGuess;
			guessCheck();
		}
		else{
			return;
		}
	}
}
	

