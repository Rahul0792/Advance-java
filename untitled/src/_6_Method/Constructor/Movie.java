package _6_Method.Constructor;

public class Movie {
    int id;
    int rating;
    String name;

    public Movie(int id, int rating, String name) {

//        this(); // Ussing this key word we directely call to the super class constructor
        this.id = id;
        this.rating = rating;
        this.name = name;
        System.out.println("All arg constructor");
    }

//  Using This keyword .. call to the super class constructor
    public Movie() {

       this(101,5,"Chhava");
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
//      Calling Zero paratemerized constructor
        Movie movie = new Movie();
        System.out.println(movie.toString());
    }
}
