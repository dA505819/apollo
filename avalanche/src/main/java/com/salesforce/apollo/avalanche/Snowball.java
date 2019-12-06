/*
 * Copyright (c) 2019, salesforce.com, inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */
package com.salesforce.apollo.avalanche;

import java.util.HashMap;
import java.util.Map;

import com.salesforce.apollo.fireflies.View;

/**
 * 
 * @author hhildebrand
 *
 */
public class Snowball {

    public class Instance {
        private final Map<Integer, Integer> confidence = new HashMap<>();
        private volatile int                count      = 0;
        private volatile int                lastValue;
        private volatile boolean            undecided  = true;
    }

    private final SnowballParameters parameters;
    private final ViewSampler        querySampler;
    private final View               view;

    public Snowball(View view, ViewSampler querySampler, SnowballParameters parameters) {
        this.view = view;
        this.querySampler = querySampler;
        this.parameters = parameters;
    }
}
