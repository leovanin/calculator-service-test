pipeline {
  agent any
  stages {
    stage('Run') {
      agent any
      environment {
        localhost = 'localhost'
      }
      steps {
        sh 'mvn clean test'
      }
    }

  }
}