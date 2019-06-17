/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The asterisk component is used to interact with Asterisk PBX Server.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AsteriskEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Asterisk component.
     */
    public interface AsteriskEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedAsteriskEndpointConsumerBuilder advanced() {
            return (AdvancedAsteriskEndpointConsumerBuilder) this;
        }
        /**
         * Logical name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointConsumerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The hostname of the asterisk server.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointConsumerBuilder hostname(String hostname) {
            setProperty("hostname", hostname);
            return this;
        }
        /**
         * Login password.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointConsumerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Login username.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointConsumerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default AsteriskEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default AsteriskEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Asterisk component.
     */
    public interface AdvancedAsteriskEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AsteriskEndpointConsumerBuilder basic() {
            return (AsteriskEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedAsteriskEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedAsteriskEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedAsteriskEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedAsteriskEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Asterisk component.
     */
    public interface AsteriskEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedAsteriskEndpointProducerBuilder advanced() {
            return (AdvancedAsteriskEndpointProducerBuilder) this;
        }
        /**
         * Logical name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointProducerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The hostname of the asterisk server.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointProducerBuilder hostname(String hostname) {
            setProperty("hostname", hostname);
            return this;
        }
        /**
         * Login password.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointProducerBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Login username.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointProducerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * What action to perform such as getting queue status, sip peers or
         * extension state.
         * The option is a
         * <code>org.apache.camel.component.asterisk.AsteriskAction</code> type.
         * @group producer
         */
        default AsteriskEndpointProducerBuilder action(AsteriskAction action) {
            setProperty("action", action);
            return this;
        }
        /**
         * What action to perform such as getting queue status, sip peers or
         * extension state.
         * The option will be converted to a
         * <code>org.apache.camel.component.asterisk.AsteriskAction</code> type.
         * @group producer
         */
        default AsteriskEndpointProducerBuilder action(String action) {
            setProperty("action", action);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default AsteriskEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default AsteriskEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Asterisk component.
     */
    public interface AdvancedAsteriskEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AsteriskEndpointProducerBuilder basic() {
            return (AsteriskEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Asterisk component.
     */
    public interface AsteriskEndpointBuilder
            extends
                AsteriskEndpointConsumerBuilder, AsteriskEndpointProducerBuilder {
        default AdvancedAsteriskEndpointBuilder advanced() {
            return (AdvancedAsteriskEndpointBuilder) this;
        }
        /**
         * Logical name.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The hostname of the asterisk server.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointBuilder hostname(String hostname) {
            setProperty("hostname", hostname);
            return this;
        }
        /**
         * Login password.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Login username.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default AsteriskEndpointBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Asterisk component.
     */
    public interface AdvancedAsteriskEndpointBuilder
            extends
                AdvancedAsteriskEndpointConsumerBuilder, AdvancedAsteriskEndpointProducerBuilder {
        default AsteriskEndpointBuilder basic() {
            return (AsteriskEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedAsteriskEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.asterisk.AsteriskAction</code> enum.
     */
    enum AsteriskAction {
        QUEUE_STATUS,
SIP_PEERS,
EXTENSION_STATE;
    }
    /**
     * The asterisk component is used to interact with Asterisk PBX Server.
     * Creates a builder to build endpoints for the Asterisk component.
     */
    default AsteriskEndpointBuilder asterisk(String path) {
        class AsteriskEndpointBuilderImpl extends AbstractEndpointBuilder implements AsteriskEndpointBuilder, AdvancedAsteriskEndpointBuilder {
            public AsteriskEndpointBuilderImpl(String path) {
                super("asterisk", path);
            }
        }
        return new AsteriskEndpointBuilderImpl(path);
    }
}