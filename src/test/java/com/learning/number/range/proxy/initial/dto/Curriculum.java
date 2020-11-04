package com.learning.number.range.proxy.initial.dto;

import com.learning.number.range.proxy.annotations.IdGenerate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Curriculum {
    @IdGenerate
    private String curriculumNo;
    private String curriculumName;
    private String teacher;
}
