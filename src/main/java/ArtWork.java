public class ArtWork {

    private String title;
    private Artist artist;
    private int price;
    private int nft;

    public ArtWork(String title, Artist artist, int price, int nft){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    public String getTitle (){
        return title;
    }

    public void setTitle () {
        this.title= title;

    }

    public Artist getArtist(){
        return artist;
    }

    public void setArtist(){
        this.artist = artist;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }

    public int getNft(){
        return nft;
    }

    public void setNft(){
        this.nft = nft;
    }

}
