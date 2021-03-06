/*
 * generated by Xtext 2.12.0
 */
package fi.tucs.entities.ui;

import com.google.inject.Injector;
import fi.tucs.entities.ui.internal.EntitiesActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EntitiesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EntitiesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EntitiesActivator.getInstance().getInjector(EntitiesActivator.FI_TUCS_ENTITIES_ENTITIES);
	}
	
}
