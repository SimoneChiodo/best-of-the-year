package org.lessons.java.best_of_the_year;

import java.util.Random;

public class Movie {
  
  private int id;
  private String titolo;

  public Movie(){
    titolo = "";
  }

  public Movie(String titolo){
    id = newRandomId(99999);
    this.titolo = titolo;
  }

  //Getter & Setter
  public int getId(){
    return id;
  }

  public String getTitolo() {
    return titolo;
  }

  public void setTitolo(String titolo){
    // Initialize the ID
    if(id == 0)
      id = newRandomId(99999);

    this.titolo = titolo;
  }

  // To String
  @Override
  public String toString() {
    // If the ID is not initialized
    if(id == 0)
      return "Movie not found";
    
    return "ID del film: " + id + "; Nome del film: " + titolo;
  }

  // Functions
  private int newRandomId(int max){
    Random random = new Random();

    return random.nextInt(max + 1);
  }

}
