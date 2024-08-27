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

package org.moe.natj.general;

import org.moe.natj.c.StructObject;

/**
 * Wrapper class for variadic argument.
 *
 * <p>
 * Wrap a variadic argument with one of this class' children to force a specific
 * conversion on it.
 */
public class VariadicArg {

    protected Object instance;

    public Object getInstance() {
        return instance;
    }

    protected VariadicArg(Object instance) {
        this.instance = instance;
    }

    /**
     * Creates a wrapper for explicit mapping.
     */
    public static MapVariadicArg createMap(Object instance, Class<? extends Mapper> mapper) {
        return new MapVariadicArg(instance, mapper);
    }

    /**
     * Creates a wrapper for explicit boxing.
     *
     * <p>
     * Boxing means boxed values will be left alone.
     */
    public static BoxVariadicArg createBox(Object instance) {
        return new BoxVariadicArg(instance);
    }

    /**
     * Creates a wrapper for explicit unboxing.
     *
     * <p>
     * Boxing means boxed values will be unboxed.
     */
    public static UnboxVariadicArg createUnbox(Object instance) {
        return new UnboxVariadicArg(instance);
    }

    /**
     * Creates a wrapper for explicit native word sized float.
     */
    public static NFloatVariadicArg createNFloat(Double d) {
        return new NFloatVariadicArg(d);
    }

    /**
     * Creates a wrapper for explicit native word sized unsigned integer.
     */
    public static NUIntVariadicArg createNUInt(Long l) {
        return new NUIntVariadicArg(l);
    }

    /**
     * Creates a wrapper for explicit native word sized signed integer.
     */
    public static NIntVariadicArg createNInt(Long l) {
        return new NIntVariadicArg(l);
    }

    /**
     * Creates a wrapper for explicit native wchar_t type.
     */
    public static WCharTVariadicArg createWCharT(Integer d) {
        return new WCharTVariadicArg(d);
    }

    /**
     * Creates a wrapper for explicit native unsigned long type.
     */
    public static NULongVariadicArg createNULong(Long l) {
        return new NULongVariadicArg(l);
    }

    /**
     * Creates a wrapper for explicit native signed long type.
     */
    public static NLongVariadicArg createNLong(Long l) {
        return new NLongVariadicArg(l);
    }

    /**
     * Creates a wrapper for explicit by-value structure.
     *
     * <p>
     * By-value means the structure is passed on the stack and not as a reference.
     */
    public static ByValueVariadicArg createByValue(StructObject s) {
        return new ByValueVariadicArg(s);
    }

    public static final class MapVariadicArg extends VariadicArg {

        private Class<? extends Mapper> mapper;

        public Class<? extends Mapper> getMapper() {
            return mapper;
        }

        private MapVariadicArg(Object instance, Class<? extends Mapper> mapper) {
            super(instance);
            this.mapper = mapper;
        }

    }

    public static final class BoxVariadicArg extends VariadicArg {

        private BoxVariadicArg(Object instance) {
            super(instance);
        }

    }

    public static final class UnboxVariadicArg extends VariadicArg {

        private UnboxVariadicArg(Object instance) {
            super(instance);
        }

    }

    public static final class NFloatVariadicArg extends VariadicArg {

        public double getNFloat() {
            return ((Double) instance).doubleValue();
        }

        private NFloatVariadicArg(Double d) {
            super(d);
        }

    }

    public static final class NUIntVariadicArg extends VariadicArg {

        public long getNUInt() {
            return ((Long) instance).longValue();
        }

        private NUIntVariadicArg(Long l) {
            super(l);
        }

    }

    public static final class NIntVariadicArg extends VariadicArg {

        public long getNInt() {
            return ((Long) instance).longValue();
        }

        private NIntVariadicArg(Long l) {
            super(l);
        }

    }

    public static final class WCharTVariadicArg extends VariadicArg {

        public int getWCharT() {
            return ((Integer) instance).intValue();
        }

        private WCharTVariadicArg(Integer d) {
            super(d);
        }

    }

    public static final class NULongVariadicArg extends VariadicArg {

        public long getNULong() {
            return ((Long) instance).longValue();
        }

        private NULongVariadicArg(Long l) {
            super(l);
        }

    }

    public static final class NLongVariadicArg extends VariadicArg {

        public long getNLong() {
            return ((Long) instance).longValue();
        }

        private NLongVariadicArg(Long l) {
            super(l);
        }

    }

    public static final class ByValueVariadicArg extends VariadicArg {

        private ByValueVariadicArg(StructObject s) {
            super(s);
        }

    }
}
