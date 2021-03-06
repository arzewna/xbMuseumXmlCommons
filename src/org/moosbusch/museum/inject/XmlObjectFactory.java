/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moosbusch.museum.inject;

import org.apache.xmlbeans.ObjectFactory;
import org.apache.xmlbeans.XmlObject;

/**
 *
 * @author moosbusch
 */
public interface XmlObjectFactory<M extends XmlModule, R extends XmlObject>
        extends ObjectFactory {

    public M getModule();

    public XmlInjector getInjector();

    public <X extends XmlObject> void injectChildMembers(X entity);

    public <X extends XmlObject> X createTypedObject(Class<X> type);

    public R createRootElement();

    public void registerXmlPostProcessor(Class<? extends XmlObject> targetClass,
            XmlPostProcessor<? extends XmlObject> p);

    public void unregisterXmlPostProcessor(Class<? extends XmlObject> targetClass);
}
