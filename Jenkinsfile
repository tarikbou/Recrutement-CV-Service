pipeline {
    agent any
	tools {
      oc 'oc'
  }
    stages {
		
        stage('Build') {
            steps {
                echo 'Building..'
				withMaven(maven:'maven-latest') {
					sh 'mvn clean install'
				}
			}
		}
        stage('Test') {
            steps {
                echo 'Testing..'
				withMaven(maven:'maven-latest') {
					sh 'mvn test'
				}
            }
        }
		stage ('SonarQube analysis') {
		when {
				branch "develop"
			}
		steps {
                echo 'Analysis qualite..'
			withSonarQubeEnv('https://sonarqube.xxxxx.com') {
        sh 'mvn sonar:sonar'
					}  
			}
		}
        stage('Deploy to DEV') {
			when {
				branch "develop"
			}
            steps {
                echo 'Deploying to DEV....'
            }
        }
		stage('Deploy to INT') {
			when {
				branch "int"
			}
			steps {
					script {
                        openshift.loglevel(8)
						openshift.withCluster( 'openshift-cluster' ) {
                                openshift.newProject( 'poc-test-pipeline' )
                        }
                        
                    }   
					script {
                        openshift.loglevel(8)
						
                        openshift.withCluster( 'openshift-cluster' ) {
                                openshift.withProject( 'poc-test-pipeline' ) {
                                                echo "Hello from project ${openshift.project()} in cluster ${openshift.cluster()}"
                                                def created = openshift.newApp( 'https://github.com/tarikbou/Recrutement-CV-Service' )
                                                echo "new-app created ${created.count()} objects named: ${created.names()}"
                                }
                        }       
                    }
					}
        }
		stage('Deploy to VAL') {
			when {
				branch "val"
			}
            steps {
                echo 'Deploying to VAL....'
            }
        }
    }
}