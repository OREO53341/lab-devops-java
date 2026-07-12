pipeline {
    agent any

    tools {
        maven 'M3' 
    }

    stages {
        stage('Build') {
            steps {
                echo 'Compilation du projet...'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Exécution des tests unitaires...'
                sh 'mvn test'
            }
        }
    }
}