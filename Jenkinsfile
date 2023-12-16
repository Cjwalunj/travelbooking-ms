pipeline{
  stages{
    stage{
	  steps(java version){
	    sh'java --version'


	  }
	}
	stage{
	  steps(code compile){
	    sh'mvn clean compile'


	  }
	}
    stage{
	  steps(code package){
	    sh'mvn clean package'
	  }
	}
	stage{
	  steps(code test){
	    sh'mvn clean test'
	  }
	}
  agent any
  tools {
    maven 'mvn_3.9.6'
  }
}