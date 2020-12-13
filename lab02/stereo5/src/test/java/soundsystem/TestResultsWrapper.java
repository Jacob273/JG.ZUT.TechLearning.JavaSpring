package soundsystem;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import java.util.*;

@Component("testResultsWrapper")
public class TestResultsWrapper {
		
    public Map<String, String> musicProfiles = new HashMap<>();

    public TestResultsWrapper() {
    	musicProfiles.put("prod", "Playing Get rich or die trying by Fifty Cent");
        musicProfiles.put("dev",  "Playing Warrior Soundsystem by The Qemists");
        musicProfiles.put("test", "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles");
    }
}