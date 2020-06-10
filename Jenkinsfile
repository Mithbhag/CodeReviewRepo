pipeline {
    agent any 

    stages {
        stage('Initialize'){
            steps {
                echo 'initializing the application'
            }
        }
        
       
        stage('Perform-Code-Review'){
            steps {
               echo 'Code Review Stage Started'
               bat "C:\SoftwareAG\tools\ISCCR\CodeReview.cmd -Dcode.review.directory=C:\webMethods_10_5\IntegrationServer\instances\default\packages -Dcode.review.pkgname=PearProcessTravelApproval -Dcode.review.pkgprefix=Pear -Dcode.review.folder-prefix=pear -Dcode.review.report.directory=C:\SoftwareAG\tools\ISCCR\Reports"
            }
        }
        
 	
    }
}
