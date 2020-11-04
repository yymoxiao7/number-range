package com.learning.number.range.proxy.initial.dto;

import com.learning.number.range.proxy.annotations.IdGenerateTransmit;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Hogwarts {

    private String principal;

    @IdGenerateTransmit
    List<Student> studentList;

}
