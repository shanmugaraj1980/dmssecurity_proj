package com.cardinalhealth.security.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository

import com.cardinalhealth.security.domain.Permission

@Repository
@RestResource
interface PermissionRepository extends JpaRepository<Permission, Long> {
	
}
