pipeline {
    agent any

    tools {
        // Define the Maven tool named 'mvn_3.9.6'
        maven 'mvn_3.9.6'
        // Add other tools as needed
    }

    stages {
        stage('Compile') {
            steps {
                script {
                    // Use the defined Maven tool
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    // Use the defined Maven tool
                    sh 'mvn clean package'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Use the defined Maven tool
                    sh 'mvn clean test'
                }
            }
        }
    }
}
