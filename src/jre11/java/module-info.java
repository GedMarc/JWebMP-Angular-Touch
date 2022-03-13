import com.jwebmp.plugins.angulartouch.implementations.AngularTouchModuleInclusions;

module com.jwebmp.plugins.angulartouch {
	exports com.jwebmp.plugins.angulartouch;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angular;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angulartouch.AngularTouchPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angulartouch.AngularTouchModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with AngularTouchModuleInclusions;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angulartouch.implementations.AngularTouchExclusionsModule;

}
