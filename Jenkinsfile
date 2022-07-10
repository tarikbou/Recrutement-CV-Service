pipeline {
    agent any
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
		stage('Deploy to PROD') {
			when {
				branch "master"
			}
            steps {
                echo 'Deploying to PROD....'
            }
        }
		stage('Deploy to VAL') {
			when {
				branch "master"
			}
            steps {
                echo 'Deploying to VAL....'
            }
        }
    }
}