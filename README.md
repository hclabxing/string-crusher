## 要求

- JDK 11+
- Maven 3.8+

## 构建与测试

```bash
mvn -q -DskipTests=false test
mvn -q -DskipTests package
```

## 运行

```bash
java -jar target/string-crusher-1.0.0.jar
```

### 示例

- 输入：`aabcccbbad`，模式：remove → 输出：`d`
- 输入：`abcccbad`，模式：replace → 输出：`d`
