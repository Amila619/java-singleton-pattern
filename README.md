# Singleton Pattern in Java

This repository demonstrates the Singleton Design Pattern implementation in Java. The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it.

## Features

- Thread-safe singleton implementation
- Example usage and explanation
- Simple and easy-to-understand code

## Usage

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/singleton_pattern.git
    ```
2. Open the project in your preferred IDE.
3. Run the example code to see the Singleton Pattern in action.

## Example

```java
public class Singleton {
     private static Singleton instance;

     private Singleton() {}

     public static synchronized Singleton getInstance() {
          if (instance == null) {
                instance = new Singleton();
          }
          return instance;
     }
}
```

## License

This project is licensed under the MIT License.