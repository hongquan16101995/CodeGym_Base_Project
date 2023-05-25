package com.codegym.base.core.repository_base;

import com.codegym.base.core.model_base.BaseEntity;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> {

}
