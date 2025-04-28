# javafx-gradle-template

A Java template to get started building Graphical User Interface (GUI) applications with JavaFX.

The project uses Gradle for easy building and dependency management. It comes with:
- Gradle set up and ready to use with JavaFX
- An example of how to use an SQL database for data storage (load and store Books)
- An example of how to use a CSV file for data storage (load and store Books)

## Editor

### Eclipse
If you are using Eclipse, you do not need to install any additional plugins.

### Visual Studio Code
If you are using Visual Studio Code (VS Code, or *Code* for short), you need to install these extensions:

Click `Extensions` in the left sidebar, search for these extensions, select them, and click `Install` in the main window.

- Extension Pack for Java (by Microsoft)
- Gradle for Java (by Microsoft)

## Usage

### Import

📼 This video shows how to [run and import the project in Eclipse](https://youtu.be/9bqYSYh-G1A)

It roughly follows the tutorial described here: https://openjfx.io/openjfx-docs/#gradle

The example dependency that reads a CSV file is based on another tutorial here: https://www.callicoder.com/java-read-write-csv-file-apache-commons-csv/

### Switching Example Classes

To switch between the SQL and CSV versions, change the `mainClass` definition in `build.gradle`.

### Running the Project
- **Eclipse**  
  Use the `Gradle Tasks` tab > `application` > `run`.  
  If you can't see the tab, open it via `Window` > `Show View` > `Other...`, then look for `Gradle` and select `Gradle Executions` and `Gradle Tasks`.

- **VS Code**  
  Click the Gradle icon in the left sidebar (elephant), then unfold `<your-project-name>` > `application` > `run` and click the play button (triangle).

## Version Control and Git

If you don't know how to get started with Git, have a look at the `GIT.md` file in the root of this project.
