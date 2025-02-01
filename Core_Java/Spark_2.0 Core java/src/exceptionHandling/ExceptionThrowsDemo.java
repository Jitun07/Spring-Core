
package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    class ThrowTest{
        void m1() throws IOException
        {
            m2();

        }
        void m2() throws IOException
        {
            BufferedReader br=new BufferedReader(new FileReader(" :C/"));
        }
    }

    public class ExceptionThrowsDemo {
        public static void main(String[] args) throws IOException {
            ThrowTest tt=new ThrowTest();
            tt.m1();

        }
    }


