class UrlMappings {

	static mappings = {
		"/"(controller:"main")
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

	//	"/"(view:"/index")
		"500"(view:'/error')
	}
}
