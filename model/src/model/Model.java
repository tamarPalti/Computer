/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Model {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //1
            Customer c1=new Customer();
            Class<? extends Customer> Class1 = c1.getClass();           
            Class<? extends Product> Class2= Product.class;         
            Class<?> Class3 = Class.forName("model.HardwareProduct");
            //name
            System.out.println(Class1.getName());
            System.out.println(Class1.getSimpleName()); 
            System.out.println(Class2.getName());
            System.out.println(Class2.getSimpleName()); 
            System.out.println(Class3.getName());
            System.out.println(Class3.getSimpleName());
            //modifier
            System.out.println(Modifier.toString(Class1.getModifiers()));
            System.out.println(Modifier.toString(Class2.getModifiers()));
            System.out.println(Modifier.toString(Class3.getModifiers()));
            //ירושה
            System.out.println(Class1.getSuperclass());
            System.out.println(Class2.getSuperclass());
            System.out.println(Class3.getSuperclass());
            //יצירת מופע
            Customer newInstance1 = Class1.newInstance();
            Product newInstance2 = Class2.newInstance();
            Object newInstance = Class3.newInstance();
            //3 פונקציות
            //א
            System.out.println(Class1.getPackage()); 
            System.out.println(Class2.getPackage()); 
            System.out.println(Class3.getPackage()); 
            //ב
            System.out.println(Class1.isEnum()); 
            System.out.println(Class2.isEnum()); 
            System.out.println(Class3.isEnum()); 
//          //ג
            System.out.println(Class1.isInterface()); 
            System.out.println(Class2.isInterface()); 
            System.out.println(Class3.isInterface());   
            //מידע על שדות-2
            Field[] fields = Class1.getFields();
            System.out.println("==========custumer=============");
            for(int i=0;i<fields.length;i++)
            {
                System.out.println(fields[i].getName());
                System.out.println(fields[i].getType());  
                System.out.println(Modifier.toString(fields[i].getModifiers()));  
            }
            Field[] fields1 = Class2.getFields();
            System.out.println("============Product==============");
            for(int i=0;i<fields1.length;i++)
            {
                System.out.println(fields1[i].getName());
                System.out.println(fields1[i].getType()); 
                System.out.println(Modifier.toString(fields1[i].getModifiers()));  
            }
            Field[] fields2 = Class3.getFields();
            System.out.println("===========HardwareProduct===========");
            for(int i=0;i<fields2.length;i++)
            {
                System.out.println(fields2[i].getName());
                System.out.println(fields2[i].getType());  
                System.out.println(Modifier.toString(fields2[i].getModifiers()));  
            }
            //מידע על פונקציות -3 
            Method[] methods = Class1.getMethods();
            System.out.println("==========custumer=============");
            for(int i=0;i<methods.length;i++)
            {
                System.out.println(methods[i].getName());
                System.out.println(methods[i].getReturnType());
                System.out.println(Arrays.toString(methods[i].getTypeParameters()));
                System.out.println(Arrays.toString(methods[i].getExceptionTypes()));   
            }
            Method[] methods1 = Class2.getMethods();
             System.out.println("============Product==============");
            for(int i=0;i<methods1.length;i++)
            {
                System.out.println(methods1[i].getName());
                System.out.println(methods1[i].getReturnType());
                System.out.println(Arrays.toString(methods1[i].getTypeParameters()));
                System.out.println(Arrays.toString(methods1[i].getExceptionTypes()));   
            }
            Method[] methods2 = Class3.getMethods();
            System.out.println("===========HardwareProduct===========");
            for(int i=0;i<methods2.length;i++)
            {
                System.out.println(methods2[i].getName());
                System.out.println(methods2[i].getReturnType());
                System.out.println(Arrays.toString(methods2[i].getTypeParameters()));
                System.out.println(Arrays.toString(methods2[i].getExceptionTypes()));   
            }
            //4-מידע על בנאים
            Constructor<?>[] constructors = Class1.getConstructors();
            System.out.println("==========custumer=============");
            for(int i=0;i<constructors.length;i++)
            {
                System.out.println("parameterCount "+constructors[i].getParameterCount());
                System.out.println("exceptionTypes "+Arrays.toString(constructors[i].getExceptionTypes()));
                System.out.println("TypeParameters "+Arrays.toString(constructors[i].getTypeParameters()));
            }
            Constructor<?>[] constructors1 = Class1.getConstructors();
            System.out.println("==========Product=============");
            for(int i=0;i<constructors1.length;i++)
            {
                System.out.println("parameterCount "+constructors1[i].getParameterCount());
                System.out.println("exceptionTypes "+Arrays.toString(constructors1[i].getExceptionTypes()));
                System.out.println("TypeParameters "+Arrays.toString(constructors1[i].getTypeParameters()));
            }
            Constructor<?>[] constructors2 = Class1.getConstructors();
            System.out.println("==========HardwareProduct=============");
            for(int i=0;i<constructors2.length;i++)
            {
                System.out.println("parameterCount "+constructors2[i].getParameterCount());
                System.out.println("exceptionTypes "+Arrays.toString(constructors2[i].getExceptionTypes()));
                System.out.println("TypeParameters "+Arrays.toString(constructors2[i].getTypeParameters()));
            }
            //5
            Customer c=new Customer();
            HardwareProduct h=new HardwareProduct();
            Class<? extends Customer> aClass1 = c.getClass();
            Class<? extends HardwareProduct> aClass2 = h.getClass(); 
            //6
            //דרך אחת
//         צריך להפוך לפבליק כדי שיעבוד   
            Constructor<? extends Customer> constructor = aClass1.getConstructor(null);
            Customer newInstance3 = constructor.newInstance(null);
            Constructor<? extends HardwareProduct> constructor1 = aClass2.getConstructor(null);
            HardwareProduct newInstance4 = constructor1.newInstance(null);
            //דרך שניה
//           צריך להפוך לפבליק כדי שיעבוד
            //==================Customer========================
            aClass1.getDeclaredField("id").set(c, 123l);
            aClass1.getDeclaredField("name").set(c, "tamar");
            aClass1.getDeclaredField("Address").set(c, "pardo");
            //=========================HardwareProduct====================
            aClass2.getDeclaredField("WarrantyPeriod").set(h, 12);
            aClass2.getDeclaredField("id").set(h, 1234l);
            aClass2.getDeclaredField("name").set(c, "hila");
            aClass2.getDeclaredField("Description").set(h, "aaaa");
            aClass2.getDeclaredField("pricePerUnit").set(h, 12334);
            System.out.println(c);       
            System.out.println(h); 
            //7
            //==================Customer========================
            Method m1 = aClass1.getDeclaredMethod("setName", String.class);
            m1.invoke(c, "tamar");
            Method m2 = aClass1.getDeclaredMethod("setId",long.class);
            m2.invoke(c, 12345l);
            Method m3 = aClass1.getDeclaredMethod("setAddress",String.class);
            m3.invoke(c, "pardo");
            //==================HardwareProduct====================
            Method d1 = aClass2.getDeclaredMethod("setWarrantyPeriod", int.class );
            d1.invoke(h, 123);
//ניסתי להפעיל גם את הפונקציות של המחלקה שירשתי ממנה אבל זה לא עובד           
//            Method d2 = aClass2.getDeclaredMethod("setId", long.class);
//            d2.invoke(h, 12345l);
//            Method d3 = aClass2.getDeclaredMethod("setName", String.class);
//            d3.invoke(h, "hila");
//            Method d4 = aClass2.getDeclaredMethod("setDescription", String.class);
//            d4.invoke(h, "bbbbb");
//            Method d5 = aClass2.getDeclaredMethod("setPricePerUnit", float.class); 
//            d5.invoke(h, 12.34);
            System.out.println(c);       
            System.out.println(h);    
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (NoSuchMethodException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SecurityException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (InvocationTargetException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (NoSuchFieldException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
