package com.cardinalhealth.security.domain




import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table
import javax.validation.constraints.NotNull

import org.hibernate.annotations.Type
import org.hibernate.validator.constraints.Length

@Entity
@Table(name = "permission")
class Permission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	@Column(name = "num")
	Integer num;

	@Column(name = "name", length = 255)
	String name;
	
	@Column(name = "desc", length = 255)
	String desc;
	
	@Column(name = "row_add_user_id", length = 255)
	String row_add_user_id;
	
	@Column(name = "row_add_stp")
	Date row_add_stp;
	
	@Column(name = "row_update_user_id", length = 255)
	String row_update_user_id;
	
	@Column(name = "row_update_stp")
	Date row_update_stp;
}

