/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xslt;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class XsltComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XsltComponent target = (XsltComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "transformerfactoryclass":
        case "transformerFactoryClass": target.setTransformerFactoryClass(property(camelContext, java.lang.String.class, value)); return true;
        case "transformerfactoryconfigurationstrategy":
        case "transformerFactoryConfigurationStrategy": target.setTransformerFactoryConfigurationStrategy(property(camelContext, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class, value)); return true;
        case "uriresolver":
        case "uriResolver": target.setUriResolver(property(camelContext, javax.xml.transform.URIResolver.class, value)); return true;
        case "uriresolverfactory":
        case "uriResolverFactory": target.setUriResolverFactory(property(camelContext, org.apache.camel.component.xslt.XsltUriResolverFactory.class, value)); return true;
        default: return false;
        }
    }

}

