# OpenMLDBTroubleShooting

- 第一次发邮件前的错误是这样的：
  - JDK为open jdk 17
  - 在查看了SLF4J给我的[链接](https://www.slf4j.org/codes.html#StaticLoggerBinder)之后推测是缺少依赖，也在StackOverflow上找到了[相似的问题](https://stackoverflow.com/questions/7421612/slf4j-failed-to-load-class-org-slf4j-impl-staticloggerbinder)，然后按照给定的方法并没有解决。
  - <img src="https://raw.githubusercontent.com/CorneliaStreet1/PictureBed/master/2022-05-19%2016-01-35%20%E7%9A%84%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE.png"  />

- 收到黄威老师的邮件后，将JDK版本更换为JDK8之后，变成了这样：
  - 这次pom.xml文件中只有文档中提供的openMLDB的依赖，没有添加其他依赖。
  - ![](https://raw.githubusercontent.com/CorneliaStreet1/PictureBed/master/2022-05-19%2020-51-31%20%E7%9A%84%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE.png)

- 使用的是Java SDK快速上手中，2.1 创建SqlClusterExecutor提供的样例代码，取的是单机版的配置方式。

- 代码：

  - ```java
    import com._4paradigm.openmldb.sdk.SdkOption;
    import com._4paradigm.openmldb.sdk.SqlException;
    import com._4paradigm.openmldb.sdk.impl.SqlClusterExecutor;
    public class Main {
        public static void main(String[] args) throws SqlException {
            SdkOption option = new SdkOption();
            option.setHost("127.0.0.1");
            option.setPort(6527);
            option.setClusterMode(false);
            option.setSessionTimeout(10000);
            option.setRequestTimeout(60000);
            SqlClusterExecutor sqlExecutor = new SqlClusterExecutor(option);
        }
    }
    ```

    
