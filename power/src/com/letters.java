package com;

public class letters {
	public static String[] ones = { "", "one", "two", "three", "four", "five",
		    "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
		    "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
		    "eighteen", "nineteen" };

		public static String[] tens = { "", "ten", "twenty", "thirty", "forty",
		    "fifty", "sixty", "seventy", "eighty", "ninety" };

		public static String[] hundreds = { "", "onehundred", "twohundred",
		    "threehundred", "fourhundred", "fivehundred", "sixhundred",
		    "sevenhundred", "eighthundred", "ninehundred", "oneThousand" };

		public static void main(String[] args) {
		    System.out.println("total no of letters="+run());
		}

		public static String run() {
		    int sum = 0;
		    for (int i = 1; i <= 1000; i++)
		        sum += convertToWord(i).length();
		    return Integer.toString(sum);
		}

		public static String convertToWord(int n) {
		    int unit=n%10;
		    int tensdivide = (n / 10)%10;
		    int hundreadsdivide = n / 100;
		    int hundredModulo=n%100;
		    if (n <= 19) {
		        return ones[n];
		    } else if (n < 100 && n > 19) {
		        return tens[tensdivide] + ones[unit];
		    } else {
		       
		        if(hundredModulo == 0){
		                return hundreds[hundreadsdivide] +tens[tensdivide] + ones[unit];
		        }else if (hundredModulo <20) {
		            return hundreds[hundreadsdivide] +"and" + ones[hundredModulo];
		        }else{
		           
		            return hundreds[hundreadsdivide] +"and" +tens[tensdivide] + ones[unit];
		        }

		    }
		    
		    }
}
