package com.cardinalhealth.security.web.controller.dto

import javax.validation.constraints.NotNull

class PermissionDto {
	
	@NotNull
	def id
	def num
	def name
	def desc
	def rowadduserid
	def rowaddstp
	def rowupdateuserid
	def rowupdatestp

}
