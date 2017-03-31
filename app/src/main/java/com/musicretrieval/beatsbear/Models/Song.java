package com.musicretrieval.beatsbear.Models;

import com.musicretrieval.beatsbear.Classifier.GenreClassifier;

import java.io.Serializable;

import weka.classifiers.Classifier;

/**
 * Song is the base class for all song contexts. A Song object encapsulates the state information
 * for a particular musical piece. The state information includes:
 * <ul>
 *     <li> Name
 *     <li> Artist
 *     <li> Beats per minute (BPM)
 * </ul>
 */
public class Song implements Serializable {
    public static final int MINIMUM_BPM = 60;
    public static final int MAXIMUM_BPM = 300;
    public static final int RELAXING_THRESHOLD = 130;

    private long id;
    private String data;
    private String title;
    private String artist;
    private String album;
    private long duration;
    private SongFeatures features;

    /**
     * Song constructor
     * @param id id of the song
     * @param data path of the song
     * @param title title of the song
     * @param artist artist of the song
     * @param album album of the song
     * @param duration duration of the song in seconds
     * @param features features of the song
     */
    public Song(long id, String data, String title, String artist, String album, long duration, SongFeatures features) {
        this.id = id;
        this.data = data;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.features = features;
    }

    public long getId() { return id; }
    public String getData() { return data; }
    public String getTitle() {
        return title;
    }
    public String getArtist() { return artist; }
    public String getAlbum() { return album; }
    public long getDuration() { return duration; }
    public SongFeatures getFeatures() { return features; }
}
