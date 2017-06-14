package za.co.mmagon.jwebswing.plugins.angulartouch;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 *
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
        pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularTouch.jar/download"
)
@ComponentInformation(name = "Angular Touch",
        description = "The ngTouch module provides helpers for touch-enabled devices.",
        url = "https://docs.angularjs.org/api/ngTouch")
class AngularTouchPageConfigurator extends PageConfigurator
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
            JQueryPageConfigurator.setRequired(page.getBody(), true);
            AngularPageConfigurator.setRequired(page.getBody(), true);
            page.getBody().addJavaScriptReference(AngularTouchReferencePool.AngularTouch.getJavaScriptReference());
            page.getAngular().getAngularModules().add(new AngularTouchModule());
        }
        return page;
    }
}
