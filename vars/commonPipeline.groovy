def call(Map config = [:]) {
    pipeline {
        agent any

        environment {
            PROJECT_NAME = config.projectName
            DOCKER_IMAGE = "${env.PROJECT_NAME}:${env.BUILD_NUMBER}"
        }

        stages {
          stage('Init') {
                steps {
                    println("PROJECT_NAME: " +env.PROJECT_NAME)
                    println("DOCKER_IMAGE: " +env.DOCKER_IMAGE)
                }
            }
          
            stage('Checkout') {
                steps {
                    println('fake to checkout scm')
                }
            }

            stage('Build') {
                steps {
                    println('fake to ./gradlew clean build')
                }
            }

            stage('Deploy') {
                steps {
                    println('fake to deploy')
                }
            }
        }
    }
}
