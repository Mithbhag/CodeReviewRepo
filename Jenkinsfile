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
               bat "${gv_cr_root_dir}/CodeReview.cmd -Dcode.review.directory=C:/Program Files (x86)/Jenkins/workspace/Demo -Dcode.review.pkgprefix=Pear -Dcode.review.folder-prefix=pear -Dcode.review.runmode=MULTI -Dcode.review.report.directory=${CR_ROOT_DIR}/Reports"
        }
       } 
 	
	    stage('Check Report'){
            steps {
               echo 'Review Report Generated'
			   
        }
       } 
	
	
	
    }
}
