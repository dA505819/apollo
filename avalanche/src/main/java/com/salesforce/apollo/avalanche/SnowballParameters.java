/*
 * Copyright (c) 2019, salesforce.com, inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */

package com.salesforce.apollo.avalanche;

import java.util.concurrent.TimeUnit;

/**
 * @author hhildebrand
 *
 */
public class SnowballParameters {
    /**
     * The percentage of sampled members that determine a decision for a color
     */
    public float alpha;

    /**
     * The interval between queries
     */
    public long     interval;
    public TimeUnit intervalUnit;

    /**
     * The number of retries when a round of query communication fails to get the
     * required number of responses
     */
    public int retries;

    /**
     * The number of members, out of the known population, to sample with queries
     */
    public int sample;
    
    public int beta;

    /**
     * The timeout of the query communication of a round
     */
    public long     timeout;
    public TimeUnit unit;
}
