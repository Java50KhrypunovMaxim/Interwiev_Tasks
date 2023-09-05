package telran.tasks.home;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class InterviewTasks {

	static public void displayShuffled(int[] ar) {
		int[] shuffledArray = new Random().ints(0, ar.length)
				.distinct().limit(ar.length).map(i -> ar[i]).toArray();

		System.out.println(Arrays.toString(shuffledArray));
	}

	

}
