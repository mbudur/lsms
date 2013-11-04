package org.javacoe.lsms

class UserController {

    def index() { }
	
	def login = {
		
		System.out.println("inside UserController.login" + params.username + "---" + params.password);
		if(request.method == 'POST'){
			def passwordHashed = params.password.encodeAsPassword()
			def u = User.findByUsernameAndPasswordHashed(params.username, passwordHashed)
			                   
			if(u){
				session.user = u
				redirect(controller:'main')
			}else{
				flash.message = "User not found"
				redirect(controller: 'main')
			
			}
			
		}
	}
}
