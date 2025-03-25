package org.lessons.java.best_of_the_year.controllers;

import org.lessons.java.best_of_the_year.Movie;
import org.lessons.java.best_of_the_year.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*
 * TODO:
 * - prelevare l'id a riga 44 e 65, nei metodi "movieDetail" e "songDetail"
 * 
 */

@Controller
@RequestMapping("/")
public class HomeController {
  // Create TESTING VARIABLES
  String bestMoviesList = "Rambo," + "Inception," + "Memory";
  Movie[] bestMovies = getBestMovies(bestMoviesList);
  
  String bestSongsList = "Basket Case," + "Enter Sandman," + "Paranoid";
  Song[] bestSongs = getBestSongs(bestSongsList);

  // Index
  @GetMapping
  public String index(Model model) {
    model.addAttribute("nome", "Simone");

    return "index";
  }

  // Movies
  @GetMapping("/movies")
  public String movies(Model model) {
    model.addAttribute("bestMovies", bestMovies);

    return "movies";
  }

  // Movie Details
  @GetMapping("/movies/{id}")
  public String movieDetail(@PathVariable int id, Model model) {
    // Get the specific movie
    Movie specificMovie = new Movie();
    for (Movie movie : bestMovies) {
      if(movie.getId() == id)
        specificMovie = movie;
    }
    model.addAttribute("movie", specificMovie);

    return "moviesDetail";
  }

  // Songs
  @GetMapping("/songs")
  public String songs(Model model) {
    model.addAttribute("bestSongs", bestSongs);

    return "songs";
  }

  // Song Details
  @GetMapping("/songs/{id}")
  public String songDetail(@PathVariable int id, Model model) {
    // Get the specific song
    Song specificSong = new Song();
    for (Song song : bestSongs) {
      if(song.getId() == id)
        specificSong = song;
    }
    model.addAttribute("song", specificSong);

    return "songsDetail";
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
