package com.yxz.api.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CodeGenerator {

    public static void  run(String table){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/myproject", "root", "43439494")
                .globalConfig(builder -> {
                    builder.author("yxz")
                            .enableSwagger()
                            .outputDir(System.getProperty("user.dir")+"\\src\\main\\java");
                    })
                .packageConfig(builder -> {
                    builder.parent("com.yxz")
                            .moduleName("api")
                            .entity("entity")
                            .service("service")
                            .controller("controller")
                            .mapper("mapper")
                            .xml("mapper")
                            .pathInfo(Collections.singletonMap(OutputFile.xml,System.getProperty("user.dir")+"\\src\\main\\java"))
                    ;
                })
                .strategyConfig(builder -> {
                    builder.addInclude(table) // 设置需要生成的表名
                            .addTablePrefix("t_", "c_")
                            .serviceBuilder(); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
        ;
    }


    public static void main(String[] args) {
        String table="User";
        run(table);
    }

}
