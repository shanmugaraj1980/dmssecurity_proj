package com.cardinalhealth.security.service

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import com.cardinalhealth.security.domain.Permission
import com.cardinalhealth.security.repository.PermissionRepository


@Service
class PermissionService {
	

	@Autowired
	PermissionRepository permissionRepository
	
	
	def List<Permission> all(){
		return permissionRepository.findAll()
		
	}
	
	@Transactional
	def save(dto){
		permissionRepository.save(
			   new Permission(name:dto.name, desc:dto.desc, row_add_user_id:dto.rowadduserid))
	}
	
}
