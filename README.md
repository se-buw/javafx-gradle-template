# javafx-gradle-template

A Java template to get started building Graphical User Interface (GUI) applications with JavaFX.

The project uses gradle for easy building and dependency management. It comes with:
- gradle set up and ready to use with JavaFX
- an examle how to use an SQL database for data storage (load and store Books)
- an examle how to use a CSV file for data storage (load and store Books)

## Editor

### Eclipse
If you are using Eclipse, you to not need to install any additional plugin.

### Visual Studio Code
If you are using Visual Studio Code (vscode, or code for short), you need to install these extensions:

Click `Extensions` in the left sidebar, and search for these extensions. Select the extension and click `install` in the main window.

- Extension Pack for Java (by Microsoft)
- Gradle for Java (by Micrososft)


## Usage

### Import

📼 This video shows how to [run and import the project in Eclipse](https://youtu.be/9bqYSYh-G1A)

It basically follows the tutorial described here: https://openjfx.io/openjfx-docs/#gradle

The example dependency that reads a CSV file is based on another tutorial here: https://www.callicoder.com/java-read-write-csv-file-apache-commons-csv/

### Switching example classes

To switch between SQL and CSV version, change the `mainClass` definition in `build.gradle`.

### Running the project
- Eclipse\
Use the tab `gradle tasks` > `application` > `run`\
\
If you can't see the tab, you could open it via `window` > `show view` > `other` and in the popup window look for `gradle` and select `Gradle Executions` and `Gradle Tasks`
- VS Code\
Click the gradle icon in the left sidebar (elephant), then unfold `<you-project-name>` > `application` > `run` and click the triangle
