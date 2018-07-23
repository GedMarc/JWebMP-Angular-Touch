import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angulartouch.AngularTouchModule;
import com.jwebmp.plugins.angulartouch.AngularTouchPageConfigurator;

module com.jwebmp.plugins.angulartouch {
	exports com.jwebmp.plugins.angulartouch;

	requires com.jwebmp.core;
	provides IPageConfigurator with AngularTouchPageConfigurator;
	provides IAngularModule with AngularTouchModule;

}
