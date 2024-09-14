package fr.tid.sonify.dto;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter

public class ReadSongInfoDTO {
    private SongTitleVO title;

    private SongAuthorVO author;

    @NotNull
    private byte[] cover;

    @NotNull
    private String coverContentType;

    @NotNull
    private boolean isFavorite;

    @NotNull
    private UUID publicId;
}
