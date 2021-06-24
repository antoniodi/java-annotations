import com.anthonydi.application.services.MovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext( "beans.xml" );

        final MovieService movieService = applicationContext.getBean( MovieService.class );

        movieService.findMovies().forEach( movie -> System.out.println( movie.toString() ) );

//        System.out.println( bdA.equals( bdB ) );


        ( ( ClassPathXmlApplicationContext ) applicationContext ).close();
    }
}
