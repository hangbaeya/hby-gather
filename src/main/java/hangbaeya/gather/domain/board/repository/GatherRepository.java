package hangbaeya.gather.domain.board.repository;

import hangbaeya.gather.domain.board.entity.Gather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GatherRepository extends JpaRepository<Gather, Long> {

    Optional<Gather> findById(Long id);

}
