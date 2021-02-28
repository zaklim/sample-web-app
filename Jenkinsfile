pipeline {
	agent any
	stages {
		stage("Compile") {
			steps {
				bat "mvn compile"
			}
		}
		stage("Test") {
			steps {
				bat "mvn test"
			}
		}
		stage("Package") {
			steps {
				bat "mvn war:war"
			}
		}
		stage("TomcatDeploy") {
			steps {
				echo "deploying to Tomcat8"
				deploy adapters: [tomcat8(credentialsId: '15b2f1f6-1346-4f39-b6e2-7a752e83dc71', path: '', url: 'http://localhost:8080/')], contextPath: 'HelloJenkins', onFailure: false, war: 'target/SampleWebApp.war'
			}
		}
	}
}