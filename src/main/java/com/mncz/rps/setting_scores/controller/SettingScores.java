package com.mncz.rps.setting_scores.controller;

import com.mncz.rps.setting_scores.entity.Scores;
import org.springframework.web.bind.annotation.*;

@RestController
public class SettingScores {
    static Scores scores = new Scores(0,0,0);

    @GetMapping("/scores")
    public Scores getScores(){
        return scores;
    }

    @GetMapping("/scores/{winslossesortie}")
    public int getWinsLossesOrTie(@PathVariable String winslossesortie){
        if (winslossesortie.equalsIgnoreCase("wins")){
            return scores.getWins();
        }
        else if (winslossesortie.equalsIgnoreCase("loses")){
            return scores.getLoses();
        }

        else if (winslossesortie.equalsIgnoreCase("ties")){
            return scores.getTies();
        }
        return 0;
    }

    @PostMapping("/scores/{increasewinslosesortie}")
    public int increseWinsLosesOrTies(@PathVariable String increasewinslosesortie){
        if (increasewinslosesortie.equalsIgnoreCase("wins")){
            return scores.wins++;
        }
        else if (increasewinslosesortie.equalsIgnoreCase("loses")){
            return scores.loses++;
        }

        else if (increasewinslosesortie.equalsIgnoreCase("ties")){
            return scores.ties++;
        }
        return 0;
    }

    @PatchMapping("/scores/{winslossesortie}")
    public Scores updateWinsLosesOrTies(@PathVariable String winslossesortie,@RequestParam(name = "new-value")int newValue){
        if (winslossesortie.equalsIgnoreCase("wins")){
            scores.wins = newValue;
            return scores;
        }
        else if (winslossesortie.equalsIgnoreCase("loses")){
            scores.loses = newValue;
            return scores;
        }
        else if (winslossesortie.equalsIgnoreCase("ties")){
            scores.ties = newValue;
            return scores;
        }
        return scores;
    }

    @PutMapping("/scores")
    public Scores replaceScore(@RequestBody Scores newScore){
        scores = newScore;
        return scores;
    }

    @DeleteMapping("/scores")
    public void deleteScore(){
        scores = null;
    }

//    @GetMapping("/scores/wins")
//    public int getWins(){
//        return scores.getWins();
//    }
//
//    @GetMapping("/scores/loses")
//    public int getLoses(){
//        return scores.getLoses();
//    }
//
//    @GetMapping("/scores/ties")
//    public int getTies(){
//        return scores.getTies();
//    }
}
