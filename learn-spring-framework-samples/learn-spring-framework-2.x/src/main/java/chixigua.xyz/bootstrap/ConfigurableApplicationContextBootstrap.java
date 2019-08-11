package chixigua.xyz.bootstrap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurableApplicationContextBootstrap {

    static {
        // 调整系统属性 "env"，实现 "name" bean 的定义切换
        // envValue 可能来自于 "-D" 命令行启动参数
        // 参数当不存在时，使用 "prod" 作为默认值
        String envValue = System.getProperty("env", "dev");
        System.setProperty("env", envValue);
    }

    public static void main(String[] args) {
        // 定义 XML ApplicationContext
        // 先留意下这个location的方式，不需要写classpath的前缀
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/configurable-context.xml");
        // "name" bean 对象
        String value = (String) context.getBean("name");
        // "name" bean 内容输出
        System.out.println("Bean 'name' 的内容为：" + value);
        // 关闭上下文
        context.close();
    }
}
