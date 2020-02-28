pipeline {
  agent any
  stages {
    stage('Test') {
      agent any
      environment {
        localhost = 'localhost'
      }
      steps {
        sh 'mvn clean test'
      }
    }

  }
  environment {
    localhost = 'localhost'
  }
}