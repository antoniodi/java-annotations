import com.anthonydi.application.acl.Message;
import com.anthonydi.application.controllers.AppConfig;
import com.anthonydi.application.services.MovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext( AppConfig.class);

        final MovieService movieService = applicationContext.getBean( MovieService.class );
        final Message message = applicationContext.getBean( Message.class );

        movieService.findMovies().forEach( movie -> System.out.println( movie.toString() ) );
        System.out.println( message.getMessage() );

//        System.out.println( bdA.equals( bdB ) );


        ( ( AnnotationConfigApplicationContext ) applicationContext ).close();
    }
}
