package com._13pylons;

import java.util.ArrayList;

public class Team<T extends Player> { // Identify type param
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    // When instantiated java will replace the 'T' with the class
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) { // Changed to 'T' for type checking here too
        if(members.contains(player)) {
            // Cast to (Player)
            System.out.println(player.getName() + " is already on the team,");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            won++;
        } else if(ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
