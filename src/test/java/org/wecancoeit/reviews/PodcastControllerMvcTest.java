package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PodcastController.class)
public class PodcastControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PodcastRepository podcastRepo;

    @Mock
    private Podcast podcastTwo;

    @Mock
    private Podcast podcastThree;

    @Test
    public void shouldBeOkForAlPodcastsInThePodcastTemplate() throws Exception {
        mockMvc.perform(get("/podcasts")).andExpect(status().isOk())
                .andExpect(view().name("podcastsTemplate"));
    }

    @Test
    public void shouldFindAllPodcastsInModel() throws Exception {
        Collection<Podcast> allPodcastsInModel = Arrays.asList(podcastTwo, podcastThree);
        when(podcastRepo.findAll()).thenReturn(allPodcastsInModel);
        mockMvc.perform(get("/podcasts"))
                .andExpect(model().attribute("podcastsModel", allPodcastsInModel));

    }

    @Test
    public void shouldFindPodcastTwoInModel() throws Exception {
        Long podcastTwoId = 2L;
        when(podcastRepo.findOne(podcastTwoId)).thenReturn(podcastTwo);
        mockMvc.perform(get("/podcast?id=2"))
                .andExpect(model().attribute("podcastModel", podcastTwo));
    }
}
