package com.java;

class Genres{
    public void fame(){
        System.out.println("There are many Genres in movies");
    }
}
class Thriller extends Genres{
    public void mostLiked(){
        System.out.println("Thriller Genre is MostLiked");
    }
//    public void interestingGenre(){
//        System.out.println("Thriller Genre with Horror is Crazy");
//    }
}

class Horror extends Thriller{
    public void interestingGenre(){
        System.out.println("Thriller Genre with Horror is Crazy");
    }
}
public class Inheritance {
    public static void main(String[] args){

        Genres gnr = new Thriller();
        gnr.fame();
//      gnr.mostLiked(); here gnr is obj of Thriller class but,
//      gnr refer to Genres, so method which are in Genre class are called

        Thriller thr = new Thriller();
        thr.fame();
        thr.mostLiked();
        //thr.interestingGenre(); //Your code will result in a compilation error because,
        // the Thriller class does not have the interestingGenre method,
        // which is only defined in the Horror class. Therefore,
        // you cannot call interestingGenre using an instance of the Thriller class.
        //To call the interestingGenre method, you need to create an instance of the Horror class.

        Horror hr = new Horror();
        hr.fame();
        hr.mostLiked();
        hr.interestingGenre();
    }

}
