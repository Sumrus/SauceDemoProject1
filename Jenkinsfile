pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M2_HOME"
    }

    stages{
        stage('Preperation'){
            steps{
                git 'https://github.com/Sumrus/SauceDemoProject1.git'
            }
        }
        stage('Build'){
            steps{
                sh 'mvn clean test'
            }
        }
    }
}