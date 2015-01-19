package imageviewer.model;

public class Image {
    
    private String name;
    private Bitmap bitmap;
    private Image next;
    private Image prev;

    public Image(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public Image getNext() {
        return next;
    }

    public void setNext(Image next) {
        this.next = next;
    }

    public Image getPrev() {
        return prev;
    }

    public void setPrev(Image prev) {
        this.prev = prev;
    }

}
