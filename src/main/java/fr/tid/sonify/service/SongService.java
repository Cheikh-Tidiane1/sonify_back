package fr.tid.sonify.service;
import fr.tid.sonify.dto.ReadSongInfoDTO;
import fr.tid.sonify.dto.SaveSongDto;
import fr.tid.sonify.mapper.SongContentMapper;
import fr.tid.sonify.mapper.SongMapper;
import fr.tid.sonify.model.Song;
import fr.tid.sonify.model.SongContent;
import fr.tid.sonify.repository.SongContentRepository;
import fr.tid.sonify.repository.SongRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SongService {
    private final SongMapper songMapper;
    private final SongRepository songRepository;
    private final SongContentRepository songContentRepository;
    private final SongContentMapper songContentMapper;

    public SongService(SongMapper songMapper, SongRepository songRepository, SongContentRepository songContentRepository, SongContentMapper songContentMapper) {
        this.songMapper = songMapper;
        this.songRepository = songRepository;
        this.songContentRepository = songContentRepository;
        this.songContentMapper = songContentMapper;
    }

    public ReadSongInfoDTO create(SaveSongDto saveSongDto){
        Song song = songMapper.saveSongDTOToSong(saveSongDto);
        Song sonSaved = this.songRepository.save(song);
        SongContent songContent = songContentMapper.saveSongDTOToSong(saveSongDto);
        songContent.setSong(sonSaved);
        songContentRepository.save(songContent);
        return songMapper.songToReadSongInfoDTO(sonSaved);
    }

    @Transactional(readOnly = true)
    public List<ReadSongInfoDTO> getAll() {
        return songRepository.findAll()
                .stream()
                .map(songMapper::songToReadSongInfoDTO)
                .toList();
    }
}
