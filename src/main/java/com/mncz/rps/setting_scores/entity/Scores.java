package com.mncz.rps.setting_scores.entity;

public class Scores {

    public int wins;
    public int loses;
    public int ties;

    public Scores() {
    }

    public Scores(int wins, int loses, int ties) {
        this.wins = wins;
        this.loses = loses;
        this.ties = ties;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

}
