package com.stidham.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by peterjocham on 5/24/16.
 */
@Controller
public class DeviceDetection {

    private Logger logger = LoggerFactory.getLogger(DeviceDetection.class);

    @RequestMapping(value="/index")
    public String detectDevice(Device device) {

        if (device.isNormal()) {
            System.out.println("Inside isNormal()");
            return "index";
        } else if (device.isMobile()) {
            System.out.println("Inside isMobile()");
            return "mobilePage";
        } else if (device.isTablet()) {
            return "mobilePage";
        }
        return "index";
    }

}
