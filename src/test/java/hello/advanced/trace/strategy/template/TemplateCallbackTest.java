package hello.advanced.trace.strategy.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateCallbackTest {

    /**
     * Template Callback Pattern - Anonymous inner class
     */
    @Test
    void callbackV1() {
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(new Callback() {
            @Override
            public void call() {
                log.info("Implement Business Logic1");
            }
        });

        template.execute(new Callback() {
            @Override
            public void call() {
                log.info("Implement Business Logic2");
            }
        });
    }

    @Test
    void callbackV2() {
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(() -> log.info("Implement Business Logic1"));
        template.execute(() -> log.info("Implement Business Logic2"));
    }
}
