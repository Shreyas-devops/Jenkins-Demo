
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.buildFeatures.notifications

version = "2025.07" // Specify the TeamCity version

project {
    buildType(HelloWorld) // Reference the build type defined below
}

object HelloWorld : BuildType({
    id("JenkinsDemo_Build") // Unique ID for the build configuration
    name = "Demo" // Display name in TeamCity UI

    steps {
        script {
            name = "Build"
            id = "Build"
            scriptContent = """echo "THIS IS BUILD STAGE""""
        }
        script {
            name = "Test"
            id = "Test"
            scriptContent = """echo "THIS IS TEST TAGE""""
        }
        script {
            name = "Deploy"
            id = "Deploy"
            scriptContent = """echo "THIS IS DEPLOY""""
        }
    }

    

    requirements {
        // Define agent requirements, e.g., system.os = "Linux"
    }

    features {
       notifications {
            notifierSettings = emailNotifier {
                email = "shreyas.aws.devops@gmail.com"
            }
            buildFailed = true
            buildFinishedSuccessfully = true
        }
    }

    params {
        // Define build parameters, e.g., text("myParam", "defaultValue")
    }
})
