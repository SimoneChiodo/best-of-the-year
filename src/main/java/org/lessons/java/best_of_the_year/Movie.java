package org.lessons.java.best_of_the_year;

import java.util.Random;

public class Movie {
  
  private int id;
  private String titolo;

  public Movie(){
    id = newRandomId(99999);
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
    this.titolo = titolo;
  }

  // To String
  @Override
  public String toString() {
      return "ID del film: " + id + "; Nome del film: " + titolo;
  }

  // Functions
  private int newRandomId(int max){
    Random random = new Random();

    return random.nextInt(max + 1);
  }

}
