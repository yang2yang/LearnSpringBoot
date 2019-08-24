package chixigua.xyz.bootstrap;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.net.URL;

public class LearnResource {
    public static void main(String[] args) {
        URL url = LearnResource.class.getClassLoader().getResource("meta-inf/context.xml");
        System.out.println(url.getFile());
        File file = new File(url.getFile());
        System.out.println(file.exists());

        ClassPathResource classPathResource = new ClassPathResource("meta-inf/context.xml");
    }
}
