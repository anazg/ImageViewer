package imageviewer;

import imageviewer.persistence.ImageLoader;
import imageviewer.model.Image;

public class Application {

    public static void main(String[] args) {
        String filename = "C:\\Users\\Blah\\Pictures\\prueba";
        ImageLoader loader = new ImageLoader();
        Image image = loader.load(filename);
    }

}