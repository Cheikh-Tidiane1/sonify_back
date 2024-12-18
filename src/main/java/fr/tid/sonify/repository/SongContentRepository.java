package fr.tid.sonify.repository;

import fr.tid.sonify.model.SongContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {
    Optional<SongContent> findOneByPublicId(UUID publicId);
}
