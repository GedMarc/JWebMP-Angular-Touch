package za.co.mmagon.jwebswing.plugins.angulartouch;

import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
class AngularTouchModule extends AngularModuleBase
{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * Constructs a new AngularTouchModule
	 */
	public AngularTouchModule()
	{
		super("ngTouch");
	}
	
	@Override
	public String renderFunction()
	{
		return null;
	}
}
