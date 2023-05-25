package com.codegym.base.core.mapper_base;

import com.codegym.base.dto.ExampleDTO;
import com.codegym.base.model.ExampleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface ExampleMapper extends EntityMapper<ExampleDTO, ExampleEntity> {
}
