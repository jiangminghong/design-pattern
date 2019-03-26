package com.jmh.pattern.myproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class MyClassLoader extends ClassLoader {

    private File classpathFile;

    public MyClassLoader() {
        ///D:/java/project/design-pattern/design-proxy/target/classes/com/jmh/pattern/myproxy/
        //class文件的位置
        String classpath=MyClassLoader.class.getResource("").getPath();
//        System.out.println("classpath:"+classpath);
        this.classpathFile = new File(classpath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //com.jmh.pattern.myproxy
        String className=MyClassLoader.class.getPackage().getName()+"."+name;
        if(classpathFile  != null){
            File classFile = new File(classpathFile,name.replaceAll("\\.","/") + ".class");
            if(classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte [] buff = new byte[1024];
                    int len;
                    //将class文件读取到内存中
                    while ((len = in.read(buff)) != -1){
                        out.write(buff,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
