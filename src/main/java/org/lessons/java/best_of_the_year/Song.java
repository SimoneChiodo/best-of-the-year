package org.lessons.java.best_of_the_year;

import java.util.Random;

public class Song {
  
  private int id;
  private String titolo;

  public Song(){
    id = newRandomId(99999);
    titolo = "";
  }

  public Song(String titolo){
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
      return "ID della canzone: " + id + "; Nome della canzone: " + titolo;
  }

  // Functions
  private int newRandomId(int max){
    Random random = new Random();

    return random.nextInt(max + 1);
  }

}
