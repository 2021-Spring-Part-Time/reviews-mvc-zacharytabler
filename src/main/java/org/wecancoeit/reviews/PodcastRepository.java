package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PodcastRepository {

    Map<Long, Podcast> podcastList = new HashMap<>();

    public PodcastRepository() {
        Podcast podcastTwo = new Podcast(2L, "Story time with Chris", "Episode two is the debut episode of the Barbell Buddha Podcast. Yes, the podcast begins on episode two. As you get to know Chris, you will learn to love quirks like this about him. In this episode, Chris teaches us the power of a tribe - even when all we want is be left alone. Chris points out that when you are around others, when you really enjoy their company, you tend to rise to their level. It's hard not to.", "images/Tribe.jpg", "Quote: If you want the best of yourself... you need to surround yourself with people who allow energy to flow to you.", "https://podcasts.apple.com/us/podcast/2-story-time-with-chris/id662548269?i=1000161374274", "https://music.apple.com/bg/album/grenades/1468557807?i=1468557822");
        Podcast podcastThree = new Podcast(3L, "Be Still", "In Episode three, Chris takes a moment to talk about meditation. Chris dispels many of the myths and stereotypes around meditation, and encourages listeners to form their own practice. Chris even offers some great tips on how to get started. Chris also has a discussion around the inevitability of good days and bad days, and how they tend to occur at almost predictable intervals. Knowing that, why do we allow ourselves to get so upset and worked up around things that are so routine and obvious?", "images/Meditation.jpg", "Quote: You know what's funnt about good days and bad days? Neither one of them is a surprise...ever. ", "https://podcasts.apple.com/us/podcast/3-be-still/id662548269?i=1000161453560", "https://music.apple.com/bg/album/grenades/1468557807?i=1468557822");
        Podcast podcastFour = new Podcast(4L, "Friday Night Vice with Friends", "In episode 4, Chris records a one off episode with the Barbell Shrugged crew. Although the episode is a little different than most, Chris introduces us to a concept he is still known for until this day, Vice Friday! Vice Friday is born out of the idea of ying and yang. The fact that there is a duality that exists in everything. Vice Friday was the idea that there is importance in taking a little time out of your week, every week to partake in a little vice.", "images/ViceFriday.jpg", "Quote from Brooks Meadows: Goals are future aspirations aspiring to be something. And there's nothing wrong with aspiring to be something. That's how you make progress, that's how you make great change in your life. But just like Vice Friday in essence was a way to create balance for yourself in terms of the discipline you were putting in the week, it also seems to be a great mechanism for creating balance in projecting forward versus being right here in moment. Right? That's what life is.", "https://podcasts.apple.com/us/podcast/4-friday-night-vice-with-friends/id662548269?i=1000161508050", "https://music.apple.com/bg/album/grenades/1468557807?i=1468557822");

        podcastList.put(podcastTwo.getId(), podcastTwo);
        podcastList.put(podcastThree.getId(), podcastThree);
        podcastList.put(podcastFour.getId(), podcastFour);
    }

    public PodcastRepository(Podcast... podcastsToAdd) {
        for (Podcast podcast : podcastsToAdd) {
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
