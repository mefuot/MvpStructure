package com.pong.sample;

import com.pong.sample.data.SampleRepositories;
import com.pong.sample.data.SampleRepository;

/**
 * Created by User on 26/7/2560.
 */

public class Injection {
    public static SampleRepository provideSampleRepository() {
        return SampleRepositories.getRepository(new MockSampleService());
    }
}
