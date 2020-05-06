package com.realpage.demo.model;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    ADMIN,
    REGULAR;

    @Override
    public String getAuthority() {
        return this.name();
    }
}
