package imageviewer;

public class Application {

    public static void main(String[] args) {
        String filename = "filePathGoesHere";
        ImageLoader loader = new ImageLoader();
        Image image = loader.load(filename);
    }

}