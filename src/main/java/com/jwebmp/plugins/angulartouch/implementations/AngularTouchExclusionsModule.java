package com.jwebmp.plugins.angulartouch.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularTouchExclusionsModule
		implements IGuiceScanModuleExclusions<AngularTouchExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angulartouch");
		return strings;
	}
}
