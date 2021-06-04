package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class PodcastController {

    @Resource
    private PodcastRepository podcastRepository;

    @RequestMapping("/podcasts")
    public String findAllPodcasts(Model model) {
        model.addAttribute("podcastsModel", podcastRepository.findAll());
        return "podcastsTemplate";
    }

    @RequestMapping("/podcast")
    public String findOneCourse(@RequestParam(value= "id") Long id, Model model) {
        model.addAttribute("podcastModel", podcastRepository.findOne(id));
        return "podcastTemplate";
    }
}
