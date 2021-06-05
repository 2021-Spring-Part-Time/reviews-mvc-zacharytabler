package org.wecancoeit.reviews;

public class Podcast {

    private Long id;
    private String podcastName;
    private String description;
    private String podcastImage;
    private String quote;
    private String applePodcast;
    private String appleMusic;

    public Long getId() {
        return id;
    }

    public String getPodcastName() {
        return podcastName;
    }

    public String getDescription() {
        return description;
    }

    public String getPodcastImage() {
        return podcastImage;
    }

    public String getQuote() {
        return quote;
    }

    public String getApplePodcast() {
        return applePodcast;
    }

    public String getAppleMusic() {
        return appleMusic;
    }

    public Podcast(Long id, String podcastName, String description, String podcastImage, String quote, String applePodcast, String appleMusic) {
        this.id = id;
        this.podcastName = podcastName;
        this.description = description;
        this.podcastImage = podcastImage;
        this.quote = quote;
        this.applePodcast = applePodcast;
        this.appleMusic = appleMusic;
    }
}
