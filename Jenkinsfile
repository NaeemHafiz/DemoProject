pipeline {
    agent any

    tools {
        maven 'Maven 1.0.2'   // Name configured in Jenkins -> Global Tool Configuration
        jdk 'Java 24'         // Name configured in Jenkins -> Global Tool Configuration
    }



    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/NaeemHafiz/DemoProject.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Report') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            echo 'Cleaning up workspace...'
            deleteDir()
        }
    }
}
