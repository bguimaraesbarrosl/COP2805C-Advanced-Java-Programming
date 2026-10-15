// Parent class (superclass) for all media items
public class MediaItem {
    private String title;

    // empty constructor
    public MediaItem() {
    }

    // constructor with title
    public MediaItem(String title) {
        this.title = title;
    }

    // setters and getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // This can be overridden in child classes
    public void printInfo() {
            System.out.println("Title: " + title);
    }

    @Override
    public String toString() {
        return title;
    }
}
