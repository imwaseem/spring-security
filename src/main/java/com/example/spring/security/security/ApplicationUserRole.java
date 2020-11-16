package com.example.spring.security.security;


import com.google.common.collect.Sets;

import java.util.Set;

public enum ApplicationUserRole {

    ADMIN(Sets.newHashSet()),
    OFFICER(Sets.newHashSet(
            ApplicationUserPermission.USER_WRITE,
            ApplicationUserPermission.USER_READ
    ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
