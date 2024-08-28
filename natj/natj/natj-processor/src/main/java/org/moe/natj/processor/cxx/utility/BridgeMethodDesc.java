/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.natj.processor.cxx.utility;

import org.objectweb.asm.tree.MethodNode;

import java.util.Objects;

/**
 * This class contains bridge method information.
 */
public class BridgeMethodDesc {
    /**
     * Identifier.
     */
    public final String identifier;

    /**
     * Method node.
     */
    public final MethodNode node;

    /**
     * Invoked method descriptor.
     */
    public final String invokedDesc;

    /**
     * Creates a new BridgeMethodDesc.
     *
     * @param node        Method node
     * @param invokedDesc Invoked method descriptor
     */
    public BridgeMethodDesc(MethodNode node, String invokedDesc) {
        if (node == null) {
            throw new NullPointerException();
        }
        if (invokedDesc == null) {
            throw new NullPointerException();
        }
        identifier = node.name + "." + node.desc;
        this.node = node;
        this.invokedDesc = invokedDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BridgeMethodDesc that = (BridgeMethodDesc) o;
        return Objects.equals(identifier, that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }
}
