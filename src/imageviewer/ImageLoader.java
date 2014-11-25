package imageviewer;

import java.io.File;
import java.io.FilenameFilter;

public class ImageLoader {
    private Image[] map;

    public Image load(String filename) {
        File file = new File(filename);
        String[] filenames = file.getParentFile().list(getImageFilter());
        link(map(filenames));
        return map[0];
    }

    private FilenameFilter getImageFilter() {
        return new FilenameFilter() {
            private String[] imageExtension = {"bmp", "jpg", "png"};
            @Override
            public boolean accept(File dir, String name) {
                for (String extension : imageExtension) {
                    if (name.endsWith(extension)) return true;
                }
                return false;
            }
        };
         
    }

    private Image[] link(Image[] images) {
        linkNextImages(images);
        linkPrevImages(images);
        return images;
    }

    private Image[] map(String[] filenames) {
        Image[] images = new Image[filenames.length];
        for (int i = 0; i < images.length; i++) {
            images[i] = new Image (filenames[i]);
        }
        return images;
    }

    private void linkNextImages(Image[] images) {
        for (int i = 0; i < images.length-1; i++) {
            images[i].setNext(images[i+1]);
        }
        images[images.length-1].setNext(images[0]);
    }

    private void linkPrevImages(Image[] images) {
        for (int i = 1; i < images.length; i++) {
            images[i].setPrev(images[i-1]);
        }
        images[0].setPrev(images[images.length-1]);
    }

}
