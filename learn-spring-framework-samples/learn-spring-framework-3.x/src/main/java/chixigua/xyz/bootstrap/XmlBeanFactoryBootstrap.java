package chixigua.xyz.bootstrap;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class XmlBeanFactoryBootstrap {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("META-INF/context.xml"));
        System.out.println(xmlBeanFactory.containsBean("myFirstLevelRepository"));
    }
}
