package net.aikaka.javaboilerplates.microrest.api;

import net.aikaka.javaboilerplates.core.entity.SampleEntity;
import net.aikaka.javaboilerplates.core.interactor.GetSamplesInteractor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GetSamplesAPI {

    private final GetSamplesInteractor getSamplesInteractor;

    public GetSamplesAPI(GetSamplesInteractor getSamplesInteractor) {
        this.getSamplesInteractor = getSamplesInteractor;
    }

    @GetMapping("/samples")
    public List<SampleEntity> all() {
        return getSamplesInteractor.all();
    }

    @GetMapping("/samples/name/{keyword}")
    public List<SampleEntity> allByName(@PathVariable String keyword) {
        return getSamplesInteractor.allByName(keyword);
    }
}
