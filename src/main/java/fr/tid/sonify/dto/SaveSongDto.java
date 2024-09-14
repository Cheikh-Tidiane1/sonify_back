package fr.tid.sonify.dto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
public record SaveSongDto(@Valid SongTitleVO title,
                          @Valid SongAuthorVO author,
                          @NotNull byte[] cover,
                          @NotNull String coverContentType,
                          @NotNull byte[] file,
                          @NotNull String fileContentType) {
}
