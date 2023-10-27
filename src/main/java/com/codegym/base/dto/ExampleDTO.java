package com.codegym.base.dto;

import com.codegym.base.core.dto_base.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExampleDTO extends BaseDTO {
    private Long id;

    private String name;
}
