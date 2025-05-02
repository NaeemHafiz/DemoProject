pipeline {
    agent any

    environment {
        GIT_REPO = 'https://github.com/NaeemHafiz/DemoProject.git'
        EMAIL_RECIPIENTS = 'hafiznaeem0070@gmail.com,naeemhassan7722@gmail.com'
    }

    stages {
        stage('Clone from GitHub') {
            steps {
                git url: "${GIT_REPO}", branch: 'main'
            }
        }

        stage('Build') {
            steps {
                echo 'Running build...'
                // Add actual build commands here
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add test commands here
            }
        }
    }

    post {
        success {
            emailext(
                subject: "✅ SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                    <p>Good news!</p>
                    <p>Job <b>${env.JOB_NAME}</b> (#${env.BUILD_NUMBER}) completed successfully.</p>
                    <p><a href="${env.BUILD_URL}">Click here</a> to view the build.</p>
                """,
                mimeType: 'text/html',
                to: "${EMAIL_RECIPIENTS}"
            )
        }

        failure {
            emailext(
                subject: "❌ FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
                    <p>Oops! The build failed.</p>
                    <p>Job <b>${env.JOB_NAME}</b> (#${env.BUILD_NUMBER}) has failed.</p>
                    <p><a href="${env.BUILD_URL}">Click here</a> to view the build details.</p>
                """,
                mimeType: 'text/html',
                to: "${EMAIL_RECIPIENTS}"
            )
        }
    }
}
