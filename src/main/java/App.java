import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext( "beans.xml" );

//         var a = ( Saludator ) applicationContext.getBean( "saludator" );
//         var a = applicationContext.getBean( "saludator", Saludator.class );
//         var a = applicationContext.getBean( Saludator.class );
//        var emailService = applicationContext.getBean(  );

//        System.out.println( "Hola bebe " + emailService.sendEmail( applicationContext ) );

        Double saldo = 1428058.26;
        String saldoString = String.format( "%.2f", saldo ).replace( ",", "." );
        String saldoStringWithReplace = saldoString.replace( ",", "." );

        System.out.println( "a.equals(b)" );

//        System.out.println( bdA.equals( bdB ) );


//        ( ( ClassPathXmlApplicationContext ) applicationContext ).close();
    }
}
