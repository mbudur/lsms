package org.javacoe.lsms

class User {
	
	Date dateCreated
	Date lastUpdated
	
	//properties
	String firstName
	String lastName
	String username
	String password
	String confirm
	String passwordHashed
	
	//transients
	static transients = ['password', 'confirm']

    static constraints = {
		
		firstName blank:false
		lastName blank:false
		username blank:false, size:5..15, unique:true
		password blank:false, size:5..15, validator:{ val, obj ->
			if(obj.password != obj.confirm)
				return 'user.password.donotmatch'
		}
		
    }
}
