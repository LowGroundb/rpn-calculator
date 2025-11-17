# RPN Calculator (Java)

Another Reverse Polish Notation calculator implementation (stack-based). If this and `Rpn-Calculator-numero2` are similar, consider consolidating or documenting differences (features, performance, structure).

## Build and Run (generic)
```bash
javac -d bin $(find src -name "*.java")
java -cp bin Main   # replace Main with your main class
```

## Examples
```text
3 4 +           => 7
10 2 / 5 +      => 10
2 3 4 * +       => 14
```

## Roadmap
- Consistent error handling (underflow, invalid tokens)
- Unit tests
- Benchmarks vs numero2 (if both stay)
- Packaging (fat JAR or Gradle task)
