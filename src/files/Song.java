package files;

public class Song {

    private String song;
    private String author;
    private String text;

    public Song() {
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Song: " + song + "\n" +
                "Author: " + author + "\n" +
                "Text:\n" + text;
    }
}
