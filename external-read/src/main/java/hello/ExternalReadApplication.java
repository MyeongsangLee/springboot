package hello;

import hello.config.*;
import hello.datasource.MyDatasourcePropertiesV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Indexed;

//@Import(MyDatasourceEnvConfig.class)
//@Import(MyDatasourceValueConfig.class)
//@Import(MyDataSourceConfigV1.class)
//@Import(MyDataSourceConfigV2.class)
@Import(MyDataSourceConfigV3.class)
@SpringBootApplication(scanBasePackages = {"hello.datasource", "hello.pay"})
public class ExternalReadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalReadApplication.class, args);
    }

}
