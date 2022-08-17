import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtWorkTest {

    private ArtWork artWork;

    @BeforeEach
    public void setUp(){
        this.artWork = new ArtWork("Blue Sky", new Artist("John"), 50, 573);
    }

    @Test
    public void getArtWorkTitle(){
        String actual = artWork.getTitle();
        String expected = "Blue Sky";
        assertThat(actual).isEqualTo(expected);
    }


    


}
