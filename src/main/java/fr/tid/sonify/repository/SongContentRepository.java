package fr.tid.sonify.repository;

import fr.tid.sonify.model.SongContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {
}
