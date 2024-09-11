package fr.tid.sonify.model;
import lombok.*;
import java.util.Objects;
import java.io.Serializable;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class FavoriteId implements Serializable {
    UUID songPublicId;
    String userEmail;
}
