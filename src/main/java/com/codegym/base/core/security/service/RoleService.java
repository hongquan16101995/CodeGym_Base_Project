package com.codegym.base.core.security.service;

import com.codegym.base.core.security.model.Role;
import com.codegym.base.core.security.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private IRoleRepository iRoleRepository;

    public Role findByName(String name) {
        return iRoleRepository.findByName(name);
    }
}
