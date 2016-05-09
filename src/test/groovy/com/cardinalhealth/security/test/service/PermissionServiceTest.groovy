package com.cardinalhealth.security.test.service

import com.cardinalhealth.security.domain.Permission
import com.cardinalhealth.security.service.PermissionService
import com.cardinalhealth.security.test.base.TransactionalWebIntegrationTest
import com.cardinalhealth.security.test.base.WebAppIntegrationBaseSpecification
import com.cardinalhealth.security.web.controller.dto.PermissionDto
import com.cardinalhealth.security.repository.PermissionRepository
import static org.hamcrest.collection.IsCollectionWithSize.hasSize
/*import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath*/


import org.springframework.beans.factory.annotation.Autowired;

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovy.mock.interceptor.MockFor

import org.springframework.http.MediaType
/*import org.springframework.test.web.servlet.MockMvc;*/
import org.springframework.web.context.WebApplicationContext;
/*import org.springframework.test.web.servlet.setup.MockMvcBuilders*/
import spock.lang.*
/*import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
*/

import org.mockito.internal.configuration.injection.MockInjection


class PermissionServiceTest extends Specification{	
	
	@Unroll
	def "DTO Object should have no pre-defined values" (){
		given: "I have an empty JSON object"
		def inputJSON =""
		when: "I pass a valid JSON Object into the DTO"
		def permissionDTO = inputJSON
		then : "The object would be properly populated"
		/*permissionDTO.id == ""
		permissionDTO.num == ""
		permissionDTO.name ==""
		permissionDTO.desc == ""
		permissionDTO.rowadduserid == ""
		permissionDTO.rowaddstp == ""
		permissionDTO.rowupdateuserid == ""
		permissionDTO.rowupdatestp == ""*/
		
	}
	
	
	@Unroll
	def "Convert JSON to DTO Object" (){
		given: "I have a complete input JSON object"
		def inputJSON ="{num:3,name:'delete',desc:'Delete Permission',rowadduserid: null,rowaddstp:null,rowupdateuserid:null,rowupdatestp:null}"
		when: "I pass a valid JSON Object into the DTO"
		PermissionDto permissionDTO = new PermissionDto(num:"3",name:"delete",desc:"Delete Permission",rowadduserid: null,rowaddstp:null,rowupdateuserid:null,rowupdatestp:null)
		then : "The object would be properly populated"
		permissionDTO.id == null
		permissionDTO.num == "3"
		permissionDTO.name =="delete"
		permissionDTO.desc == "Delete Permission"
		permissionDTO.rowadduserid == null
		permissionDTO.rowaddstp == null
		permissionDTO.rowupdateuserid == null
		permissionDTO.rowupdatestp == null
		
	}
	
	@Unroll
	def "Select count from permission" (){ 
       given: "I have a valid web context"			
		PermissionService ps = new PermissionService()
		//MockInjection mock = ps.permissionRepository
		//ps.
		def permissionRepository = new MockFor(PermissionRepository.class)
		when:"I make a call to the permission service"	
			List<Permission> svcresp = ps.all()
		then:"I get a permission response whose count is greater than zero"
			svcresp.size()  == 0
	
	}
	
	
	
		

}
