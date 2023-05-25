package com.codegym.base.service;

import com.codegym.base.core.service_base.BaseService;
import com.codegym.base.dto.ExampleDTO;
import com.codegym.base.core.mapper_base.ExampleMapper;
import com.codegym.base.model.ExampleEntity;
import com.codegym.base.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExampleService extends BaseService<ExampleRepository, ExampleDTO, ExampleEntity> {
    @Autowired
    private ExampleRepository repository;

    @Autowired
    private ExampleMapper mapper;

    @Override
    public ExampleDTO create(ExampleDTO dto) {
        ExampleEntity exampleEntity = mapper.toEntity(dto);
        repository.save(exampleEntity);
        return dto;
    }

    @Override
    public ExampleDTO update(ExampleDTO dto) {
        ExampleEntity exampleEntity = new ExampleEntity();
        mapper.updateFromDTO(dto, exampleEntity);
        repository.save(exampleEntity);
        return dto;
    }

    @Override
    public Optional<ExampleDTO> getDetails(Long id) {
        return Optional.ofNullable(mapper.toDto(repository.findById(id).get()));
    }

    @Override
    public ExampleDTO delete(ExampleDTO dto) {
        return null;
    }

    @Override
    public List<ExampleDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }
}
