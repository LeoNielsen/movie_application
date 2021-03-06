/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.MovieDTO;
import entities.Movie;

import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        Facade fe = Facade.getFacadeExample(emf);
        fe.create(new MovieDTO(new Movie("Top Gun", "1966", new String[]{"Tom", "Jim"})));
        fe.create(new MovieDTO(new Movie("Titanic", "1966", new String[]{"Tom", "Jim"})));
        fe.create(new MovieDTO(new Movie("James Bond", "1966", new String[]{"Tom", "Jim"})));
    }
    
    public static void main(String[] args) {
        populate();
    }
}
