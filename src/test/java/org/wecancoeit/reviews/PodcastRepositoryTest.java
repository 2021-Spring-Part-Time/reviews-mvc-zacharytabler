package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PodcastRepositoryTest {

    private PodcastRepository underTest;
    private Podcast podcastTwo = new Podcast(2L, "Story Time With Chris", "The first solo show!", "images/Tribe.jpg", "Filler", "https://podcasts.apple.com/us/podcast/2-story-time-with-chris/id662548269?i=1000161374274", "https://music.apple.com/bg/album/grenades/1468557807?i=1468557822");
    private Podcast podcastThree = new Podcast(3L, "Be Still", "Let's take a moment to talk about meditation.", "images/Meditation.jpg", "Filler", "https://podcasts.apple.com/us/podcast/3-be-still/id662548269?i=1000161453560", "https://music.apple.com/bg/album/grenades/1468557807?i=1468557822" );


    @Test
    public void shouldFindPodcastTwo() {
        underTest = new PodcastRepository(podcastTwo);
        Podcast foundPodcast = underTest.findOne(2L);
        assertEquals(podcastTwo, foundPodcast);
    }

    @Test
    public void shouldFindPodcastTwoAndPodcastThree() {
        underTest = new PodcastRepository(podcastTwo, podcastThree);
        Collection<Podcast> foundPodcasts = underTest.findAll();
        assertThat(foundPodcasts).contains(podcastTwo, podcastThree);
    }
}
