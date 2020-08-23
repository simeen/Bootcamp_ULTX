pipeline {
    agent any
    environment {
        def MAVEN = tool name: 'Maven_Spring', type: 'maven'
        def DOCKER = tool name: 'Docker', type: 'dockerTool'
    }
    stages {
        stage('git checkout') {
            steps {
                git changelog: false, credentialsId: 'Github', poll: false, url: 'https://github.com/simeen/Bootcamp_ULTX.git'
            }
        }
       	stage('Sonar') {
            steps {
				sh "${MAVEN}/bin/mvn sonar:sonar"
            }
        }
        stage('BUILD') {
            steps {
                sh "${MAVEN}/bin/mvn clean package"
            }
        }
        stage('Docker Build') {
            steps {
                echo "Docker Build stage"
                sh "sudo ${DOCKER}/bin/docker build --tag simeen2991/bootcamp:SB . "
            }
        }
        stage('Docker File Push') {
            steps {
                echo "Docker File stage"
                withCredentials([usernamePassword(credentialsId: 'Dockerhub', passwordVariable: 'dpasswd', usernameVariable: 'dockeru')]) {
                    sh "sudo ${DOCKER}/bin/docker login -u '${dockeru}' -p '${dpasswd}'"
                    sh "sudo ${DOCKER}/bin/docker push simeen2991/bootcamp:SB"
                }
            }
        }
       /* stage('CF File Push') {
            steps {
                echo "CF File stage"
                withCredentials([usernamePassword(credentialsId: 'PCF', passwordVariable: 'PCF_PASS', usernameVariable: 'PCF')]) {
                    sh "cf login -a https://api.run.pivotal.io -u '${PCF}' -p '${PCF_PASS}' -o TCS_SIM -s development"
                    sh  "cf push springsim --docker-image simeen2991/bootcamp:SB"  

                }
            }
        } */
		stage("GCP instantiation and Deployment"){
		        steps {
				dir("${env.WORKSPACE}/ansible_gcp") {
		            ansiblePlaybook extras: '-e "instance=web-1 docker_image=simeen2991/bootcamp:SB"', installation: 'localAnsible', playbook: 'site.yml', tags: 'create'
					}
				}
		}

    }
}
