pipeline{
    agent any 
    tools{
        maven 'MAVEN_HOME'
    }
    stages{
        stage('Welcome Stage'){
            echo "Welcome to Jenkins Stage"

        }
    
        stage('clean stage'){
            steps{
                bat 'mvn clean'
            }

        }
    }
            stage('Build Stage'){
                steps{
                    bat 'mvn install'
                }
    
            }

        stage('Success Stage'){
            echo "Pipeline executed successfully"

        }
}    
