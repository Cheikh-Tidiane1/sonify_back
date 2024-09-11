package fr.tid.sonify.model;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "favorite_song")
@IdClass(FavoriteId.class)
public class Favorite  implements Serializable {
    @Id
    private UUID songPublicId;
    @Id
    @Column(name = "user_email")
    private String userEmail;
}
