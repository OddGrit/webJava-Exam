package grit.exam.task3;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private int number;
	private List<String> guesses = new ArrayList<String>();
	int range = 10;
	
	public Player(String name) {
		
		
		this.name = name;
		number = (int) Math.random() * range;
	}
	
	public List<String> getGuesses(){
		return guesses;
	}
	
	public boolean guess(String g) {
		guesses.add(g);
		return guesses.contains(g);
	}
	
	public int getNumberOfGuesses() {
		return guesses.size();
	}
	
	public void restart() {
		number = (int) Math.random() * range;
		guesses.clear();
	}
	
	public String getName() {
		return name;
	}
}
