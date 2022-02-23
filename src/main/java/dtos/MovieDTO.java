/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class MovieDTO {
    private long id;
    private String title;
    private String year;
    private String[] actors;
    
    public static List<MovieDTO> getDtos(List<Movie> ms){
        List<MovieDTO> mdtos = new ArrayList();
        ms.forEach(m->mdtos.add(new MovieDTO(m)));
        return mdtos;
    }

    public MovieDTO(long id) {
        this.id = id;
    }

    public MovieDTO(Movie m) {
        if(m.getId() != null)
            this.id = m.getId();
        this.title = m.getTitle();
        this.year = m.getYear();
        this.actors = m.getActors();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }
}
