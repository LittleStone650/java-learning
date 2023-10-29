# exceptions type

## checked exceptions
java 在编译的时候会检查是否有错误。
比如说new FileReader读取一个新的txt文件时，会报：
Unhandled exception: java.io.FileNotFoundException

## unchecked exceptions (runtime exceptions)
写代码时候发生的逻辑错误，或者是单纯写错了，但是java 编译器检查不出来的。
常见的就是nullpoint，空指针。

ArithmeticException。如果除以0会得到这个错误。

IllegalArgumentException。参数传值有异常，比如说要求传正数，传了个负数

indexOutOfBoundsException。索引超界

IllegalStateException

## error
out of memory

## 捕捉异常

```java
 // 这样太丑了
    public static void show() {
       
        FileReader reader =null;
//        sayHello(null);
        try {
            reader = new FileReader("file.txt");
            System.out.println("file open");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } 
        catch (IOException | ParseException e) {
            System.out.println("could not read data");
        } finally {
            if (reader !=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
```