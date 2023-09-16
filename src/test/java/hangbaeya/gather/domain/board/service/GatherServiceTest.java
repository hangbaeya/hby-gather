package hangbaeya.gather.domain.board.service;

import hangbaeya.gather.domain.board.entity.Gather;
import hangbaeya.gather.domain.board.repository.GatherRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GatherServiceTest {

    @InjectMocks
    GatherService gatherService;

    @Mock
    GatherRepository gatherRepository;


}