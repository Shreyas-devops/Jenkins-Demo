pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
               sh 'echo "Testing"'
               sh 'pwd'
               sh 'ls'
               sh 'cat  Jenkinsfile'
               sh 'bash' 
                
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
