package org.shounak.dockerspringbootoptimizationtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DockerSpringBootOptimizationTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringBootOptimizationTutorialApplication.class, args);
    }

    @EventListener(ContextClosedEvent.class)
    public void onShutdown() {
        System.out.println("SHOUNAK SAYS: Releasing resources, closing connections, etc.");
        // Add cleanup logic (closing DB connections, caches, etc.)
    }

}
