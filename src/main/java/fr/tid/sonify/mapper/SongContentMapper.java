package fr.tid.sonify.mapper;
import fr.tid.sonify.dto.SaveSongDto;
import fr.tid.sonify.dto.SongContentDTO;
import fr.tid.sonify.model.SongContent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SongContentMapper {
    @Mapping(source = "song.publicId", target = "publicId")
    SongContentDTO songContentToSongContentDTO(SongContent songContent);

    SongContent saveSongDTOToSong(SaveSongDto songDTO);
}
