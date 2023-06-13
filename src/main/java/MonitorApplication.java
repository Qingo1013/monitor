import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableAsync
@EnableScheduling
@EnableTransactionManagement
//@MapperScan({"cn.qqa.monitor"})
@ComponentScan("cn.qqa.monitor")
public class MonitorApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MonitorApplication.class, args);
        consolePort(context);
    }

    private static void consolePort(ConfigurableApplicationContext context) {
        Environment env = context.getEnvironment();
        String port = env.getProperty("server.port");
        String property = env.getProperty("server.servlet.context-path");
        String path = property == null ? "" : property;
        System.out.println(
            "\n\t" +
                "----------------------------------------------------------\n\t" +
                "Application Smart Party Business is running! Access URLs:\n\t" +
                "Local: \t\thttp://localhost:" + port + path + "/\n\t" +
                "------------------------------------------------------------");
    }
}
