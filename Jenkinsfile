pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6'   // Name configured in Jenkins -> Global Tool Configuration
        jdk 'Java 11'         // Name configured in Jenkins -> Global Tool Configuration
    }



    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/NaeemHafiz/DemoProject.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
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
