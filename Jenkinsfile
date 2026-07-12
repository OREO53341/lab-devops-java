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
        stage('Deploy') {
            steps {
                echo 'Package du projet et déploiement fictif...'
                // Génère le livrable (ex: un fichier .jar dans le dossier target)
                sh 'mvn package -DskipTests' 
            }
        }
    }
}