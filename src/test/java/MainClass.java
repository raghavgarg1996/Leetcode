import org.junit.Test;

import java.io.File;

import java.lang.reflect.Method;

import java.net.URL;

import java.net.URLClassLoader;

public class MainClass {

    @Test
    public void main() throws Exception {

        // Specify the directories containing the compiled classes

 //     String dir1Path = System.getProperty("user.dir") + "/out/test/Leetcode";
        String dir1Path = "out/test/Leetcode";

        // Load classes from dir1

        loadAndRunClasses(dir1Path);

        // Load classes from dir2

    }

    private static void loadAndRunClasses(String directoryPath) throws Exception {

        // Get the list of .class files in the specified directory

        File directory = new File(directoryPath);

        File[] classFiles = directory.listFiles((dir, name) -> name.endsWith(".class"));

        // Create a URLClassLoader for the specified directory

        URLClassLoader classLoader = new URLClassLoader(new URL[]{directory.toURI().toURL()});

        // Dynamically load and run each class

        for (File classFile : classFiles) {

            // Get class name without ".class" extension

            String className = classFile.getName().replace(".class", "");

            // Load the class

            Class<?> loadedClass = classLoader.loadClass(className);

            // Print loaded class name for debugging
            System.out.println("Loaded class: " + loadedClass.getName());

            // Check if the loaded class is not the MainClass itself

            if (!loadedClass.equals(MainClass.class)) {

                // Get the main method
                Method mainMethod = loadedClass.getMethod("main", String[].class);

                // Create an array of strings for main method arguments (empty for simplicity)
                String[] mainMethodArgs = new String[]{};

                // Invoke the main method
                mainMethod.invoke(null, (Object) mainMethodArgs);

                System.out.println("*******************************************************************************************************");
            }
        }

    }

}
