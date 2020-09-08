/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import entities.Movie;

/**
 *
 * @author Sebastian
 */
public class MovieDTO {

    private int year;
    private String title;
    private String[] actors;

    public MovieDTO(Movie mov) {
        this.year = mov.getYear();
        this.title = mov.getTitle();
        this.actors = mov.getActors();
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MovieDTO{" + "year=" + year + ", title=" + title + ", actors=" + actors + '}';
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

}
