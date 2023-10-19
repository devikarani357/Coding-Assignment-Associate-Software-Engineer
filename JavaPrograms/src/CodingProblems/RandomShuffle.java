package CodingProblems;
import java.util.*;
public class RandomShuffle {
	public static void main(String[] args)
	{
	    ArrayList<Integer>v= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
	    Collections.shuffle(v);
	    System.out.println(v);
	}
}
