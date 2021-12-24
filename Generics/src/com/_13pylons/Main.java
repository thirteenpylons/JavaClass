package com._13pylons;

import com.sun.source.tree.Scope;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Assign the data type of the ArrayList
        ArrayList<Integer> items = new ArrayList<>(); // type doesn't have to be defined second time(Java8+)
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println(i * 2);
        }

        /**
         ** Start Sports section
         **/
        FootballPlayer bob = new FootballPlayer("Bob");
        BaseballPlayer jerry = new BaseballPlayer("Jerry");
        SoccerPlayer phil = new SoccerPlayer("Phil");

        Team<FootballPlayer> gratefulDead = new Team<>("Grateful Dead");
        gratefulDead.addPlayer(bob);
//        gratefulDead.addPlayer(jerry);
//        gratefulDead.addPlayer(phil);

        Team<BaseballPlayer> baseballTeam = new Team<>("The Dudes");
        baseballTeam.addPlayer(jerry);

        Team<SoccerPlayer> soccerTeam = new Team<>("Socks");

        System.out.println(gratefulDead.numPlayers());

    }
}
