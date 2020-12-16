package com.jwebmp.plugins.angulartouch;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular Touch",
		pluginDescription = "The ngTouch module provides helpers for touch-enabled devices. The implementation is based on jQuery Mobile touch event handling ",
		pluginUniqueName = "jwebswing-angular-touch",
		pluginVersion = "1.8.2",
		pluginCategories = "angular,touch, ui,web ui, framework",
		pluginSubtitle = "The ngTouch module provides helpers for touch-enabled devices.",
		pluginSourceUrl = "https://docs.angularjs.org/api/ngTouch",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Angular-Touch/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Angular-Touch",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://docs.angularjs.org/api/ngTouch",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.angular/jwebmp-angular-touch",
		pluginGroupId = "com.jwebmp.plugins.angular",
		pluginArtifactId = "jwebmp-angular-touch",
		pluginModuleName = "com.jwebmp.plugins.angulartouch",
		pluginStatus = PluginStatus.Released
)
@ComponentInformation(name = "Angular Touch",
		description = "The ngTouch module provides helpers for touch-enabled devices.",
		url = "https://docs.angularjs.org/api/ngTouch")
public class AngularTouchPageConfigurator
		implements IPageConfigurator<AngularTouchPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularTouchPageConfigurator
	 */
	public AngularTouchPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularTouchPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularTouchPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(AngularTouchReferencePool.AngularTouch.getJavaScriptReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularTouchPageConfigurator.enabled;
	}
}
