package hangbaeya.gather.domain.board.service;

import hangbaeya.gather.domain.board.entity.Gather;
import hangbaeya.gather.domain.board.repository.GatherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GatherService {

    private final GatherRepository gatherRepository;

    public Optional<Gather> getFirstGather() {
        return gatherRepository.findById(1L);
    }

}
