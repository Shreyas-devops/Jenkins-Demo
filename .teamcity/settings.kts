import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.notifications
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object Build : BuildType({
    name = "JenkinsDemo"

    publishArtifacts = PublishMode.SUCCESSFUL

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
features {
    notifications {
        notifierSettings = emailNotifier {
            email = "shreyas.aws.devops@gmail.com"
        }
        buildFailed = true
        buildFinishedSuccessfully = true
    }
}
})
