package com.example.cours_jsf.dto;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Named("superbowl")
@ApplicationScoped
public class SuperbowlBean {
    private String winner = "Los Angeles Rams";
    private static Map<String, String> superbowls;

    static {
        superbowls = new LinkedHashMap<String, String>();
        superbowls.put("LV", "Tampa Bay Buccaneers");
        superbowls.put("LIV", "Kansas City Chiefs");
        superbowls.put("LIII", "New England Patriots");
        superbowls.put("LII", "Philadelphia Eagles");
        superbowls.put("LI", "New England Patriots");
        superbowls.put("L", "Denver Broncos");
        superbowls.put("XLIX", "New England Patriots");
        superbowls.put("XLVIII", "Seattle Seahawks");
        superbowls.put("XLVII", "Baltimore Ravens");
        superbowls.put("XLVI", "New York Giants");
        superbowls.put("XLV", "Green Bay Packers");
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Map<String, String> getSuperbowls() {
        return superbowls;
    }

    public void setSuperbowls(Map<String, String> superbowls) {
        SuperbowlBean.superbowls = superbowls;
    }

    public void sbChanged(ValueChangeEvent event) {
        System.out.println("CHanges");
        this.winner = event.getNewValue().toString();
    }
}
