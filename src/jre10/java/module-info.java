import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angulartouch.AngularTouchModule;
import com.jwebmp.plugins.angulartouch.AngularTouchPageConfigurator;
import com.jwebmp.plugins.angulartouch.implementations.AngularTouchExclusionsModule;

module com.jwebmp.plugins.angulartouch {
	exports com.jwebmp.plugins.angulartouch;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with AngularTouchPageConfigurator;
	provides IAngularModule with AngularTouchModule;

	provides IGuiceScanModuleExclusions with AngularTouchExclusionsModule;
	provides IGuiceScanJarExclusions with AngularTouchExclusionsModule;

}
