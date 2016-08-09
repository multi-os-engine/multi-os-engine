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

package org.moe.common.simulator;

public class Simulator {
    private String name;
    private String udid;
    private String sdk;

    private SimulatorState state;

    public Simulator() {
    }

    public static Simulator builder() {
        return new Simulator();
    }

    public String name() {
        return name;
    }

    public Simulator name(String name) {
        this.name = name;
        return this;
    }

    public String udid() {
        return udid;
    }

    public Simulator udid(String udid) {
        this.udid = udid;
        return this;
    }

    public String sdk() {
        return sdk;
    }

    public Simulator sdk(String sdk) {
        this.sdk = sdk;
        return this;
    }

    public SimulatorState state() {
        return state;
    }

    public Simulator state(String state) {
        this.state = SimulatorState.parseFromString(state);
        return this;
    }
}
