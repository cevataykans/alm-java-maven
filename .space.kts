/**
* JetBrains Space Automation
* This Kotlin-script file lets you automate build activities
* For more info, see https://www.jetbrains.com/help/space/automation.html
*/

job("Hello World!") {
    container(displayName = "Say Hello", image = "hello-world")
}

job("Build and run tests") {
    container("maven:latest") {
        shellScript {
            content = """
	            mvn clean install
            """
        }
    }
}