package com.yxz.api.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;

public class CodeGenerator {

    public void  run(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/test", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("yxz")
                            .enableSwagger()
                            .outputDir(System.getProperty("user.dir")+"\\src\\main\\java");
                    })
                .packageConfig(builder -> {
                    builder.parent("com.yxz")
                            .moduleName("");
                })
        ;
    }


    public static void main(String[] args) {

    }

}
