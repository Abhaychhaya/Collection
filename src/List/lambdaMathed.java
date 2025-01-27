package List;

import java.util.ArrayList;

public class lambdaMathed {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		
		//1. using java 8 with for each loop and lambda expression:
		
		tvSeries.forEach(shows -> {
		System.out.println(shows);
		}
		);

	}

}
