package libraryActivity;

public class Video implements Media {

    private int numCop;
    private String title;
    private String director;
    private int numCop2;


    public Video (String title, String director, int numCop, int numCop2){
        this.numCop = numCop;
        this.title = title;
        this.director = director;
        this.numCop2 = numCop2;

    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean checkOut() {
        if (numCop >= 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkIn() {
        if (numCop - numCop2 >= 1) {
            return true;
        }
        return false;
    }

    public  String  toString() {
        System.out.println("title: " + title);
        System.out.println("director: " + director);
        System.out.println("number of copies available: " + numCop);
    return null;
    }




}

