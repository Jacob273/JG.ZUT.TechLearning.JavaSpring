package sia.knights;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import sia.knights.Knight;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = KnightTestConfig.class, loader = AnnotationConfigContextLoader.class)
public class KnightJavaConfigInjectionTest {

	@Autowired
	Knight knight;

	@Rule
	public final StandardOutputStreamLog printStream = new StandardOutputStreamLog();
		
	@Test
	public void shouldInjectKnightWithSlayDragonQuest() {
		knight.embarkOnQuest();
		String expectedTextIncludingMinstrelAspect = "Tra la la; Jakis rycerz i jego kon BlackHorse sa dzielni!\r\n" + 
				"Wsiadam na konia i podejmuje misje pokonania smoka!\r\n" + 
				"Hip hip hura; Dzielny rycerz i jego kon BlackHorse wypelnili, misje!\r\n";
		String actual = printStream.getLog();
		
		assertEquals(expectedTextIncludingMinstrelAspect, actual);
	}

}
