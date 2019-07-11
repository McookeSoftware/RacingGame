/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerace;

/**
 *
 * @author matthew cooke
 */
class SeasonContext {

    Season season;

    public SeasonContext() {
        this.season = new Summer();

    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void nextSeason() {
        this.season.nextSeason(this);

    }

}
