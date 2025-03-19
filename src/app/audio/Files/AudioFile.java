package app.audio.Files;

import app.audio.LibraryEntry;
import lombok.Getter;

@Getter
public abstract class AudioFile extends LibraryEntry {
    private final Integer duration;
    /**
     * get artist
     */
    public abstract String getArtist();
    /**
     * get genre
     */
    public abstract String getGenre();
    /**
     * get album
     */
    public abstract String getAlbum();
    public boolean isEpisode() {
        return false;
    }
    public boolean isSong() {
        return false;
    }

    public AudioFile(final String name, final Integer duration) {
        super(name);
        this.duration = duration;
    }
}
