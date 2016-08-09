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

public enum SimulatorState {
    Creating("Creating"),
    Booting("Booting"),
    ShuttingDown("Shutting Down"),
    Shutdown("Shutdown"),
    Booted("Booted");

    private final String state;

    SimulatorState(String state) {
        this.state = state;
    }

    public String state() {
        return state;
    }

    public static SimulatorState parseFromString(String state) {
        if(state.equals("Creating")) {
            return Creating;
        }
        else if(state.equals("Shutdown")) {
            return Shutdown;
        }
        else if(state.equals("Booting")) {
            return Booting;
        }
        else if(state.equals("Booted")) {
            return Booted;
        }
        else if(state.equals("Shutting Down")) {
            return ShuttingDown;
        }
        else {
            throw new RuntimeException("Unrecognized SimulatorInfo state: " + state);
        }
    }
}
