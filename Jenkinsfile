pipeline {
    agent any
    tools {
        maven 'maven3'  // Ensure Maven is installed correctly in Jenkins
    }

    environment {
        SONAR_HOST_URL = 'http://localhost:9000'  // Update this if SonarQube is hosted remotely
        SONAR_AUTH_TOKEN = credentials('shine')  // Ensure the correct credentials are being used
    }

    stages {
        stage('Checkout Code') {
            steps {
                echo "Checking out code from GitHub repository..."
                git branch: 'master', url: 'https://github.com/Hana-Abdishakur/untitled5.git'
            }
        }

        stage('Build') {
            steps {
                echo "Building the project..."
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo "Running tests..."
                sh 'mvn test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                echo "Starting SonarQube analysis..."
                script {
                    // Print environment variables to debug the issue
                    echo "SONAR_HOST_URL = $SONAR_HOST_URL"
                    echo "SONAR_AUTH_TOKEN = $SONAR_AUTH_TOKEN"
                }
                sh """
                mvn sonar:sonar \
                -Dsonar.projectKey=sample_project \
                -Dsonar.host.url=$SONAR_HOST_URL \
                -Dsonar.login=$SONAR_AUTH_TOKEN
                """
            }
        }

        stage('Debug') {
            steps {
                echo "SonarQube Analysis completed, checking logs..."
                script {
                    // Print additional debug information
                    echo "Checking Maven and SonarQube version..."
                    sh 'mvn -v'  // Print Maven version
                    sh 'sonar-scanner -v'  // If sonar-scanner is available
                }
            }
        }
    }
}
