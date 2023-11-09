package lk.ijse.spring.advisor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : Gathsara
 * created : 10/16/2023 -- 9:08 PM
 **/

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public ResponseUtil handleException(RuntimeException e) {
//        return new ResponseUtil("Error",e.getMessage(),"");
//    }

    public void handleException(RuntimeException e) {
        System.out.println(e.getMessage());
    }
}
