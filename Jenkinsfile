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
		emailext attachLog: true, body: "${currentBuild.result}: ${BUILD_URL}", compressLog: true, replyTo: 'mithilesh.ext@gmail.com',
       		subject: "Build Notification: ${JOB_NAME}-Build# ${BUILD_NUMBER} ${currentBuild.result}", to: 'mithilesh.ext@gmail.com'			
			   
        }
       } 
	
	
	
    }
}
