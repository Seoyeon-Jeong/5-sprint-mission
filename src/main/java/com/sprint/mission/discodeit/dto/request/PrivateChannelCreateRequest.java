package com.sprint.mission.discodeit.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.List;
import java.util.UUID;

public record PrivateChannelCreateRequest(

    @NotEmpty
    @Size(min = 2, message = "최소 두 명 이상의 참가자가 필요합니다.")
    List<UUID> participantIds
) {

}
