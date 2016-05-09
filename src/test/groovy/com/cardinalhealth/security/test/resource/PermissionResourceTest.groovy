package com.cardinalhealth.security.test.resource

import com.cardinalhealth.security.domain.Permission
import com.cardinalhealth.security.test.base.WebAppIntegrationBaseSpecification
import com.cardinalhealth.security.test.base.TransactionalWebIntegrationTest
import com.cardinalhealth.security.web.resource.PermissionResource
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/*
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration*/
import spock.lang.*;

/*@Configuration

@EnableAutoConfiguration*/
@TransactionalWebIntegrationTest
class PermissionResourceTest extends WebAppIntegrationBaseSpecification {

	
	@Unroll
	def "Select count from permission" (){ 
       given: "I have a valid web context"			
	
		when:"I make a call to the permission service"	
			def createResponse = this.mockMvc.perform(post("/permissions"))
		then:"I get a not null permission response"
			createResponse.andExpect(NotNull)
	
	}

}
