package org.lessons.java.best_of_the_year.controllers;

import org.lessons.java.best_of_the_year.Movie;
import org.lessons.java.best_of_the_year.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

  // Index
  @GetMapping
  public String index(Model model) {
    model.addAttribute("nome", "Simone");

    return "index";
  }

  // Movies
  @GetMapping("/movies")
  public String movies(Model model) {
    String bestMovies = "Rambo," + "Inception," + "Memory";
    model.addAttribute("bestMovies", getBestMovies(bestMovies));

    return "movies";
  }

  // Songs
  @GetMapping("/songs")
  public String songs(Model model) {
    String bestSongs = "Basket Case," + "Enter Sandman," + "Paranoid";
    model.addAttribute("bestSongs", getBestSongs(bestSongs));

    return "songs";
  }
  

  // Functions
  private Movie[] getBestMovies(String titoli){
    String[] titoliSeparati = titoli.split(",");
    Movie[] moviesList = new Movie[titoliSeparati.length];

    for (int i = 0; i < titoliSeparati.length; i++) {
      moviesList[i] = new Movie(titoliSeparati[i]);
    }

    return moviesList;
  }

  private Song[] getBestSongs(String canzoni){
    String[] titoliSeparati = canzoni.split(",");
    Song[] songsList = new Song[titoliSeparati.length];

    for (int i = 0; i < titoliSeparati.length; i++) {
      songsList[i] = new Song(titoliSeparati[i]);
    }

    return songsList;
  }

}
