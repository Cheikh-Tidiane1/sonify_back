package fr.tid.sonify.dto;

import jakarta.validation.constraints.NotBlank;

public record SongTitleVO(@NotBlank String value) {
}
