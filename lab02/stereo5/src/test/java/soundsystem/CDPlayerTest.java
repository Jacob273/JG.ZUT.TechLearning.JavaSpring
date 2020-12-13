package soundsystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {SpringBaseConfiguration.class,
								SpringTestConfiguration.class, 
								SpringDevConfiguration.class, 
		                        SpringProdConfiguration.class,
		                        SpringInternalTestConfiguration.class})
@ActiveProfiles("test")
public class CDPlayerTest {

	
	  @Value("${spring.profiles.active:Unknown}")
	  private String activeProfile;
	
	  @Value("#{testResultsWrapper.musicProfiles['prod']}")
	  private String expectedTextToBePlayedOnProduction;
	  
	  @Value("#{testResultsWrapper.musicProfiles['dev']}")
	  private String expectedTextToBePlayedOnDev;
	  
	  @Value("#{testResultsWrapper.musicProfiles['test']}")
	  private String expectedTextToBePlayedOnTest;
	  
	  @Rule
	  public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	  @Autowired 
	  private MediaPlayer player;
	  	  
	  //Test for all spring profiles (dev,test,prod)
	  @Test
	  public void test1_playAndVerifyTitleAndArtistOnOutputStream() {
		
		player.play();
		String played = log.getLog();
		switch(activeProfile) 
		{
			case "test":
			{
				assertEquals(expectedTextToBePlayedOnTest, played);
			}
			case "prod":
			{
				assertEquals(expectedTextToBePlayedOnProduction, played);
				break;
			}
			case "dev":
			{
				assertEquals(expectedTextToBePlayedOnDev, played);
				break;
			}
		}
	  }
	  
	  //Global Test which should pass for all profiles
	  @Test
	  public void test2_playAndVerifyIfOutputStreamIsNotEmptyOrNull() {
	    player.play();
	    String message = log.getLog();
	    boolean notNullAndNotempty = message != null && !message.isEmpty();
	    assertEquals(notNullAndNotempty, true);
	    System.out.print("played: " + message);
	  }  
	  
	//Global Test which should pass for all profiles
	  @Test
	  public void test3_checkIfDiscHasAtleastOneTrack() {
	    int trackCount = player.trackCount();
	    boolean hasAtleastOne = trackCount > 0;
	    assertEquals(hasAtleastOne, true);
	    System.out.print("trackCount: " + trackCount);
	  }  
	  
	//Global Test which should pass for all profiles
	  @Test
	  public void test4_TrackTitlesAreNotNulls() {
		  //for debugging purposes
	    List<String> tracksTitles = player.getTrackTitles();
	    
	    for(String title: tracksTitles)
	    {
	    	assertNotNull(title);
	        System.out.println("title: " + title);
	    }
	  }  

}
