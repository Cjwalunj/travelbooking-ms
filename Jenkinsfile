pipeline{

	options {
		buildDiscarder(logROtator(numToKeepStr: '5', artifactNumTokeepStr: '5'))
		}

		agent any

		tools {
			maven 'mvn_3.9.6'
			}

  stages{
    stage{
      step{
        echo 'code compile'
        sh 'mvn clean compile'
		echo 'compilation is done'

      }
    }
    stage{
          step{
            echo 'code package'
            sh 'mvn clean package'
			echo 'packaging is done'
      }
    }
  }
}