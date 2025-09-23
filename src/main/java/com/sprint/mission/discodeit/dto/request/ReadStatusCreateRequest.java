package com.sprint.mission.discodeit.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import java.time.Instant;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;

public record ReadStatusCreateRequest(

    @NotNull(message = "사용자 ID는 필수입니다.")
    UUID userId,
    @NotNull(message = "채널 ID는 필수입니다.")
    UUID channelId,

    @NotNull
    @PastOrPresent
    Instant lastReadAt
) {

}
