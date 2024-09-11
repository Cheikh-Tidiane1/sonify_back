package fr.tid.sonify.repository;

import fr.tid.sonify.model.Favorite;
import fr.tid.sonify.model.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
}
