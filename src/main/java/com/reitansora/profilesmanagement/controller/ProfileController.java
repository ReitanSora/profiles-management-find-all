package com.reitansora.profilesmanagement.controller;


import com.reitansora.profilesmanagement.entity.ProfileEntity;
import com.reitansora.profilesmanagement.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    /**
     * Retrieves all profiles.
     *
     * @return a list of all profiles
     */
    @GetMapping(path = "/find")
    public ArrayList<ProfileEntity> getAllProfiles(){
        return this.profileService.getAllProfiles();
    }

}
