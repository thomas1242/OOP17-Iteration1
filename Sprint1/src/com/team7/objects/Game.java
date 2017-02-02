package com.team7.objects;

import com.team7.objects.Map;
import com.team7.objects.Player;

/*
    The Game class is just inside of the boundary of our “model” (MVC paradigm).
    It keeps track of the Players, the Map, and watches for when a player is defeated, and facilitates gameplay.
*/
public class Game {
    //Array of Player objects representing the two players of the game
    private Player[] players = new Player[2];
    //The game map
    private Map map;
    //The turn number
    private int turn;
    /*Int value representing which player's turn it is.
    '0' means it is player 1's turn, '1' mean's it is player 2'*/
    private int currentPlayer;

    public Game(Player p1, Player p2) {
        players[0] = p1;
        players[1] = p2;
        turn = 0;
        currentPlayer = 0;
    }

    //Initializes the map, and runs the turns. Ends the game when a player is defeated
    public void startGame() {
        Map m = new Map();
        map = m;

        while (!players[0].isDefeated() && !players[1].isDefeated()) {
            //players[currentPlayer].takeTurn(); --TODO
            nextTurn();
        }

        endGame();
    }

    //Switches the turn to the next player
    public void nextTurn() {
        if (turn == 0) {
            turn = 1;
        } else {
            turn = 0;
        }
    }

    public void endGame() {
        /*   --TODO--
        Display a game over splash screen and exit the program, gunna wait unti the GUI is integrated
        to be able to do this. */
    }
}