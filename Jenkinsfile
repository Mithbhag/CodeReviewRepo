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
	       bat  "cd ${gv_cr_root_dir}"
               bat "${gv_cr_root_dir}/CodeReview.cmd -Dcode.review.directory=C:/codeConfigDemo -Dcode.review.pkgprefix=Corp -Dcode.review.folder-prefix=corp -Dcode.review.report.directory=C:/SoftwareAG/tools/ISCCR/Reports -Dcode.review.runmode=MULTI"
        }
       } 
 	
       stage('SendEmail'){ 
            steps {
               echo 'Review Report Generated'
	       emailext(
		       mimeType: 'text/html',
       		       attachLog: true,
		       body:readFile("C:/SoftwareAG/tools/ISCCR/Reports/test.html"),
		       subject:"Jenkins Job '${env.JOB_NAME}' (${env.BUILD_NUMBER} Report ",
		       to: 'mithilesh.ext@gmail.com'
			)
			   
        }
       } 

    }
}
