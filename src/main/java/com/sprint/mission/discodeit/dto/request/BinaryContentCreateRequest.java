package com.sprint.mission.discodeit.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BinaryContentCreateRequest(

    @NotBlank(message = "파일 이름은 필수입니다")
    String fileName,


    @NotBlank(message = "콘텐츠 타입은 필수입니다")
    String contentType,

    @NotNull byte[] bytes
) {

}
