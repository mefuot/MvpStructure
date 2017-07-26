package com.pong.sample;

import com.pong.sample.data.SampleRepositories;
import com.pong.sample.data.SampleRepository;
import com.pong.sample.service.SampleServiceImpl;

/**
 * Created by User on 26/7/2560.
 */

public class Injection {
    public static SampleRepository provideSampleRepository() {
        return SampleRepositories.getRepository(new SampleServiceImpl());
    }
}
