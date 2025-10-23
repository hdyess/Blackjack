package com.pluralsight;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<>();
		int numberOfPlayers = ConsoleHelper.promptForInt("How many players?");

		for (int i = 1; i <= numberOfPlayers; i++) {
				Player p = new Player(false, ConsoleHelper.promptForString("Name for player" + i + ": "));
				players.add(p);
		}

		Deck deck = new Deck();
		deck.shuffle();

		for (Player p : players) {
			p.getPlayerHand().deal(deck.deal());
			p.getPlayerHand().deal(deck.deal());
		}

		



	}


}
