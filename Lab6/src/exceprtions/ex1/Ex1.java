package exceprtions.ex1;

public class Ex1 {

    public static void main(String[] args) throws Exception{
        try{
            m1();
        }catch (NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("In finally");
        }
    }

    static void m1() throws Exception{
        System.out.println("in m1");
        m2();

        throw new Exception();

    }
    static void m2(){
        System.out.println("in m2");
        throw new RuntimeException("exceprion in m2");
        //m3();
    }
    static void m3(){
        System.out.println("in m3");
        // throws null pointer exception
        Object o = null;
        o.toString();
    }
}

/*
callstack:

m3()
m2()
m1()
main()


try{} catch{} finally{}

java.lang -> Throwable
                    Error
                        OutOfMemeryException
                        StackOverflowException
                    Exception
                        RuntimeException -> unchecked exceptions
                            java.lang, NPE, ArithmeticException, IllegalArgumentException(NumberFormatException), ClassCastException
                        other exceptions -> checked exceptions
                            IOException , SqlException
                                FileNotFoundException

 */
