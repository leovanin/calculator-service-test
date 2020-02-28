pipeline {
  agent any
  stages {
    stage('Build') {
      agent any
      environment {
        localhost = 'localhost'
      }
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn clean test'
      }
    }

  }
  environment {
    localhost = 'localhost'
  }
}