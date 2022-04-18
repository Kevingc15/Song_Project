
public class Song implements Comparable<Song> {

    private int id;
    private String title;
    private int date;
    private float duration;
    private String gender;
    private String cover;
    private String description;

    public Song(int id, String title, int date, float duration, String gender, String cover, String description) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Song: " +
                "title: '" + title + '\'' +
                ", date: " + date +
                ", duration in seconds: " + duration +
                ", gender: '" + gender + '\'' +
                ", cover: '" + cover + '\'' +
                ", description: '" + description + '\'';
    }

    @Override
    public int compareTo(Song song) {
        //MENOR A MAYOR
        return duration > song.getDuration() ? 1 : -1 ;
    }
}
