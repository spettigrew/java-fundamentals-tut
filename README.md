# java-fundamentals-tut

## To Run your package Java Development Kit - JDK
    - javac name-of-package/*.java 
    - jar cvfe name-of-package.jar applicationName.FileName name-of-package/*.class
        ### c - create a new archive file with a given name
            v - generate verbose output
            f - specific the jar output file to be created, in our case applicationName.jar
            e - sets the main class also called the Entry point, in our case hello.HelloWord - file name

        #### You should get output similar to

        added manifest
        adding: hello/Greeter.class(in = 287) (out= 220)(deflated 23%)
        adding: hello/HelloWorld.class(in = 496) (out= 327)(deflated 34%)
    
    - java -jar applicationName .jar 
