package io.spring.demorandomproperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/number")
class RandomController {

    private static final Logger log = LoggerFactory.getLogger(RandomController.class);
    private final SingletonComponent singletonComponent;
    private final PrototypeComponent prototypeComponent;

    RandomController(SingletonComponent singletonComponent, PrototypeComponent prototypeComponent) {
        this.singletonComponent = singletonComponent;
        this.prototypeComponent = prototypeComponent;
    }

    @GetMapping("singleton")
    public ResponseEntity<Integer> getSingletonRandom() {
        return ResponseEntity.ok(singletonComponent.getRandomProperty());
    }

    @GetMapping("prototype")
    public ResponseEntity<Integer> getPrototypeRandom() {
        log.info("%d".formatted(prototypeComponent.hashCode()));
        return ResponseEntity.ok(prototypeComponent.getRandomNumber());
    }

}
