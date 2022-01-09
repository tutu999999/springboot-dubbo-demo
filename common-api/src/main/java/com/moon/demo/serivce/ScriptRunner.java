package com.moon.demo.serivce;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

import javax.script.*;
import java.io.FileReader;

public class ScriptRunner {
    public static void main(String[] args) throws Exception {
//        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
//        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
//        Bindings bindings = nashorn.createBindings();
//        nashorn.setBindings(bindings, ScriptContext.ENGINE_SCOPE);
//        nashorn.eval("var a = 1; print(a)");

        testJsFile();
    }

    public static void testJsFile() throws Exception{
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(new FileReader(ResourceUtils.getFile("classpath:test.js")));
        Invocable invocable = (Invocable) engine;
        Object result = invocable.invokeFunction("fun1", "Peter Parker");
        System.out.println(result);
        System.out.println(result.getClass());
        //Object result2 = invocable.invokeFunction("isBlank", "", "姓名", "不能为空");
       // System.out.println(result2);

        Object result3 = invocable.invokeFunction("isBlank", "", "姓名", "");
        System.out.println(result3);
    }
}
