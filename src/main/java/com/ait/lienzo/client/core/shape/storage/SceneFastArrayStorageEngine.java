/*
 * Copyright (c) 2018 Ahome' Innovation Technologies. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ait.lienzo.client.core.shape.storage;

import com.ait.lienzo.client.core.config.LienzoCore;
import com.ait.lienzo.client.core.shape.Layer;
import com.ait.lienzo.client.core.shape.json.IFactory;
import com.ait.lienzo.client.core.shape.json.IJSONSerializable;
import com.ait.lienzo.client.core.shape.json.validators.ValidationContext;
import com.ait.lienzo.client.core.shape.json.validators.ValidationException;
import com.google.gwt.json.client.JSONObject;

public class SceneFastArrayStorageEngine extends AbstractFastArrayStorageEngine<Layer> implements IJSONSerializable<SceneFastArrayStorageEngine>
{
    public SceneFastArrayStorageEngine()
    {
        super(StorageEngineType.SCENE_FAST_ARRAY_STORAGE_ENGINE);
    }

    protected SceneFastArrayStorageEngine(final JSONObject node, final ValidationContext ctx) throws ValidationException
    {
        super(StorageEngineType.SCENE_FAST_ARRAY_STORAGE_ENGINE, node, ctx);
    }

    @Override
    public IFactory<?> getFactory()
    {
        return LienzoCore.get().getFactory(getStorageEngineType());
    }

    public static class SceneFastArrayStorageEngineFactory extends FastArrayStorageEngineFactory<SceneFastArrayStorageEngine>
    {
        public SceneFastArrayStorageEngineFactory()
        {
            super(StorageEngineType.SCENE_FAST_ARRAY_STORAGE_ENGINE);
        }

        @Override
        public SceneFastArrayStorageEngine create(final JSONObject node, final ValidationContext ctx) throws ValidationException
        {
            return new SceneFastArrayStorageEngine(node, ctx);
        }
    }
}
