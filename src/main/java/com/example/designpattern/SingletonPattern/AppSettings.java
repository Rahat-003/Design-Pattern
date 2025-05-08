package com.example.designpattern.SingletonPattern;

/**
 * <h1>Bill Pugh Singleton Implementation</h1>
 * <ol>
 *   <li>Thread-safe code ensures:
 *     <ol type="a">
 *       <li>Only one thread can create the instance</li>
 *       <li>All threads see the same instance</li>
 *       <li>No two threads overwrite shared data unexpectedly</li>
 *     </ol>
 *   </li>
 *   <li>Classes are only loaded once by the classloader — and loading a class is thread-safe by the JVM spec.</li>
 *   <li>The Holder class is not loaded into memory until getInstance() is called for the first time.</li>
 *   <li><b>When Holder is loaded, the JVM ensures that INSTANCE is initialized only once, and only by one thread, even if multiple threads call getInstance() at the same time.</b></li>
 *   <li>JVM Guarantees Used:
 *     <ol type="a">
 *       <li>Class loading is atomic and thread-safe.</li>
 *       <li>Static fields are initialized when the class is loaded, and the initialization is guaranteed to be serialized and visible to all threads.</li>
 *     </ol>
 *   </li>
 * </ol>
 */

public class AppSettings {
    private String databaseUrl;
    private String apiKey;


    private AppSettings() {
        this.databaseUrl = "jdbc:postgresql://localhost:3306/db-name";
        this.apiKey = "12345-ABCDE";
    }

    // Bill Pugh implementation
    private static class Holder {
        private static final AppSettings INSTANCE = new AppSettings();
    }

    public static AppSettings getInstance() {
        return Holder.INSTANCE;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
