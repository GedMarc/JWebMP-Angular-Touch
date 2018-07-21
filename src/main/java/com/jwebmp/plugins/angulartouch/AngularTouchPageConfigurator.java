package com.jwebmp.plugins.angulartouch;

import com.jwebmp.core.Page;
import com.jwebmp.core.PageConfigurator;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular Touch",
		pluginDescription = "The ngTouch module provides helpers for touch-enabled devices. The implementation is based on jQuery Mobile touch event handling ",
		pluginUniqueName = "jwebswing-angular-touch",
		pluginVersion = "1.6.4",
		pluginCategories = "angular,touch, ui,web ui, framework",
		pluginSubtitle = "The ngTouch module provides helpers for touch-enabled devices.",
		pluginSourceUrl = "https://docs.angularjs.org/api/ngTouch",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Touch/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Touch",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://docs.angularjs.org/api/ngTouch",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularTouch.jar/download")
@ComponentInformation(name = "Angular Touch",
		description = "The ngTouch module provides helpers for touch-enabled devices.",
		url = "https://docs.angularjs.org/api/ngTouch")
public class AngularTouchPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularTouchPageConfigurator
	 */
	public AngularTouchPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(AngularTouchReferencePool.AngularTouch.getJavaScriptReference());
			page.getAngular()
			    .getAngularModules()
			    .add(new AngularTouchModule());
		}
		return page;
	}
}
