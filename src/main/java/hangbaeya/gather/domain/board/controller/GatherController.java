package hangbaeya.gather.domain.board.controller;

import hangbaeya.gather.domain.board.entity.Gather;
import hangbaeya.gather.domain.board.service.GatherService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Tag(name = "gather", description = "모집글 관련 API")
@RestController
@RequiredArgsConstructor
public class GatherController {

    private final GatherService gatherService;

    // api 엔드포인트
    @Operation(summary = "1번 글 불러오기")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200")
    })
    @GetMapping("/first-gather")
    public ResponseEntity<Optional<Gather>> getFirstGather() {
        return ResponseEntity.ok(gatherService.getFirstGather());
    }
}
