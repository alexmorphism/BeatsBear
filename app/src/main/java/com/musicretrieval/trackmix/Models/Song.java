package com.musicretrieval.trackmix.Models;

/**
 * Song is the base class for all song contexts. A Song object encapsulates the state information
 * for a particular musical piece. The state information includes:
 * <ul>
 *     <li> Name
 *     <li> Artist
 *     <li> Beats per minute (BPM)
 * </ul>
 */
public class Song {
    public static final int MINIMUM_BPM = 60;
    public static final int MAXIMUM_BPM = 300;

    private long id;
    private String path;
    private String title;
    private String artist;
    private String album;
    private long duration;
    private int bpm;

    /**
     * Song constructor
     * @param id id of the song
     * @param path path of the song
     * @param title title of the song
     * @param artist artist of the song
     * @param album album of the song
     * @param duration duration of the song in seconds
     * @param bpm beats per minute of the song
     */
    public Song(long id, String path, String title, String artist, String album, long duration, int bpm) {
        this.id = id;
        this.path = path;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.bpm = bpm;
    }

    public long getId() { return id; }
    public String getPath() { return path; }
    public String getTitle() {
        return title;
    }
    public String getArtist() { return artist; }
    public String getAlbum() { return album; }
    public long getDuration() { return duration; }
    public int getBpm() { return bpm; }
    public void setBpm(int bpm) { this.bpm = bpm; }
}
