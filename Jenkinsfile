pipeline {
  options {
    buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
  }
  stages {
    stage('code compile') {
      steps {
        echo 'Compiling code'
        sh 'mvn clean compile'
        echo 'Java compiler'
      }
    }
    stage('code package') {
      steps {
        echo 'Code packaging'
        sh 'mvn clean package'
        echo 'Code packaging is done'
      }
    }
    stage('code test') {
      steps {
        echo 'Code testing'
        sh 'mvn test'
        echo 'Code testing done'
      }
    }
    stage('code run on local machine') {
      steps {
        echo 'Code run on local machine'
        sh 'mvn spring-boot:run'
        echo 'Code is running'
      }
    }
  }
  agent any
  tools {
    maven 'mvn_3.9.6'
  }
}
