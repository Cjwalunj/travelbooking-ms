pipeline {

    agent any

    tools {
        maven 'mvn_3.9.6'
    }

    stages {
        stage('Code Compilation') {
            steps {
                echo 'Code Compilation is In Progress!'
                sh 'mvn clean compile'
                echo 'Code Compilation is Completed Successfully!'
            }
        }
        stage('Code QA Execution') {
            steps {
                echo 'Junit Test case check in Progress!'
                sh 'mvn clean test'
                echo 'Junit Test case check Completed!'
            }
        }
        stage('Code Package') {
            steps {
                echo 'Creating War Artifact'
                sh 'mvn clean package'
            }
        }
        stage('Building & Tag Docker Image') {
            steps {
                echo 'Starting Building Docker Image'
                sh "docker build -t cjwalunj/travelbooking-ms:dev-travelbooking-v.1.${BUILD_NUMBER} ."
                sh "docker build -t travelbooking-ms:dev-travelbooking-v.1.${BUILD_NUMBER} ."
                echo 'Completed Building Docker Image'
            }
        }
        stage('Docker Image Scanning') {
            steps {
                echo 'Docker Image Scanning Started'
                sh 'java -version'
                echo 'Docker Image Scanning Started'
            }
        }
        stage('Docker push to Docker Hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerhubCred', variable: 'dockerhubCred')]) {
                        sh "docker login docker.io -u cjwalunj -p ${dockerhubCred}"
                        echo "Push Docker Image to DockerHub: In Progress"
                        sh "docker push cjwalunj/travelbooking-ms:dev-travelbooking-v.1.${BUILD_NUMBER}"
                        echo "Push Docker Image to DockerHub: Completed"
                    }
                }
            }
        }

    }
}
