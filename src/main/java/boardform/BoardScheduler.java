package boardform;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;

public class BoardScheduler {
    @Scheduled(* * 1 * * *)
    void boardscheduled(){

    }
}
