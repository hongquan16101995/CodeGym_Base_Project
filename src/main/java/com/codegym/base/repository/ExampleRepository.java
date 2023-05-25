package com.codegym.base.repository;

import com.codegym.base.core.repository_base.BaseRepository;
import com.codegym.base.model.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends BaseRepository<ExampleEntity>, JpaRepository<ExampleEntity, Long> {
}
