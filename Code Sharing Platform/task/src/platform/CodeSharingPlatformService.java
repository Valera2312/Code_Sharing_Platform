package platform;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpServletResponse;
@Resource
public class CodeSharingPlatformService {
    public String getCodeHTML(){
        return "<html>\n" +
                "<head>\n" +
                "    <title>Code</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <pre>\n" +
                "public static void main(String[] args) {\n" +
                "    SpringApplication.run(CodeSharingPlatform.class, args);\n" +
                "}</pre>\n" +
                "</body>\n" +
                "</html>";
    }
    public Code getCodeJson() {

        return new Code("public static void main(String[] args) {\n    " +
                "SpringApplication.run(CodeSharingPlatform.class, args);\n}");
    }
}
