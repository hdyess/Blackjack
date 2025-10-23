package com.pluralsight;

public class Player {

	private Hand playerHand;
	private int playerCardsValue;
	private double playerCash;

	public String playerName;
	public double playerBet;
	public boolean playerBust;
	public Boolean humanAgent;


	// inits player at start of turn
	public Player(boolean isHumanAgent, String playerName) {

		this.playerCash = 200;
		this.playerName = playerName;
		this.playerBust = false;
		this.humanAgent = isHumanAgent;

	}

	public void deal(Card cardToDeal) {
		this.playerHand.deal(cardToDeal);
	}

	public Hand getPlayerHand() {
		return playerHand;
	}
}