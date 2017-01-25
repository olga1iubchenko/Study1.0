package TestProject10;

/**
 * Created by user on 24.01.17.
 */
public class Movie {
   String title;
   String genre;
   int rating;

  void playIt() {
      System.out.println("Playing the movie");
  }

    public static void main(String[] args) {
      Movie one = new Movie();
      one.title = "Gone with the stock";
      one.genre = "Tragic";
      one.rating = -2;

      Movie two = new Movie();
      two.title = "Lost in Cubicle Space";
      two.genre = "Comic";
      two.rating = 5;
      two.playIt();

      Movie three = new Movie();
      three.title = "Byte Club";
      three.genre = "Tragic but ultimately uplifting";
      three.rating = 127;
    }
}
