package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PodcastRepository {

    Map<Long, Podcast> podcastList = new HashMap<>();

    public PodcastRepository() {
        Podcast podcastTwo = new Podcast(2L, "Story time with Chris", "Episode two is the debut episode of the Barbell Buddha Podcast. Yes, the podcast begins on episode two. As you get to know Chris, you will learn to love quirks like this about him. In this episode, Chris teaches us the power of a tribe even when all we want to do is be by ourselves.", "images/Tribe.jpg","filler", "https://podcasts.apple.com/us/podcast/2-story-time-with-chris/id662548269?i=1000161374274", "https://music.apple.com/bg/album/grenades/1468557807?i=1468557822");
        Podcast podcastThree = new Podcast(3L, "Be Still", "Let's take a moment to talk about meditation.", "images/Meditation.jpg", "Filler", "https://podcasts.apple.com/us/podcast/3-be-still/id662548269?i=1000161453560", "https://music.apple.com/bg/album/grenades/1468557807?i=1468557822" );
        Podcast podcastFour = new Podcast(4L, "Friday Night Vice with Friends", "Laughs with the Barbell Shrugged crew.", "images/ViceFriday.jpg", "Filler", "https://podcasts.apple.com/us/podcast/4-friday-night-vice-with-friends/id662548269?i=1000161508050", "https://music.apple.com/bg/album/grenades/1468557807?i=1468557822" );

        podcastList.put(podcastTwo.getId(), podcastTwo);
        podcastList.put(podcastThree.getId(), podcastThree);
        podcastList.put(podcastFour.getId(), podcastFour);
    }

    public PodcastRepository(Podcast ...podcastsToAdd) {
       for(Podcast podcast: podcastsToAdd) {
           podcastList.put(podcast.getId(), podcast);
       }
    }

    public Podcast findOne(Long id) {
        return podcastList.get(id);
    }

    public Collection<Podcast> findAll() {
        return podcastList.values();
    }
}
