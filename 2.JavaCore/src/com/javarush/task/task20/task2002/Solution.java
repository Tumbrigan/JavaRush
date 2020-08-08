package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("D:\\user.txt", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User vasya = new User();
            vasya.setFirstName("Vasya");
            vasya.setLastName("Pupkin");
            vasya.setBirthDate(new Date());
            vasya.setMale(true);
            vasya.setCountry(User.Country.UKRAINE);
            javaRush.users.add(vasya);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(loadedObject.equals(javaRush));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter ps = new PrintWriter(outputStream);

            if (users.size() > 0) {
                for (User user : users) {
                    ps.println(user.getFirstName());
                    ps.println(user.getLastName());
                    ps.println(user.getBirthDate().getTime());
                    ps.println(user.isMale());
                    ps.println(user.getCountry());
                }
            }
            ps.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            while (br.ready()) {
                User user = new User();
                user.setFirstName(br.readLine());
//                System.out.println(br.readLine());

                user.setLastName(br.readLine());
//                System.out.println(br.readLine());

                user.setBirthDate(new Date(Long.parseLong(br.readLine().trim())));
//                System.out.println(br.readLine());

                user.setMale(Boolean.parseBoolean(br.readLine()));
//                System.out.println(br.readLine());

                user.setCountry(User.Country.valueOf(br.readLine()));
//                System.out.println(br.readLine());

                users.add(user);
            }

            br.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
