package soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes=CDPlayerConfig.class)
@RunWith(SpringJUnit4ClassRunner.class) 
public class CDPlayerTest {

  @Rule
  public final StandardOutputStreamLog log = new StandardOutputStreamLog();

  @Autowired 
  private MediaPlayer player;
   
  @Test
  public void playAsExpectedTest1() {
    player.play();
    assertEquals(
        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", 
        log.getLog());
  }
  
  @Test
  public void playisNotEmptyTest2() {
    player.play();
    String message = log.getLog();
    boolean notNullAndNotempty = message != null && !message.isEmpty();
    assertEquals(notNullAndNotempty, true);
  }
  

}
