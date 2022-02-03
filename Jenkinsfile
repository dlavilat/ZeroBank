pipeline{
    agent any
    stages{
        stage('complie aplication'){
            steps{
                bat 'mvn compile'
            }
        }
        stage('package aplication'){
            steps{
                bat 'mvn package'
            }
        }
        stage('deploy aplication'){
            steps{
                bat 'mvn clean verify'
            }
        }
    }
}