pipeline {
    agent any 
	
	environment {
   

    //initialize jenkins global variables to local variables
     gv_cr_root_dir = "${CR_ROOT_DIR}"
	 gv_is_root_dir  = "${IS_ROOT_DIR}"
	 
	 
	 
     

     }


    stages {
        stage('Initialize'){
            steps {
                echo 'initializing the application'
            }
        }
        
       
        stage('Perform-Code-Review'){
            steps {
               echo 'Code Review Stage Started'
			   echo "${gv_cr_root_dir}"
			   echo "${IS_ROOT_DIR}"
			   cd   "${gv_cr_root_dir}"
               bat "${gv_cr_root_dir}/CodeReview.cmd -Dcode.review.directory=C:\codeConfigDemo -Dcode.review.pkgname=PearCodeReview -Dcode.review.pkgprefix=Pear -Dcode.review.folder-prefix=pear"
        }
       } 
 	
	    stage('Check Report'){
            steps {
               echo 'Review Report Generated'
			   
        }
       } 
	
	
	
    }
}
