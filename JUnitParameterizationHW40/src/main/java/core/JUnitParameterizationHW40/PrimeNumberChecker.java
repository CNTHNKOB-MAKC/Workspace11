package core.JUnitParameterizationHW40;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		
   }  
	
	public Boolean validate(final Integer primeNumber) {
              for (int i = 2; i <= (primeNumber / 2); i++) {
                     if (primeNumber % i == 0) {
                            return false;
                     }
              }
         return true;
	}

}
