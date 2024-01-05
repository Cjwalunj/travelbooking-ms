pipeline {
    options {
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
    }

    agent any

    tools {
        maven 'mvn_3.9.6'
    }

    stages {
        stage {
            steps {
                echo "code compile"
                sh "mvn clean compile"
                echo "compilation is done"
            }
        }
    }
 }
