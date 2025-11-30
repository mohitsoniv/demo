pipeline
{
	agent any
	tools
	{
		maven 'MAVEN_HOME'
	}
	
	stages
	{
		stage('Welcome Stage')
		{
			steps
			{
				echo "Welcome Stage"
			}
		}
		
		stage('Clean Stage')
		{
			steps
			{
				sh 'mvn clean'
			}
		}
		stage('Build Stage')
		{
			steps
			{
				sh 'mvn install'
			}
		}
		stage('Success Stage')
		{
			steps
			{
				echo 'Success Stage'
			}
		}
	}	
}
