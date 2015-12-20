package sample.springFox.web;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/foo")
public class SampleController {
    @RequestMapping(value = "hoge", method = RequestMethod.GET)
    public Sample hoge(@RequestParam(value = "name") String name) {
        return new Sample(1, name, "hogehoge");
    }

    @RequestMapping(value = "fuga", method = RequestMethod.POST)
    public Sample fuga(@RequestBody Sample sample) {
        return sample;
    }
}
