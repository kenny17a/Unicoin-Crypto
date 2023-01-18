package africa.semicolon.unicoin.registration.token;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@EnableScheduling
@RequiredArgsConstructor
public class DeleteExpiredTokenScheduler {
    @Autowired
    private ConfirmationTokenService confirmationTokenService;


    public void deleteExpiredToken(){
        System.out.println("Deleted");
        confirmationTokenService.deleteExpiredToken();

    }
}
