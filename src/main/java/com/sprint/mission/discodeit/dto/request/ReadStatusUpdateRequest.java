package com.sprint.mission.discodeit.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import java.time.Instant;
import org.springframework.format.annotation.DateTimeFormat;

public record ReadStatusUpdateRequest(

    @NotNull
    @PastOrPresent
    Instant newLastReadAt
) {

}
