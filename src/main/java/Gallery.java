import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<ArtWork> artWorks;

    public  Gallery( String name, int till ) {
        this.name = name;
        this.till = till;
        this.artWorks = new ArrayList<>();

    }

    public String getName (){
        return this.name;
    }

    public void setName () {
        this.name = name;
    }

    public int getTill(){
        return till;

    }


}
