package dev.melkor.ch2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<VideoEntity, Long> {
    List<VideoEntity> findByNameContainsIgnoreCase(String name);

    List<VideoEntity> findByDescriptionContainsIgnoreCase(String description);

    List<VideoEntity> findByNameContainsOrDescriptionContainsAllIgnoreCase(String partialName, String partialDescription);
}
