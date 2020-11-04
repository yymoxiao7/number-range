package com.learning.number.range.proxy.initial.dto;

import com.learning.number.range.proxy.annotations.IdGenerate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BranchHospital {
    @IdGenerate
    private String branchHospitalNo;
    private String branchHospitalName;
    private String deanName;
}
