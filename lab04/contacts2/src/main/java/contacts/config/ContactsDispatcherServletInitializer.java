package contacts.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


// Dyspozytor

public class ContactsDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// Które ściezki obsługuje dyspozytor
	// w przypadku "/" ten dyspozytor obsługuje wszystkie ścieżki
	@Override
	protected String[] getServletMappings() {
		return null;
	}

	// Konfiguracja kontrolerów, producentów widoków i odwzorowań obsługi
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	// Konfiguracja komponentów warstwy pośredniej (logika biznesowa) i warstwy
	// danych
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

}